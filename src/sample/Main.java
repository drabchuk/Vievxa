package sample;

import Client.Client;
import Client.Command;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application {
    public static Client client;

    @Override
    public void start(Stage primaryStage) throws Exception {
        client = new Client();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root, primaryStage.getWidth(), primaryStage.getHeight());
        scene.getStylesheets().add(Main.class.getResource("style.css").toExternalForm());
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        //primaryStage.setFullScreen(true);
        primaryStage.show();
        System.out.println();
    }

    public static void main(String[] args) {
        launch(args);
        System.out.println();
    }
}