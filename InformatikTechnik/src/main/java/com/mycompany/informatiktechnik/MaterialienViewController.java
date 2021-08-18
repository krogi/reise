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
    private ChoiceBox<String> CbBoxen;
    @FXML
    private ChoiceBox<String> CbKabel;
    @FXML
    private ChoiceBox<String> CbBuehnenplatten;
    @FXML
    private ChoiceBox<String> CbPult;
    @FXML
    private ChoiceBox<Integer> Boxenanzahl;
    @FXML
    private ChoiceBox<Integer> Kabelanzahl;
    @FXML
    private ChoiceBox<Integer> Buehnenplattenanzahl;
    @FXML
    private ChoiceBox<Integer> Pultanzahl;
    /**
     * Initializes the controller class.
     */    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        CbBoxen.getItems().add("klein");
        CbBoxen.getItems().add("mittel");
        CbBoxen.getItems().add("groß");
        
        CbKabel.getItems().add("klein");
        CbKabel.getItems().add("mittel");
        CbKabel.getItems().add("groß");
        
        CbBuehnenplatten.getItems().add("klein");
        CbBuehnenplatten.getItems().add("mittel");
        CbBuehnenplatten.getItems().add("groß");
        
        CbPult.getItems().add("klein");
        CbPult.getItems().add("mittel");
        CbPult.getItems().add("groß");
        
        for(int i = 0;i <11;i++){
            Boxenanzahl.getItems().add(i);
        }
        
        for(int i = 0;i <11;i++){
            Kabelanzahl.getItems().add(i);
        }
        
        for(int i = 0;i <11;i++){
            Buehnenplattenanzahl.getItems().add(i);
        }
        
        for(int i = 0;i <11;i++){
            Pultanzahl.getItems().add(i);
        }
        
        
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
