/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.informatiktechnik;

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
public class MaterialienViewController implements Initializable {


    @FXML
    private TextField tfBoxen;
    @FXML
    private TextField tfKabel;
    @FXML
    private TextField tfBuehnenplatten;
    @FXML
    private TextField tfPult;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void btnZurueck(ActionEvent event) {
    }

    @FXML
    private void btnCreateMiete(ActionEvent event) {
    }

}
