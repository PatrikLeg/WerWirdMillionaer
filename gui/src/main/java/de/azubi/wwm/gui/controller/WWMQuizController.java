package de.azubi.wwm.gui.controller;

import de.azubi.wwm.datei.Funfacts;
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


public class WWMQuizController {

    @FXML
    private Button bAntwortA;
    @FXML
    private Button bAntwortB;
    @FXML
    private Button bAntwortC;
    @FXML
    private Button bAntwortD;
    @FXML
    private Label lQundA;
    @FXML
    private Button bBeenden;

    public void weiter(ActionEvent actionEvent) {
        lQundA.setText("Die richtige Antwort ist " + Fragen.getRichtigeAntwort());
    }

    @FXML
    void initialize() {
        lQundA.setText(Fragen.getZufallFrage().getfrage());

        bAntwortA.setText(Fragen.getAntworten());
        bAntwortB.setText(Fragen.getAntworten());
        bAntwortC.setText(Fragen.getAntworten());
        bAntwortD.setText(Fragen.getAntworten());

        while(bAntwortD.getText().equals(bAntwortC.getText()) || bAntwortD.getText().equals(bAntwortB.getText()) || bAntwortD.getText().equals(bAntwortA.getText()) ||
                bAntwortC.getText().equals(bAntwortA.getText()) || bAntwortC.getText().equals(bAntwortB.getText()) || bAntwortC.getText().equals(bAntwortD.getText()) ||
                bAntwortB.getText().equals(bAntwortC.getText()) || bAntwortB.getText().equals(bAntwortD.getText()) || bAntwortB.getText().equals(bAntwortA.getText()) ||
                bAntwortA.getText().equals(bAntwortC.getText()) || bAntwortA.getText().equals(bAntwortB.getText()) || bAntwortA.getText().equals(bAntwortD.getText())) {
            if (bAntwortB.getText().equals(bAntwortA.getText())) {
                bAntwortB.setText(Fragen.getAntworten());
            }
            if (bAntwortC.getText().equals(bAntwortB.getText()) || bAntwortC.getText().equals(bAntwortA.getText())) {
                bAntwortC.setText(Fragen.getAntworten());
            }
            if (bAntwortD.getText().equals(bAntwortC.getText()) || bAntwortD.getText().equals(bAntwortB.getText()) || bAntwortD.getText().equals(bAntwortA.getText())) {
                bAntwortD.setText(Fragen.getAntworten());
            }
        }
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
