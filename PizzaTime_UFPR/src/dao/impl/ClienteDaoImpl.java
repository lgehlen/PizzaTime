/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import cliente.Cliente;
import dao.ClienteDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gehlen
 */
public class ClienteDaoImpl implements ClienteDao {

    private Connection con;

    public ClienteDaoImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserirCliente(Cliente c) {
        PreparedStatement st = null;
        try {
            st = con.prepareStatement("insert into tb_pessoa (nomePessoa, sobrenomePessoa, telefone, endereco) values (?, ?, ?, ?)");
            st.setString(1, c.getNome());
            st.setString(2, c.getSobrenome());
            st.setString(3, c.getTelefone());
            st.setString(4, c.getEndereco());
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
    public void atualizarCliente(Cliente c) {
        PreparedStatement st = null;
        try {
            st = con.prepareStatement("update tb_pessoa set nomePessoa = ?, sobrenomePessoa = ?, telefone = ?, endereco = ?"
                    + " where codPessoa = ?");
            st.setString(1, c.getNome());
            st.setString(2, c.getSobrenome());
            st.setString(3, c.getTelefone());
            st.setString(4, c.getEndereco());
            st.setString(5, Integer.toString(c.getId()));
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
    public void removerCliente(int id) {
        PreparedStatement st = null;
        try {
            st = con.prepareStatement("delete from tb_pessoa where codPessoa = ?");
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
    public List<Cliente> filtrarClienteSobrenome(String s) {
        return filtroGenerico(s, "select codPessoa, nomePessoa, sobrenomePessoa, telefone, endereco from tb_pessoa where sobrenomePessoa = ?");
    }

    @Override
    public List<Cliente> filtrarClienteParteSobrenome(String s) {
        return filtroGenerico("%" + s + "%", "select codPessoa, nomePessoa, sobrenomePessoa, telefone, endereco from tb_pessoa where sobrenomePessoa LIKE ?");
    }

    @Override
    public List<Cliente> filtrarClienteTelefone(String s) {
        return filtroGenerico(s, "select codPessoa, nomePessoa, sobrenomePessoa, telefone, endereco from tb_pessoa where telefone = ?");
    }

    @Override
    public List<Cliente> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Cliente> lista = new ArrayList<Cliente>();
        try {
            st = con.prepareStatement("select codPessoa, nomePessoa, sobrenomePessoa, telefone, endereco from tb_pessoa");
            rs = st.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(Integer.parseInt(rs.getString("codPessoa")));
                c.setNome(rs.getString("nomePessoa"));
                c.setSobrenome(rs.getString("sobrenomePessoa"));
                c.setTelefone(rs.getString("telefone"));
                c.setEndereco(rs.getString("endereco"));
                lista.add(c);
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
    public List<Cliente> filtroGenerico(String s, String sql) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Cliente> lista = new ArrayList<Cliente>();
        try {
            st = con.prepareStatement(sql);
            st.setString(1, s);
            rs = st.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(Integer.parseInt(rs.getString("codPessoa")));
                c.setNome(rs.getString("nomePessoa"));
                c.setSobrenome(rs.getString("sobrenomePessoa"));
                c.setTelefone(rs.getString("telefone"));
                c.setEndereco(rs.getString("endereco"));
                lista.add(c);
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
