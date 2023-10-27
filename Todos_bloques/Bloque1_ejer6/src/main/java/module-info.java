module com.example.bloque1_ejer6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bloque1_ejer6 to javafx.fxml;
    exports com.example.bloque1_ejer6;
}