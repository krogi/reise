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
 * @author pauli
 */
public class Main {
    
    private Vermietung vermietung;
    private ArrayList vermietungen;
    private HashMap uebersicht;
    private Techniker techniker;
    private Kunde kunde;
    private Technik technik;
    
    public Main() {
        //ArrayList in der alle Vermietungen aufgelistet werden
        this.vermietungen = new ArrayList<>();
        //uebersicht mit der Vermietung als value und dem preis als key
        this.uebersicht = new HashMap<Vermietung, Integer>();
    }

    public Vermietung getVermietung() {
        return vermietung;
    }

    public void setVermietung(Vermietung vermietung) {
        this.vermietung = vermietung;
    }

    public HashMap getUebersicht() {
        return uebersicht;
    }

    public void setUebersicht(HashMap uebersicht) {
        this.uebersicht = uebersicht;
    }

    public ArrayList getVermietungen() {
        return vermietungen;
    }

    public void setVermietungen(ArrayList vermietungen) {
        this.vermietungen = vermietungen;
    }
    
    public void addVermietungen(ArrayList vermietungen) {
        vermietungen.add(new Vermietung(techniker, kunde, technik));
    }
    
}
