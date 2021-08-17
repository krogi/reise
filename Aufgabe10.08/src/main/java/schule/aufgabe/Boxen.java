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
public class Boxen extends Technik {
    public int Gewicht;

    public Boxen(int Gewicht, String Name, int Preis, String Beschreibung) {
        super(Name, Preis, Beschreibung);
        this.Gewicht = Gewicht;
    }

    public int getGewicht() {
        return Gewicht;
    }

    public void setGewicht(int Gewicht) {
        this.Gewicht = Gewicht;
    }

    
    
    
}
