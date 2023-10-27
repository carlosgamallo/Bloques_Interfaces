package com.example.bloque1_ejer3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private TextField lista;

    @FXML
    private TextField nlista;

    @FXML
    private TextField numero_elegido;

    @FXML
    void elimina_numero(MouseEvent event) {
        StringBuilder numero_final= new StringBuilder();
        String numeros=lista.getText();
        String numero_eliminable=numero_elegido.getText();
        nlista.setText(numeros);
        for (int i = 0; i <numeros.length() ; i++) {
            if(numeros.charAt(i)!=numero_eliminable.charAt(0)){
                numero_final.append(numeros.charAt(i));
            }
        }

        nlista.setText(String.valueOf(numero_final));



    }
}