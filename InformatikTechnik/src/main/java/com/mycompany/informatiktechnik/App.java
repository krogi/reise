package com.mycompany.informatiktechnik;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    private static ArrayList<Miete> mietenList;
    private static ArrayList<Kunde> kundeList;
    private static ArrayList<Techniker> techniker;
    private static ArrayList<Privatkunde> privatkundenList;
    private static ArrayList<Geschaeftskunde> geschaeftskundeList;

    private static Techniker technikerList;
    private static Kunde selectedKunde;
    private static Miete selectedMiete;
    private static Privatkunde selectedprivatkunde;
    private static Privatkunde selectedgeschaeftskunde;
    
    private HashMap alleVermietungen;
    private Vermietung vermietung;
    private Technik technik;
    private Kunde kunde;

    public static Techniker getTechniker() {
        return technikerList;
    }
    
    public static void setTechniker(Techniker techniker) {
        App.technikerList = techniker;
    }
    
    public static Kunde getSelectedKunde() {
        return selectedKunde;
    }

    public static void setSelectedKunde(Kunde selectedKunde) {
        App.selectedKunde = selectedKunde;
    }

    public static Miete getSelectedMiete() {
        return selectedMiete;
    }

    public static void setSelectedMiete(Miete selectedMiete) {
        App.selectedMiete = selectedMiete;
    }

    public static Privatkunde getSelectedprivatkunde() {
        return selectedprivatkunde;
    }

    public static void setSelectedprivatkunde(Privatkunde selectedprivatkunde) {
        App.selectedprivatkunde = selectedprivatkunde;
    }

    public static Privatkunde getSelectedgeschaeftskunde() {
        return selectedgeschaeftskunde;
    }

    public static void setSelectedgeschaeftskunde(Privatkunde selectedgeschaeftskunde) {
        App.selectedgeschaeftskunde = selectedgeschaeftskunde;
    }

    public static ArrayList<Miete> getMietenList() {
        return mietenList;
    }

    public static void setMietenList(ArrayList<Miete> mietenList) {
        App.mietenList = mietenList;
    }

    public static ArrayList<Kunde> getKundeList() {
        return kundeList;
    }

    public static void setKundeList(ArrayList<Kunde> kundeList) {
        App.kundeList = kundeList;
    }

    public static ArrayList<Privatkunde> getPrivatkundenList() {
        return privatkundenList;
    }

    public static void setPrivatkundenList(ArrayList<Privatkunde> privatkundenList) {
        App.privatkundenList = privatkundenList;
    }

    public static ArrayList<Geschaeftskunde> getGeschaeftskundeList() {
        return geschaeftskundeList;
    }

    public static void setGeschaeftskundeList(ArrayList<Geschaeftskunde> geschaeftskundeList) {
        App.geschaeftskundeList = geschaeftskundeList;
    }
    
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("HomeView"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        
        
        
        launch();
    }
    
    public HashMap getAlleVermietungen() {
        return alleVermietungen;
    }

    public void setAlleVermietungen(HashMap alleVermietungen) {
        this.alleVermietungen = alleVermietungen;
    }
    
    public Vermietung getVermietung() {
        return vermietung;
    }

    public void setVermietung(Vermietung vermietung) {
        this.vermietung = vermietung;
    }
    
    public void alleVermietungen(){
        this.alleVermietungen = new HashMap<Vermietung, Integer>();
        alleVermietungen.add(new Miete(1, 1, 1,technik, kunde));
        
    } 
    
}