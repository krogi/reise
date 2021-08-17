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
public class Privatkunde extends Kunde {

    public Privatkunde(String Adresse, String Vorname, String Nachname) {
        super(Adresse, Vorname, Nachname);
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }



    
    
}
