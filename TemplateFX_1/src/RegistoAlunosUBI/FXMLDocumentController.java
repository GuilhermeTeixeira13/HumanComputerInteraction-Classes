/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistoAlunosUBI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author guite
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txfladoA;
    @FXML
    private TextField txfladoB;
    @FXML
    private TextField txfladoC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void actionCalcular(ActionEvent event) {
    }
    
}
