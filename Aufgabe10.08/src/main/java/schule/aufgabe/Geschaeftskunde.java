/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schule.aufgabe;

/**
 *
 * @author henri
 */
public class Geschaeftskunde extends Kunde {
    public String Firma;

    public Geschaeftskunde(String Firma, String Adresse, String Vorname, String Nachname) {
        super(Adresse, Vorname, Nachname);
        this.Firma = Firma;
    }

    public String getFirma() {
        return Firma;
    }

    public void setFirma(String Firma) {
        this.Firma = Firma;
    }
 
     
    
}
