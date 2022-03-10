package RegistoAlunosUBI;

import pt.ubi.*;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jpc
 */
public class FXMLDocumentController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    TextField txfNome;
    
    @FXML
    TextField txfCurso;
    
    @FXML
    TextField txfNum;
   
    
    @FXML
    public void actionRegistar(ActionEvent e){
        String nome = txfNome.getText();
        String curso = txfCurso.getText();
        String num = txfNum.getText();
        System.out.println("Nome:"+nome+" / Curso:"+curso+" / Núm:"+num);
    }
    
    @FXML
    public void actionCancelar(ActionEvent e){
        System.out.println("Terminou o programa.");
        exit();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
   
    
}
