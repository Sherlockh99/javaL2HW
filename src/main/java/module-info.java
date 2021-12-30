module lesson4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens lesson4 to javafx.fxml;
    exports lesson4;
}