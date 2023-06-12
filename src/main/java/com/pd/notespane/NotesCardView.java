package com.pd.notespane;

import com.pd.model.Notes;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class NotesCardView extends BorderPane {

    private Notes notes = null;

    public NotesCardView(Notes notes) {
        this.notes = notes;
    }
    private void initStuff(){
        setMaxHeight(480);
        setMaxWidth(640);
        Label label = new Label("JAVAFX");// title.getTitle()
        Label description = new Label("To build Desktop Application");

        //Create a VBox to hold a component
        VBox vBox = new VBox();
    }
}
