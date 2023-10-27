module com.example.bloque1_ejer3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bloque1_ejer3 to javafx.fxml;
    exports com.example.bloque1_ejer3;
}