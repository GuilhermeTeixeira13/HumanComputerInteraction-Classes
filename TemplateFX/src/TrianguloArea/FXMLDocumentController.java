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
    public void actionCalcular(ActionEvent e) {
        double a = FXMLDocumentController.isNumeric(txfladoA.getText());
        double b = FXMLDocumentController.isNumeric(txfladoB.getText());
        double c = FXMLDocumentController.isNumeric(txfladoC.getText());

        // O user inseriu pelo menos uma string
        if (a == -1 || b == -1 || c == -1) {
            if(a == -1){
                txfladoA.setText("Insira um int!");
                txfladoA.requestFocus();
            }
            if(b == -1){
                txfladoB.setText("Insira um int!");
                txfladoB.requestFocus();
            }
            if(c == -1){
                txfladoC.setText("Insira um int!");
                txfladoC.requestFocus();
            }
           
            txfarea.setText("Erro!");
            txfarea.setEditable(false);
            
        } else { // caso todos os números inseridos sejam inteiros
            boolean calcular = true;
            if (a > b + c) {
                txfladoA.setText("ERRO: a>b+c");
                txfladoA.requestFocus();
                calcular = false;
            }
            if (b > c + a) {
                txfladoB.setText("ERRO: b>c+a");
                txfladoB.requestFocus();
                calcular = false;
            }
            if (c > a + b) {
                txfladoC.setText("ERRO: c>a+b");
                txfladoC.requestFocus();
                calcular = false;
            }

            // Só procede para o cálculo caso a condição de um lado ser sempre menor ou igual à soma dos outros dois, ser aplicada neste triângulo
            if (calcular == true) {
                double somaABC = a + b + c;
                double ABCdivididoPor2 = somaABC / 2;
                double area = Math.sqrt((ABCdivididoPor2) * (ABCdivididoPor2 - a) * (ABCdivididoPor2 - b) * (ABCdivididoPor2 - c));
                System.out.println("\n\nA=" + a + "\nB=" + b + "\nC=" + c + "\n\nÁrea=" + area);
                txfarea.setText(String.valueOf(df.format(area)));
                txfarea.setEditable(false);
            } else {
                txfarea.setText("Erro!");
                txfarea.setEditable(false);
            }
        }

    }

    public static double isNumeric(String str) {
        try {
            double num = Double.parseDouble(str);
            return num;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
