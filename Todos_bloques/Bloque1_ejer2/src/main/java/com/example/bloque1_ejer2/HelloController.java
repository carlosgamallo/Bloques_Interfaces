package com.example.bloque1_ejer2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;



public class HelloController {

    @FXML
    private Label cantidad;

    @FXML
    private TextField cantidad_producto;

    @FXML
    private Label nombre;

    @FXML
    private TextField nombre_producto;

    @FXML
    private Label precio;

    @FXML
    private TextField precio_producto;

    @FXML
    private Label total;

    //Nota: A la hora de ejecutar la aplicacion puedes introducir los datos de uno en uno o darle directamente a calcular.

    @FXML
    void recoge_nombre(MouseEvent event) {
        String item=nombre_producto.getText();
        nombre.setText(item);
    }

    @FXML
    void recoge_precio(MouseEvent event) {
        String item_precio=precio_producto.getText();
        precio.setText(item_precio);
    }

    @FXML
    void recoge_cantidad(MouseEvent event) {
        String item_cantidad=cantidad_producto.getText();
        cantidad.setText(item_cantidad);
    }

    @FXML
    void calcula_total(MouseEvent event) {
    int suma=0;
    String item=nombre_producto.getText();
    nombre.setText(item);
    int item_precio=Integer.parseInt(precio_producto.getText());
    int item_cantidad=Integer.parseInt(precio_producto.getText());

    suma=item_precio*item_cantidad;
    total.setText(String.valueOf(suma));

    String item_precio2=precio_producto.getText();
    precio.setText(item_precio2);

    String item_cantidad2=cantidad_producto.getText();
    cantidad.setText(item_cantidad2);

    }

    @FXML
    void resetea_datos(MouseEvent event) {


    precio.setText("");
    cantidad.setText("");
    total.setText("");
    nombre.setText("");

    nombre_producto.setText("");
    cantidad_producto.setText("");
    precio_producto.setText("");
    }




}