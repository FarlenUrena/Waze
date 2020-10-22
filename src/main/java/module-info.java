module cr.ac.una.wase {
    requires javafx.controls;
    requires javafx.fxml;

    opens cr.ac.una.wase to javafx.fxml;
    exports cr.ac.una.wase;
}
