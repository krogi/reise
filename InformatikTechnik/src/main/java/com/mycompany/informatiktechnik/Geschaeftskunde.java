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
    public Geschaeftskunde(String firma, String adresse, String name, String vorname) {
        super(adresse, name, vorname);
        this.firma = firma;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
    
    
    
}
