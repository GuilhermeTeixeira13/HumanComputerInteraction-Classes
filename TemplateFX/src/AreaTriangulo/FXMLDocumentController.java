package AreaTriangulo;

import pt.ubi.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import java.lang.Math;

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
    TextField txfladoA;
    
    @FXML
    TextField txfladoB;
    
    @FXML
    TextField txfladoC;
    
    @FXML
    public void actionCalcular(ActionEvent e){
        double a = Double.parseDouble(txfladoA.getText());
        double b = Double.parseDouble(txfladoB.getText());
        double c = Double.parseDouble(txfladoC.getText().replace(",","."));
        
        double somaABC = a + b + c;
        double ABCdivididoPor2 = somaABC / 2;
        
        double area = Math.sqrt((ABCdivididoPor2)*(ABCdivididoPor2-a)*(ABCdivididoPor2-b)*(ABCdivididoPor2-c));
        
        System.out.println("a="+a+"\nb="+b+"\nc="+c+"\narea="+area);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
