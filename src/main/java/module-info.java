module com.example.pd {
    requires javafx.controls;
    requires javafx.fxml;

//    requires org.controlsfx.controls;
//    requires com.dlsc.formsfx;
//    requires com.almasb.fxgl.all;

    opens com.pd to javafx.fxml;
    exports com.pd;
}