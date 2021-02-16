package de.azubi.wwm.gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class WWMEndeController {
    @FXML
    private Label lMeldung;
    @FXML
    private Label lPunktzahl;
    @FXML
    private Button bNochmal;
    @FXML
    private Button bZuruck;
    @FXML
    public void zuruck(ActionEvent actionEvent) {



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



        Stage stage = (Stage) bNochmal.getScene().getWindow();

        Scene scene = createQuizScene();
        stage.setScene(scene);

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