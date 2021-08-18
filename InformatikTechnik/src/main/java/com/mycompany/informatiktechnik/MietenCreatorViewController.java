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

/**
 * FXML Controller class
 *
 * @author jorda
 */
public class MietenCreatorViewController implements Initializable {

    @FXML
    private ListView<?> lvTechniker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnZurueck(ActionEvent event) throws IOException {
        App.setRoot("MaterialienView");
    }

    @FXML
    private void btnLoeschen(ActionEvent event) {
    }

    @FXML
    private void btnCreateMiete(ActionEvent event) throws IOException {
    App.setRoot("AlleMietenView");
    }

}
