package com.example.groupcode;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        View view = new View();
        Controller controller = new Controller();
        view.setMainController(controller);


        StackPane root = new StackPane(view);
        Scene scene = new Scene(root);


        stage.setTitle("app name");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}