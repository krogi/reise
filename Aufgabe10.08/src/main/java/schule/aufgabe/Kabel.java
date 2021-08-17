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
public class Kabel extends Technik {
    public int Laenge;

    public Kabel(int Laenge, String Name, int Preis, String Beschreibung) {
        super(Name, Preis, Beschreibung);
        this.Laenge = Laenge;
    }

    public int getLaenge() {
        return Laenge;
    }

    public void setLaenge(int Laenge) {
        this.Laenge = Laenge;
    }

    
    
    
}
