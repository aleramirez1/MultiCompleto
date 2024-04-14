package com.alilopez.application.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.alilopez.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class BuscarController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BuscarBttn;

    @FXML
    private Button atrasBttn;

    @FXML
    private TextField escribirObjeto;

    @FXML
    void onclickedAtras(MouseEvent event) {
        App.newStage("menu-view","MENU");

    }

    @FXML
    void onclickenBuscar(MouseEvent event) {
        App.newStage("encontrar-view","ENCONTRAR");

    }

    @FXML
    void initialize() {
        assert BuscarBttn != null : "fx:id=\"BuscarBttn\" was not injected: check your FXML file 'buscar-view.fxml'.";
        assert atrasBttn != null : "fx:id=\"atrasBttn\" was not injected: check your FXML file 'buscar-view.fxml'.";
        assert escribirObjeto != null : "fx:id=\"escribirObjeto\" was not injected: check your FXML file 'buscar-view.fxml'.";

    }

}
