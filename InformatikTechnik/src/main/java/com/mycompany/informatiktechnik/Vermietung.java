/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.informatiktechnik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jorda
 */
public class Vermietung {
    private Techniker techniker;
    private Kunde kunde;
    private static ArrayList<Technik> technik;
    private static HashMap vermietungen;
    
    
    public Vermietung(Techniker techniker, Kunde kunde) {
        this.techniker = techniker;
        this.kunde = kunde;
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

    public static ArrayList<Technik> getTechnik() {
        return technik;
    }

    public static void setTechnik(ArrayList<Technik> technik) {
        Vermietung.technik = technik;
    }

    public static HashMap getVermietungen() {
        return vermietungen;
    }

    public static void setVermietungen(HashMap vermietungen) {
        Vermietung.vermietungen = vermietungen;
    }
}