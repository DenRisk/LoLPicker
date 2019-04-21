package sample;

import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static sample.ADC.getADCString;
import static sample.JNG.getJungleString;
import static sample.MID.getMidString;
import static sample.SUPP.getSupportString;
import static sample.TOP.getTopString;

public class Controller implements Initializable {

    public ToggleButton toggletop;
    public ToggleButton togglejungle;
    public ToggleButton togglemid;
    public ToggleButton toggleadc;
    public ToggleButton togglesupp;

    public ToggleGroup group;

    public Button button;
    public Label label;
    public Button closebtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        label.setAlignment(Pos.CENTER);


    }

    public void clickButton() {

        if (toggleadc.isSelected()) {
            label.setText(getADCString());
        } else if (togglesupp.isSelected()) {
            label.setText(getSupportString());
        }else if (toggletop.isSelected()) {
            label.setText(getTopString());
        }else if (togglemid.isSelected()) {
            label.setText(getMidString());
        }else if (togglejungle.isSelected()) {
            label.setText(getJungleString());
        }
    }

    public void closeProgramm() {
        Stage stage = (Stage) closebtn.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

}
