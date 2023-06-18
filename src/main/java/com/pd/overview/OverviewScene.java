package com.pd.overview;

import javafx.scene.Parent;
import javafx.scene.Scene;

public class OverviewScene extends Scene {

   private OverViewPane overViewPane = null;
    public OverviewScene() {
        super(new OverViewPane ());
        overViewPane = (OverViewPane)getRoot ();
    }
}
