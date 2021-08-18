package com.mycompany.informatiktechnik;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    private static ArrayList<Miete> miete;
    private static ArrayList<Kunde> kunde;

    public static ArrayList<Miete> getMiete() {
        return miete;
    }

    public static void setMiete(ArrayList<Miete> miete) {
        App.miete = miete;
    }

    public static ArrayList<Kunde> getKunde() {
        return kunde;
    }

    public static void setKunde(ArrayList<Kunde> kunde) {
        App.kunde = kunde;
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

}