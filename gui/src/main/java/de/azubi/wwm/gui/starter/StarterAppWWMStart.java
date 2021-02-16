package de.azubi.wwm.gui.starter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;

public class StarterAppWWMStart extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {


        URL res = getClass().getResource("/wWM/WWMStart.fxml");
        Parent root = FXMLLoader.load(res);
        primaryStage.setTitle("WWMStart");
        primaryStage.setScene(new Scene(root, 1000, 666));
        primaryStage.show();

    }

}
