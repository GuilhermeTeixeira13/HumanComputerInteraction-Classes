package OperacoesTexto;

import pt.ubi.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jpc
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField texto;
    @FXML
    private TextField palavra;
    @FXML
    private TextField numVezesAparece;
    @FXML
    private CheckBox maiusculas;

    /**
     * Initializes the controller class.
     */
    @FXML
    public void actionContar(ActionEvent e){
        if(maiusculas.isSelected())
            System.out.println("selecionada");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

}
