package com.alilopez.application.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class EncontrarController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField agregarlaBusqueda;

    @FXML
    private Button buttonAtras;

    @FXML
    private TableView<?> tablaContenido;

    @FXML
    void agregarDatosTabla(ActionEvent event) {

    }

    @FXML
    void onclickedAtras(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert agregarlaBusqueda != null : "fx:id=\"agregarlaBusqueda\" was not injected: check your FXML file 'encontrar-view.fxml'.";
        assert buttonAtras != null : "fx:id=\"buttonAtras\" was not injected: check your FXML file 'encontrar-view.fxml'.";
        assert tablaContenido != null : "fx:id=\"tablaContenido\" was not injected: check your FXML file 'encontrar-view.fxml'.";

    }

}
