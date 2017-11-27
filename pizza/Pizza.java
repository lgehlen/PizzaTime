/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.List;

/**
 *
 * @author Gehlen
 */
public class Pizza {
    private int id;
    private int sabor1;
    private int sabor2;
    private float tamaho;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSabor1() {
        return sabor1;
    }

    public void setSabor1(int sabor1) {
        this.sabor1 = sabor1;
    }

    public int getSabor2() {
        return sabor2;
    }

    public void setSabor2(int sabor2) {
        this.sabor2 = sabor2;
    }

    public float getTamaho() {
        return tamaho;
    }

    public void setTamaho(float tamaho) {
        this.tamaho = tamaho;
    }
}
