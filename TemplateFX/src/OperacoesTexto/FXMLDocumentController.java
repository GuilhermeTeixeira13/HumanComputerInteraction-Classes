package OperacoesTexto;

import pt.ubi.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jpc
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextArea txAreatexto;
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
        String texto = txAreatexto.getText();
        String palavraProcurada = txfpalavra.getText();
        int num = 0;
        
        System.out.print("Encontrou a palavra '");
        
        if(maiusculas.isSelected()){
            String textoUC = texto.toUpperCase();
            String palavraProcuradaUC = palavraProcurada.toUpperCase();
            
            num = FXMLDocumentController.contaPalavraNumTexto(textoUC, palavraProcuradaUC);
            
            txfnumVezesAparece.setText(String.valueOf(num));
            
            System.out.print(palavraProcuradaUC);
        }
        else{
            num = FXMLDocumentController.contaPalavraNumTexto(texto, palavraProcurada);
            txfnumVezesAparece.setText(String.valueOf(num));
            
            System.out.print(palavraProcurada);
        }
        System.out.print("' "+num+" vezes.\n\n");
    }
    
    public static int contaPalavraNumTexto(String texto, String palavraProcurada){
        int cont = 0;
        String[] palavrasTexto = texto.split("\\W+");
        
        for(int i=0; i<palavrasTexto.length; i++){
            if(palavrasTexto[i].equals(palavraProcurada))
                cont++;
        }
        
        return cont;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
}
