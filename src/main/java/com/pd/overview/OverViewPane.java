package com.pd.overview;

import com.pd.navpane.NavBarPane;
import javafx.scene.layout.BorderPane;

public class OverViewPane extends BorderPane {

    private NavBarPane navBarPane = null;

    public OverViewPane() {
        initStuff ( );
//        getStylesheets ().add ("asserts/navbarStyle.css");
    }

    private void initStuff() {
//        this.setTop (new Text ("pd-desk"));
//        this.setLeft (getNavBarPane ());
//        getStyleClass ().add ("");
//        getStylesheets ().add ("/asserts/overView.css");
//        getStylesheets().add("com/pd/navbarStyle.css");
        getStyleClass ().add("body");
        getStylesheets ().add ("asserts/overView.css");
        this.setLeft (getNavBarPane ( ));
        this.setPrefHeight (720);
        this.setPrefWidth (1280);

    }

    public NavBarPane getNavBarPane() {
        if ( navBarPane == null ) {
            navBarPane = new NavBarPane ( );

        }
        return navBarPane;
    }

}