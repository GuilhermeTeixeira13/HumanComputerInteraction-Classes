package calculadorafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import pt.ubi.ihc.Registadora;

/**
 * FXML Controller class
 *
 * @author jpc
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
        
    }    

    @FXML
    private void actionCalcular(ActionEvent event) {
    }
    
}
