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
public class Pult extends Technik {

    public String Kanaele;

    public Pult(String Kanaele, String Name, int Preis, String Beschreibung) {
        super(Name, Preis, Beschreibung);
        this.Kanaele = Kanaele;
    }

    public String getKanaele() {
        return Kanaele;
    }

    public void setKanaele(String Kanaele) {
        this.Kanaele = Kanaele;
    }

    
    
}
