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
public abstract class Kunde extends Personen {
    public String Adresse;

    public Kunde(String Adresse, String Vorname, String Nachname) {
        super(Vorname, Nachname);
        this.Adresse = Adresse;
    }

    
}
