/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.informatiktechnik;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jorda
 */
public class Vermietung {
    private Techniker techniker;
    private Kunde kunde;
    private Technik technik;
    private HashMap bestand;


    public Vermietung(Techniker techniker, Kunde kunde, Technik technik) {
        this.techniker = techniker;
        this.kunde = kunde;
        this.technik = technik;
        
        //HashMap mit allen vmietbaren Materialien des Unternehmens
        bestand = new HashMap<Technik, Integer>();
        
        
        Boxen b1 = new Boxen(10, "b", "ab", 70);
        Buehnenplatten bue1 = new Buehnenplatten(2, "a", "b", 300);
        Kabel k1 = new Kabel(3, "a", "b", 400);
        Pult p1 = new Pult(4, "a", "b", 65);
        
        
        getBestand().put(b1, 20);
        getBestand().put(bue1, 20);
        getBestand().put(k1, 30);
        getBestand().put(p1, 40);
        System.out.println(getBestand().get(b1));
        
    }

    public Techniker getTechniker() {
        return techniker;
    }

    public void setTechniker(Techniker techniker) {
        this.techniker = techniker;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Technik getTechnik() {
        return technik;
    }

    public void setTechnik(Technik technik) {
        this.technik = technik;
    }

    public HashMap getBestand() {
        return bestand;
    }

    public void setBestand(HashMap bestand) {
        this.bestand = bestand;
    }
     
}