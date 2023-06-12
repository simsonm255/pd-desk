package com.pd.navpane;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class NavBar extends VBox {
    private Button notesPaneButton;
    private Button taskPaneButton;
    private Button calenderPane;

    public NavBar() {
        initStuff();
    }

    public void initStuff(){
        setPadding(new Insets(5));
        this.setSpacing(10);
        this.getChildren().add(getNotesPaneButton());
        this.getChildren().add(getTaskPaneButton());
    }
    public Button getNotesPaneButton() {

        if(notesPaneButton==null){
            notesPaneButton = new Button("NotesPaneButton");
            notesPaneButton.setOnAction(e->{
                System.out.println("notesPaneButton clicked");
            });
        }
        return notesPaneButton;
    }

    public Button getTaskPaneButton() {

        if(taskPaneButton==null){
            taskPaneButton = new Button("TaskPaneButton");
            taskPaneButton.setOnAction(e->{
                System.out.println("taskPaneButton clicked");
            });
        }
        return taskPaneButton;
    }
}
