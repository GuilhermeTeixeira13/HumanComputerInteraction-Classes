package TrianguloArea;

import pt.ubi.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import java.lang.Math;
import java.text.DecimalFormat;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author jpc
 */

public class FXMLDocumentController implements Initializable {
    
    private static final DecimalFormat df = new DecimalFormat("0.0000");
    private static final DecimalFormat df2 = new DecimalFormat("0.0"); 

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
    TextField txfarea;
    
    @FXML
    public void actionCalcular(ActionEvent e){ 
        double a = Double.parseDouble(txfladoA.getText());     
        double b = Double.parseDouble(txfladoB.getText());   
        double c = Double.parseDouble(txfladoC.getText().replace(",","."));
        
        boolean calcular = true;
        
        if(a>b+c){
            txfladoA.setText("ERRO: a>b+c");
            txfladoA.requestFocus();
            calcular = false;
        }
        if(b>c+a){
            txfladoB.setText("ERRO: b>c+a");
            txfladoB.requestFocus();
            calcular = false;
        }
        if(c>a+b){
            txfladoC.setText("ERRO: c>a+b");
            txfladoC.requestFocus();
            calcular = false;
        }
        
        if(calcular == true){
            double somaABC = a + b + c;
            double ABCdivididoPor2 = somaABC / 2;
            double area = Math.sqrt((ABCdivididoPor2)*(ABCdivididoPor2-a)*(ABCdivididoPor2-b)*(ABCdivididoPor2-c));
            System.out.println("\n\nA="+a+"\nB="+b+"\nC="+c+"\n\nÁrea="+area);
            txfarea.setText(String.valueOf(df.format(area)));
            txfarea.setEditable(false);
        }
        else{
            txfarea.setText("Erro!");
            txfarea.setEditable(false);
        }       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}


