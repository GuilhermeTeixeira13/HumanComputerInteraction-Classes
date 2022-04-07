package calculadorafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import pt.ubi.ihc.Registadora;

/**
 * FXML Controller class
 *
 * @author jpc
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextArea textoTxtArea;
    @FXML
    private Label resultadoLabel;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button button0;
    @FXML
    private Button buttonPonto;
    @FXML
    private Button buttonReset;
    @FXML
    private Button buttonDiv;
    @FXML
    private Button buttonMult;
    @FXML
    private Button buttonAdd;
    @FXML
    private Button buttonMinus;
    @FXML
    private Button buttonRes;
    
    Registadora registadora;
    
    private StringBuilder svalor;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        registadora = new Registadora();
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource() instanceof Button){
            Button b = (Button) event.getSource();
            System.out.println(b.getText().charAt(0));
            process(b.getText().charAt(0));
        }
    }
    
    public void process(char c){
        if(c == '+' || c == '-' || c == 'x' || c == '/')
            processOperadores(c);
        else if(c == 'c')
            processReset(c);
        else if (Character.isDigit(c))
           processDigito(c);
    }
    
    public void processOperadores(char c){
        double num;  
        registadora.defineOperador(c);
        num = Double.parseDouble(svalor.toString());
        registadora.regista(num); 
        
        svalor.append(" "+c+"\n");
        textoTxtArea.appendText(svalor.toString());
        
        svalor.delete(0, svalor.length()-1);
    }
    
    public void processReset(char c){
        svalor.delete(0, svalor.length()-1);
        textoTxtArea.setText("");
    }
    
    public void processDigito(char c){
        svalor.append(c); // ERRO
    }
}
