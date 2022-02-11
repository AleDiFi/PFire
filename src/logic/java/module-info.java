module pfire.pfire {
    requires javafx.controls;
    requires javafx.fxml;


    opens pfire.pfire to javafx.fxml;
    exports pfire.pfire;
}