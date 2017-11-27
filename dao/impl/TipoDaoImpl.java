/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import cliente.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import dao.TipoDao;

/**
 *
 * @author Gehlen
 */
public class TipoDaoImpl implements TipoDao {

    private Connection con;

    public TipoDaoImpl(Connection con) {
        this.con = con;
    }

    @Override
    public float getPrecoSimples() {
        return getDefault("Simples");
    }

    @Override
    public float getPrecoEspecial() {
        return getDefault("Especial");
    }

    @Override
    public float getPrecoPremium() {
        return getDefault("Premium");
    }

    @Override
    public void setPrecoSimples(Float f) {
        setDefault(f, "Simples");
    }

    @Override
    public void setPrecoEspecial(Float f) {
        setDefault(f, "Especial");
    }

    @Override
    public void setPrecoPremium(Float f) {
        setDefault(f, "Premium");
    }

    public float getDefault(String s) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = con.prepareStatement("select preco_tipo from tb_tipopizza where nome_tipo = ?");
            st.setString(1, s);
            rs = st.executeQuery();
            while (rs.next()) {
                return rs.getFloat("preco_tipo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception ex) {
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (Exception ex) {
                }
            }
        }
        return 0;
    }

    public void setDefault(Float f, String s) {
        PreparedStatement st = null;
        try {
            st = con.prepareStatement("update tb_tipopizza set preco_tipo = ? where nome_tipo = ?");
            st.setFloat(1, f);
            st.setString(2, s);
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (Exception ex) {
                }
            }
        }
    }

}
