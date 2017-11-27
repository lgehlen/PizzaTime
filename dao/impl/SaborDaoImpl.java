/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import cliente.Cliente;
import dao.SaborDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sabor.Sabor;

/**
 *
 * @author Gehlen
 */
public class SaborDaoImpl implements SaborDao {

    private Connection con;

    public SaborDaoImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserirSabor(Sabor s) {
        PreparedStatement st = null;
        try {
            st = con.prepareStatement("insert into tb_sabor(nome_sabor, tipo_sabor) values (?, ?)");
            st.setString(1, s.getNome());
            st.setString(2, Integer.toString(s.getTipo()));
            int rowsAffected = st.executeUpdate();
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

    @Override
    public void removerSabor(int id) {
        PreparedStatement st = null;
        try {
            st = con.prepareStatement("delete from tb_sabor where id_sabor = ?");
            st.setString(1, Integer.toString(id));
            int rowsAffected = st.executeUpdate();
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

    @Override
    public List<Sabor> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Sabor> lista = new ArrayList<Sabor>();
        try {
            st = con.prepareStatement("select id_sabor, nome_sabor, tipo_sabor from tb_sabor");
            rs = st.executeQuery();
            while (rs.next()) {
                Sabor s = new Sabor();
                s.setId(Integer.parseInt(rs.getString("id_sabor")));
                s.setNome(rs.getString("nome_sabor"));
                s.setTipo(Integer.parseInt(rs.getString("tipo_sabor")));
                lista.add(s);
            }
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
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
    }

    @Override
    public List<Sabor> buscarParcial(String nome) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Sabor> lista = new ArrayList<Sabor>();
        try {
            st = con.prepareStatement("select id_sabor, nome_sabor, tipo_sabor from tb_sabor where nome_sabor LIKE ?");
            st.setString(1, "%" + nome + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                Sabor s = new Sabor();
                s.setId(Integer.parseInt(rs.getString("id_sabor")));
                s.setNome(rs.getString("nome_sabor"));
                s.setTipo(Integer.parseInt(rs.getString("tipo_sabor")));
                lista.add(s);
            }
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
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
    }

}
