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
public class PrivatekundenViewController implements Initializable {


    @FXML
    private TextField tfVorname;
    @FXML
    private TextField tfNachname;
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
    private void btnCreatePrivatekunde(ActionEvent event) throws IOException {
        
        App.setRoot("TechnikerView");
    }

    @FXML
    private void btnZurueck(ActionEvent event) throws IOException {
        App.setRoot("KundenCreatorView");
    }

}
