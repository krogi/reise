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
public class Pult extends Technik{
    private int kanaele;

    public Pult(int kanaele, String name, String beschreibung, int mps) {
        super(name, beschreibung, mps);
        this.kanaele = kanaele;
    }

    public int getKanaele() {
        return kanaele;
    }

    public void setKanaele(int kanaele) {
        this.kanaele = kanaele;
    }
    
    
}
