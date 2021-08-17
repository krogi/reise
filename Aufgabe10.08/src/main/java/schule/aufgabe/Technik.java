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
public abstract class Technik {
    
    public String Name;
    public int Preis;
    public String Beschreibung;

    public Technik(String Name, int Preis, String Beschreibung) {
        this.Name = Name;
        this.Preis = Preis;
        this.Beschreibung = Beschreibung;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPreis() {
        return Preis;
    }

    public void setPreis(int Preis) {
        this.Preis = Preis;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }

    public void setBeschreibung(String Beschreibung) {
        this.Beschreibung = Beschreibung;
    }
    
    
    
    
}
