module com.example.bloque1_ejer4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bloque1_ejer4 to javafx.fxml;
    exports com.example.bloque1_ejer4;
}