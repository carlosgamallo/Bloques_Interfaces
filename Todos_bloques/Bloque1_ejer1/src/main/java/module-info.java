module com.example.bloque1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bloque1 to javafx.fxml;
    exports com.example.bloque1;
}