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
import javafx.scene.control.ChoiceBox;

import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author jorda
 */
public class MaterialienViewController implements Initializable {


    @FXML
    private ChoiceBox<?> CbBoxen;
    @FXML
    private ChoiceBox<?> CbKabel;
    @FXML
    private ChoiceBox<?> CbBuehnenplatten;
    @FXML
    private ChoiceBox<?> CbPult;
    @FXML
    private ChoiceBox<?> Boxenanzahl;
    @FXML
    private ChoiceBox<?> Kabelanzahl;
    @FXML
    private ChoiceBox<?> Buehnenplattenanzahl;
    @FXML
    private ChoiceBox<?> Pultanzahl;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void btnZurueck(ActionEvent event) throws IOException {
        App.setRoot("TechnikerView");
    }

    @FXML
    private void btnCreateMiete(ActionEvent event) throws IOException {
        
        App.setRoot("MietenCreatorView");
    }

}
