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

import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
/**
 * FXML Controller class
 *
 * @author jorda
 */
public class TechnikerViewController implements Initializable {


    @FXML
    private ListView<String> lvTechniker;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lvTechniker.getItems().add("Holger" + " " + "Trampe");
        lvTechniker.getItems().add("Roy" + " " + "Trenneman");
        lvTechniker.getItems().add("Maurice" + " " + "Moss");
        
    }    
    
    @FXML
    private void btnGoToMiete(ActionEvent event) throws IOException {
        App.setRoot("MaterialienView");
    }

    @FXML
    private void btnZurueck(ActionEvent event) throws IOException {
        
        App.setRoot("PrivatKundenView");
        
    }

    @FXML
    private void lvcTechniker(MouseEvent event) {
        
    }

}
