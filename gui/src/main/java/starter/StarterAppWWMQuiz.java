package starter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;

public class StarterAppWWMQuiz extends Application {

    public static BorderPane pane;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        URL res = getClass().getResource("/WWM/WWMQuiz.fxml");
        Parent root = FXMLLoader.load(res);
        primaryStage.setTitle("WWMQuiz");
        primaryStage.setScene(new Scene(root, 1000, 666));

        primaryStage.show();

    }
}
