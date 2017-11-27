/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Gehlen
 */
public interface TipoDao {
    public float getPrecoSimples();
    public float getPrecoEspecial();
    public float getPrecoPremium();
    public void setPrecoSimples(Float f);
    public void setPrecoEspecial(Float f);
    public void setPrecoPremium(Float f);
}
