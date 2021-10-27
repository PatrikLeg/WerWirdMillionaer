package de.azubi.wwm.gui.controller;

import de.azubi.wwm.datei.Funfacts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import de.azubi.wwm.datei.Fragen;
import java.io.IOException;


public class WWMStartController {

    @FXML
    private Button bStart;
    @FXML
    private Label lHighscore;
    @FXML
    private Label lFacts;
    private int startKapital = 50;

    @FXML
    void initialize() {
        if(WWMQuizController.anzahlFrage == 15){
            lHighscore.setText("Highscore: 1.000.000€");
        }else{
            for(int i = 1; i < WWMQuizController.anzahlFrage; i++){
                startKapital = startKapital * 2;
            }
        }
        lHighscore.setText("Highscore: " + startKapital + "€");
        lFacts.setText("FunFact: " + Funfacts.getZufallFact().getFact());
        WWMQuizController.anzahlFrage = 1;
        Fragen.zaehler = 1;
    }


    @FXML
    public void starte(ActionEvent actionEvent) {
        Fragen.zaehler = 1;
        Stage stage = (Stage) bStart.getScene().getWindow();
        Scene scene = createNextScene();
        stage.setScene(scene);

    }
    private Scene createNextScene() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/wWM/WWMQuiz.fxml"));
            return new Scene(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Das ist ein Kommentar
        return null;
    }
}
