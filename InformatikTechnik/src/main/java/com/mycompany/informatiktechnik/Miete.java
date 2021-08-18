/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.informatiktechnik;

import java.time.LocalDateTime;

/**
 *
 * @author jorda
 */
public class Miete {
    
    private int starttermin;
    private int endtermin;
    private double kosten;
    private Technik technik;
    private Kunde kunde;

    public Miete(int starttermin, int endtermin, double kosten, Technik technik, Kunde kunde) {
        this.starttermin = starttermin;
        this.endtermin = endtermin;
        this.kosten = kosten;
        this.technik = technik;
        this.kunde = kunde;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public int getStarttermin() {
        return starttermin;
    }

    public void setStarttermin(int starttermin) {
        this.starttermin = starttermin;
    }

    public int getEndtermin() {
        return endtermin;
    }

    public void setEndtermin(int endtermin) {
        this.endtermin = endtermin;
    }

    public double getKosten() {
        return kosten;
    }

    public void setKosten(double kosten) {
        this.kosten = kosten;
    }

    public Technik getTechnik() {
        return technik;
    }

    public void setTechnik(Technik technik) {
        this.technik = technik;
    }
    
    
    
    
    
    
    
    
    
    
    
}
