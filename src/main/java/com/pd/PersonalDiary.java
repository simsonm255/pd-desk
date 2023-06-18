package com.pd;

import com.pd.navpane.NavBar;
import com.pd.overview.OverviewScene;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PersonalDiary extends Application {

    public static void main(String[] args) {
        launch();
    }
    private Stage primaryStage = null;

    private OverviewScene overviewScene;
    @Override
    public void start(Stage stage) throws IOException {
          stage.setTitle("Personal Diary");

//        stage.setScene(new Scene(new Button("Welcome to Personal Diary"),600,540));
            stage.setScene(getOverviewScene ());
            stage.show ();

    }
    // switching theme
    public OverviewScene getOverviewScene(){
        if(overviewScene==null){
            overviewScene = new OverviewScene ();
        }
        return overviewScene;
    }
}