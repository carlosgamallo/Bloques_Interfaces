package com.example.bloque1_ejer4;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

class Alumno {
    String nombre;
    int nota;

    Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
}
public class HelloController implements Initializable {

    @FXML
    private TextField campo_alumno;

    @FXML
    private TextArea lista_alumnado;

    @FXML
    private TextArea lista_nombres;

    ArrayList<Alumno> lista = new ArrayList<Alumno>();
    @FXML
    void busca_alumno(MouseEvent event) {


        String busca_nombre=campo_alumno.getText();


        for (int i = 0; i <lista.size() ; i++) {
            if(Objects.equals(busca_nombre, lista.get(i).nombre)){
                lista_alumnado.setText("Nombre del alumno: "+lista.get(i).nombre+", Nota del alumno: "+ lista.get(i).nota);
            }
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Alumno alumno1 = new Alumno("Carlos", 8);
        Alumno alumno2 = new Alumno("Pepe", 5);
        Alumno alumno3 = new Alumno("Xose", 6);
        Alumno alumno4 = new Alumno("Ivan",7);
        Alumno alumno5 = new Alumno("Jordi",4);

        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(alumno3);
        lista.add(alumno4);
        lista.add(alumno5);

        StringBuilder nombres_listados = new StringBuilder();

        for (int i = 0; i <lista.size() ; i++) {
            nombres_listados.append(lista.get(i).nombre).append(". ");
        }
        lista_nombres.setText(String.valueOf(nombres_listados));
    }
}