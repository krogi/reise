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
public class Buenenplatte extends Technik {
    public int Maße;

    public Buenenplatte(int Maße, String Name, int Preis, String Beschreibung) {
        super(Name, Preis, Beschreibung);
        this.Maße = Maße;
    }

    public int getMaße() {
        return Maße;
    }

    public void setMaße(int Maße) {
        this.Maße = Maße;
    }

    
    
    
}
