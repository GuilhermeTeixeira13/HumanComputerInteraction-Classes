package calendar;

import pt.ubi.*;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import static java.util.Locale.ENGLISH;
import java.util.ResourceBundle;
import java.util.TimeZone;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jpc
 */
public class FXMLDocumentController implements Initializable {

    public Spinner<Integer> spnYear;
    public ComboBox cmbMes;
    
    public Label l1;
    public Label l2;
    public Label l3;
    public Label l4;
    public Label l5;
    public Label l6;
    public Label l7;
    public Label l8;
    public Label l9;
    public Label l10;
    public Label l11;
    public Label l12;
    public Label l13;
    public Label l14;
    public Label l15;
    public Label l16;
    public Label l17;
    public Label l18;
    public Label l19;
    public Label l20;
    public Label l21;
    public Label l22;
    public Label l23;
    public Label l24;
    public Label l25;
    public Label l26;
    public Label l27;
    public Label l28;
    public Label l29;
    public Label l30;
    public Label l31;
    public Label l32;
    public Label l33;
    public Label l34;
    public Label l35;
    public Label l36;
    public Label l37;    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Calendar date = Calendar.getInstance(Locale.ENGLISH);
        
        cmbMes.setStyle("-fx-font: 22px \"Arial Black\";");
        cmbMes.getItems().addAll("Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
        int month = date.get(Calendar.MONTH);
        cmbMes.getSelectionModel().select(month);
        
        int year = date.get(Calendar.YEAR);
        SpinnerValueFactory<Integer> valueFactory = 
            new SpinnerValueFactory.IntegerSpinnerValueFactory(2020, 2025, year);
        spnYear.setValueFactory(valueFactory);
    }  
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        int ano = (Integer)spnYear.getValue();
        int mes = cmbMes.getSelectionModel().getSelectedIndex();
        //escreverMes(ano, mes);
    }
}
