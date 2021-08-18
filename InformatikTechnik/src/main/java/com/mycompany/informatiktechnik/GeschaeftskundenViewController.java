/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.informatiktechnik;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jorda
 */
public class GeschaeftskundenViewController implements Initializable {

    @FXML
    private TextField tfVorname;
    @FXML
    private TextField tfNachname;
    @FXML
    private TextField tfFirma;
    @FXML
    private TextField tfAdresse;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnZurueck(ActionEvent event) throws IOException {
        App.setRoot("KundenCreatorView");
    }

    @FXML
    private void btnErstelleGeKunde(ActionEvent event) throws IOException {
        //TODO ErStellung des kunden
        
        
        
        App.setRoot("TechnikerView");
    }
    
}
