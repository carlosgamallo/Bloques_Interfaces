module com.example.bloque1_ejer2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bloque1_ejer2 to javafx.fxml;
    exports com.example.bloque1_ejer2;
}