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
public class Geschaeftskunde extends Kunde {
    private String firma;
    private Techniker techniker;

    public Geschaeftskunde(String firma, Techniker techniker, String adresse, String name, String vorname) {
        super(adresse, name, vorname);
        this.firma = firma;
        this.techniker = techniker;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public Techniker getTechniker() {
        return techniker;
    }

    public void setTechniker(Techniker techniker) {
        this.techniker = techniker;
    }
    
}
