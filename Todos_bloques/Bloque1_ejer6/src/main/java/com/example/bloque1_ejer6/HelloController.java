package com.example.bloque1_ejer6;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private TextField campo_comensales;

    @FXML
    private TextArea menus_finales;

    @FXML
    private TextField numero_menus;

    int numero_comensales;

    @FXML
    void recibe_comensales(MouseEvent event) {
         String parseable= campo_comensales.getText();
         numero_comensales=Integer.parseInt(parseable);
    }

    @FXML
    void recibe_menus(MouseEvent event) {
        StringBuilder lista_menus= new StringBuilder();
        while (numero_comensales>0) {
            numero_comensales--;
            lista_menus.append(numero_menus);

        }
        menus_finales.setText(String.valueOf(lista_menus));
    }



}