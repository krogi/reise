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
public class Boxen extends Technik {
    private double gewicht;

    public Boxen(double gewicht, String name, String beschreibung, int mps) {
        super(name, beschreibung, mps);
        this.gewicht = gewicht;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
    
    
    
}