package de.azubi.wwm.gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import de.azubi.wwm.datei.Fragen;

import java.io.IOException;
import de.azubi.wwm.gui.controller.WWMQuizController;
public class WWMEndeController {
    @FXML
    private Label lMeldung;
    @FXML
    private Label lPunktzahl;
    @FXML
    private Button bNochmal;
    @FXML
    private Button bZuruck;


    public void zuruck(ActionEvent actionEvent) {


            Fragen.zaehler = 1;
            Stage stage = (Stage) bZuruck.getScene().getWindow();

            Scene scene = createStartScene();
            stage.setScene(scene);

        }
        private Scene createStartScene() {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/wWM/WWMStart.fxml"));
                return new Scene(root);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }


    @FXML
    public void wiederhole(ActionEvent actionEvent) {

        Fragen.zaehler = 1;
        WWMQuizController.anzahlFrage = 1;
        Stage stage = (Stage) bNochmal.getScene().getWindow();

        Scene scene = createQuizScene();
        stage.setScene(scene);

    }
    @FXML
    void initialize() {
        if(WWMQuizController.anzahlFrage<=5) {
            lMeldung.setText("Schade vielleicht läufts beim Nächsten mal besser");
        }else if(WWMQuizController.anzahlFrage<=10){
            lMeldung.setText("Gut gemacht das lief schon ziemlich flott");
        }else if(WWMQuizController.anzahlFrage<=14){
            lMeldung.setText("Super fast geschafft beim Nächsten mal bekommst du die Millionen");
        }else if(WWMQuizController.anzahlFrage<=15){
            lMeldung.setText("Herzlichen Glückwunsch, du bist jetzt Millionär");
        }
        lPunktzahl.setText(WWMQuizController.anzahlFrage + " / 15");
    }
    private Scene createQuizScene() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/wWM/WWMQuiz.fxml"));
            return new Scene(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
