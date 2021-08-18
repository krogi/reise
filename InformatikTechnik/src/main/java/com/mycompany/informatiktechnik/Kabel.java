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
public class Kabel extends Technik {
    private double laenge;

    public Kabel(double laenge, String name, String beschreibung, int mps) {
        super(name, beschreibung, mps);
        this.laenge = laenge;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }
    
    
    
}
