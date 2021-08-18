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
public abstract class Technik {
    private String name;
    private String beschreibung;
    private int mps;

    public Technik(String name, String beschreibung, int mps) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.mps = mps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getMps() {
        return mps;
    }

    public void setMps(int mps) {
        this.mps = mps;
    }
    
    
    
}
