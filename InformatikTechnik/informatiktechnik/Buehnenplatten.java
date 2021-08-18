/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.informatiktechnik;

/**
 *
 * @author jorda
 */
public class Buehnenplatten extends Technik {
    private int maße;

    public Buehnenplatten(int maße, String name, String beschreibung, int mps) {
        super(name, beschreibung, mps);
        this.maße = maße;
    }

    public int getMaße() {
        return maße;
    }

    public void setMaße(int maße) {
        this.maße = maße;
    }
    
    
}