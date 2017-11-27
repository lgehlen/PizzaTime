/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import cliente.Cliente;
import java.util.List;

/**
 *
 * @author Gehlen
 */
public interface ClienteDao {
    public void inserirCliente(Cliente c);
    public void atualizarCliente(Cliente c);
    public void removerCliente(int id);
    public List<Cliente> filtrarClienteSobrenome(String s);
    public List<Cliente> filtrarClienteParteSobrenome(String s);
    public List<Cliente> filtrarClienteTelefone(String s);
    public List<Cliente> buscarTodos();
    public List<Cliente> filtroGenerico(String s, String sql);
}
