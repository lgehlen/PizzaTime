/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import sabor.Sabor;

/**
 *
 * @author Gehlen
 */
public interface SaborDao {
    public void inserirSabor(Sabor s);
    public void removerSabor(int id);
    public List<Sabor> buscarTodos();
    public List<Sabor> buscarParcial(String nome);
}
