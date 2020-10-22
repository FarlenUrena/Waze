module cr.ac.una.wase {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.logging;
    requires com.jfoenix;

    opens cr.ac.una.waze.controller to javafx.fxml,javafx.controls,com.jfoenix;
    exports cr.ac.una.waze to javafx.graphics;
}
