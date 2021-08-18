/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.informatiktechnik;

import com.mycompany.informatiktechnik.Kunde;

/**
 *
 * @author jorda
 */
public class Privatkunde extends Kunde{
    private Techniker techniker;

    public Privatkunde(Techniker techniker, String adresse, String name, String vorname) {
        super(adresse, name, vorname);
        this.techniker = techniker;
    }

    public Techniker getTechniker() {
        return techniker;
    }

    public void setTechniker(Techniker techniker) {
        this.techniker = techniker;
    }

    


    
    
}
