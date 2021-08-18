/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.informatiktechnik;

import com.mycompany.informatiktechnik.Personen;

/**
 *
 * @author jorda
 */
public abstract class Kunde extends Personen {
    private String adresse;

    public Kunde(String adresse, String name, String vorname) {
        super(name, vorname);
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    
}
