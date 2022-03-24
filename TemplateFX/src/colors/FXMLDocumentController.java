package colors;

import pt.ubi.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author jpc
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Slider sliderRed;
    @FXML
    private Slider sliderGreen;
    @FXML
    private Slider sliderBlue;
    @FXML
    private Label LabelResVermelho;
    @FXML
    private Label LabelResGreen;
    @FXML
    private Label LabelResBlue; 
    @FXML
    private Pane painel;
  
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        double azul = sliderBlue.getValue();
        System.out.println(azul);   
        
        sliderBlue.valueProperty().addListener(new ChangeListener<Number>(){
            @Override
            public void changed(ObservableValue<? extends Number> agr0, Number arg1, Number agr2) {
                double azul = sliderBlue.getValue();
                painel.setStyle("-fx-background-color: rgb(" + 0 + "," + 0 + ", " + (int)azul + ");");
            }
        });
    }       
}
