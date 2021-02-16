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

public class WWMQuizController {
    @FXML
    private Button bBeenden;

    public void weiter(ActionEvent actionEvent) {
    }


    @FXML
    public void beende(ActionEvent actionEvent) {

        Stage stage = (Stage) bBeenden.getScene().getWindow();

        Scene scene = createNextScene();
        stage.setScene(scene);

    }
    private Scene createNextScene() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/wWM/WWMStart.fxml"));
            return new Scene(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
