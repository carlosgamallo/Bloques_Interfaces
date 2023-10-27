package com.example.bloque1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Label contador;

    @FXML
    private Button boton_palabra;

    @FXML
    private Button boton_palabra1;

    @FXML
    private Label cambia_palabra;

    @FXML
    private TextField campo_letra;

    @FXML
    private TextField campo_palabra;

    @FXML
    void introduce_palabra(MouseEvent event) {
        String palabra=campo_palabra.getText();
        cambia_palabra.setText(palabra);
    }

    @FXML
    void cuenta_letras(MouseEvent event) {
        int suma=0;
        String palabra=campo_palabra.getText();
        String letra= campo_letra.getText();
        for (int i = 0; i <palabra.length() ; i++) {
            if(letra.charAt(0)==palabra.charAt(i)){
                suma++;
            }
        }
        contador.setText("Se repite: "+suma+" veces");
    }

}