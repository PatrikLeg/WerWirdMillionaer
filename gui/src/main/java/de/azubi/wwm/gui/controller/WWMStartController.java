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

import java.io.IOException;


public class WWMStartController {

    @FXML
    private Label lUeberschrift;
    @FXML
    private RadioButton rbLeicht;
    @FXML
    private RadioButton rbMittel;
    @FXML
    private RadioButton rbSchwer;
    @FXML
    private RadioButton rbWWM;
    @FXML
    private Button bStart;
    @FXML
    private Label lHighscore;
    @FXML
    private Label lFacts;

    @FXML
    void initialize() {
        lFacts.setText("FunFact: " + Funfacts.getZufallFact().getFact());
    }


    @FXML
    public void starte(ActionEvent actionEvent) {

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
