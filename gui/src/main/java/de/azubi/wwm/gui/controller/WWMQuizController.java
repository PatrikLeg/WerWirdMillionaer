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
import javafx.scene.paint.Color;

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
    @FXML
    private Button bWeiter;
    @FXML
    private Label lAnzahlFrage;

    private Integer zaehler=0;
    private int anzahlFrage = 1;

    public void weiter(ActionEvent actionEvent) {

        lQundA.setText("Die richtige Antwort ist " + Fragen.getRichtigeAntwort());
        if (Fragen.getRichtigeAntwort().equals(bAntwortC.getText())) {
            bAntwortC.setStyle("-fx-background-color:   green");
            bAntwortA.setStyle("-fx-background-color: red");
            bAntwortB.setStyle("-fx-background-color: red");
            bAntwortD.setStyle("-fx-background-color: red");
        } else if (Fragen.getRichtigeAntwort().equals(bAntwortA.getText())) {
            bAntwortA.setStyle("-fx-background-color:   green");
            bAntwortC.setStyle("-fx-background-color: red");
            bAntwortB.setStyle("-fx-background-color: red");
            bAntwortD.setStyle("-fx-background-color: red");
        } else if (Fragen.getRichtigeAntwort().equals(bAntwortB.getText())) {
            bAntwortB.setStyle("-fx-background-color:   green");
            bAntwortC.setStyle("-fx-background-color: red");
            bAntwortA.setStyle("-fx-background-color: red");
            bAntwortD.setStyle("-fx-background-color: red");
        } else if (Fragen.getRichtigeAntwort().equals(bAntwortD.getText())) {
            bAntwortD.setStyle("-fx-background-color:  green");
            bAntwortC.setStyle("-fx-background-color: red");
            bAntwortB.setStyle("-fx-background-color: red");
            bAntwortA.setStyle("-fx-background-color: red");
        }
        if (bWeiter.getText().equals("Antwort Einloggen")) {
            zaehler +=1;
            bWeiter.setText("Naechste Frage");
            if(zaehler==29){
                bWeiter.setText("Quiz Beenden");
                bWeiter.setStyle("-fx-background-color: yellow");
                bWeiter.setTextFill(Color.BLACK);
            }

        } else if (bWeiter.getText().equals("Naechste Frage")) {
            anzahlFrage +=1;
            lAnzahlFrage.setText("Frage: " + anzahlFrage);
            zaehler +=1;

            bAntwortD.setStyle("-fx-background-color: #31539F");
            bAntwortA.setStyle("-fx-background-color: #31539F");
            bAntwortB.setStyle("-fx-background-color: #31539F");
            bAntwortC.setStyle("-fx-background-color: #31539F");
            bWeiter.setText("Antwort Einloggen");
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

        }else if(bWeiter.getText().equals("Quiz Beenden")) {
            zaehler +=1;
            if(zaehler==30){

                Stage stage = (Stage) bWeiter.getScene().getWindow();

                Scene scene = createEndScene();
                stage.setScene(scene);
            }
        }
    }
    @FXML
    void initialize() {
        lAnzahlFrage.setText("Frage: " + anzahlFrage);
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
    private Scene createEndScene() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/wWM/WWMEnde.fxml"));
            return new Scene(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void waehleD(ActionEvent actionEvent) {
        bAntwortD.setStyle("-fx-background-color: purple");
        bAntwortA.setStyle("-fx-background-color: #31539F");
        bAntwortB.setStyle("-fx-background-color: #31539F");
        bAntwortC.setStyle("-fx-background-color: #31539F");
        //bAntwortD.setFocusTraversable(true);
    }

    public void waehleA(ActionEvent actionEvent) {
        bAntwortA.setStyle("-fx-background-color: purple");
        bAntwortC.setStyle("-fx-background-color: #31539F");
        bAntwortB.setStyle("-fx-background-color: #31539F");
        bAntwortD.setStyle("-fx-background-color: #31539F");
    }

    public void waehleB(ActionEvent actionEvent) {
        bAntwortB.setStyle("-fx-background-color: purple");
        bAntwortA.setStyle("-fx-background-color: #31539F");
        bAntwortC.setStyle("-fx-background-color: #31539F");
        bAntwortD.setStyle("-fx-background-color: #31539F");
    }

    public void waehleC(ActionEvent actionEvent) {
        bAntwortC.setStyle("-fx-background-color:   purple");
        bAntwortA.setStyle("-fx-background-color: #31539F");
        bAntwortB.setStyle("-fx-background-color: #31539F");
        bAntwortD.setStyle("-fx-background-color: #31539F");
    }
}
