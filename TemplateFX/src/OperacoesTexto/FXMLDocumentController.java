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
    private TextField txftexto;
    @FXML
    private TextField txfpalavra;
    @FXML
    private TextField txfnumVezesAparece;
    @FXML
    private CheckBox maiusculas;

    /**
     * Initializes the controller class.
     */
    @FXML
    public void actionContar(ActionEvent e){
        String texto = txftexto.getText();
        String palavraProcurada = txfpalavra.getText();
        String[] palavrasTexto;
        int cont;
        
        if(maiusculas.isSelected()){
            String textoUC = texto.toUpperCase();
            String palavraProcuradaUC = palavraProcurada.toUpperCase();
            palavrasTexto = textoUC.split("\\W+");
            cont=0;
            
            for(int i=0; i<palavrasTexto.length; i++){
                System.out.println("Palavra->"+palavrasTexto[i]+"/Procurada->"+palavraProcuradaUC);
                if(palavrasTexto[i].equals(palavraProcuradaUC))
                    cont++;
            }
            
            txfnumVezesAparece.setText(String.valueOf(cont));
        }
        else{
            palavrasTexto = texto.split("\\W+");
            cont = 0;
            for(int i=0; i<palavrasTexto.length; i++){
                System.out.println("Palavra->"+palavrasTexto[i]+"/Procurada->"+palavraProcurada);
                if(palavrasTexto[i].equals(palavraProcurada))
                    cont++;
            }
            txfnumVezesAparece.setText(String.valueOf(cont));
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

}
