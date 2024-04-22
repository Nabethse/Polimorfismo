module com.nabethse.polimorfismo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.nabethse.polimorfismo to javafx.fxml;
    exports com.nabethse.polimorfismo;
    exports com.nabethse.polimorfismo.controllers;
    opens com.nabethse.polimorfismo.controllers to javafx.fxml;
}