package com.pd.taskpane;

import com.pd.model.Task;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TaskViewCard extends HBox {

        private Task task =null;
        private Rectangle rectangle ;
        private Label titleLabel;
        private Label descriptionLabel;

    public TaskViewCard() {
    }

    public TaskViewCard(Task task) {
         this.task= task;
        intiStuff();
    }

    private void intiStuff() {
        titleLabel = new Label(task.getTitle());
        descriptionLabel = new Label(task.getDescription());
        rectangle = new Rectangle(12,12, Color.RED);
        setSpacing(5);
        setPadding(new Insets(10));
        //Get Css file
        String styleFile = getClass().getResource("TaskViewCard.css").toExternalForm();
        setStyle(styleFile);
    }

}
