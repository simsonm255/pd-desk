package com.pd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class PersonalDiary extends Application {

    public static void main(String[] args) {
        launch();
    }
    private Stage primaryStage = null;
    @Override
    public void start(Stage stage) throws IOException {
          stage.setTitle("Personal Diary");
          stage.setScene(new Scene(new Button("Welcome to Personal Diary"),600,540));

          stage.show();
    }


}