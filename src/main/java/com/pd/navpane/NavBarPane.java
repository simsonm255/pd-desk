package com.pd.navpane;

import javafx.scene.layout.BorderPane;

public class NavBarPane extends BorderPane {

    private NavBar navBar = null;
    public NavBarPane() {
        super();
        initStuff();
//        getStylesheets ().add ("./navbarStyle.css");
    }
    private void initStuff(){
        setLeft (getNavBar ());
    }
    public NavBar getNavBar() {
        if (navBar == null) {
            navBar = new NavBar();
//            navBar.getStyleClass ().add ("navbar");
//            navBar.getStylesheets ().add ("./navbarStyle.css");
        }
        return navBar;
    }
}