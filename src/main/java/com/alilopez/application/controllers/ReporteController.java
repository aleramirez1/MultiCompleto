package com.alilopez.application.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.alilopez.application.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ReporteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ColorPicker BttnColor;

    @FXML
    private Button atrasBttn;

    @FXML
    private ChoiceBox<?> aulaCasilla;

    @FXML
    private DatePicker calendarCasilla;

    @FXML
    private Button cancelarBttn;

    @FXML
    private TextField descripcionCasilla;

    @FXML
    private TextField nombreCasilla;

    @FXML
    private Button solicitarBttn;

    @FXML
    private TextField tipoobjetoCasilla;

    @FXML
    private ComboBox<?> udCasilla;

    @FXML
    void guardarAula(MouseEvent event) {

    }

    @FXML
    void guardarColor(ActionEvent event) {

    }

    @FXML
    void guardarDescripcionObjeto(ActionEvent event) {

    }

    @FXML
    void guardarFecha(ActionEvent event) {

    }

    @FXML
    void guardarNombre(ActionEvent event) {

    }

    @FXML
    void guardarTipoObjeto(ActionEvent event) {

    }

    @FXML
    void guardarUd(ActionEvent event) {

    }

    @FXML
    void onClickedAtras(MouseEvent event) {
        App.newStage("menu-view","MENU");

    }

    @FXML
    void onClickedCancelar(MouseEvent event) {

    }

    @FXML
    void onClickedSolicitar(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert BttnColor != null : "fx:id=\"BttnColor\" was not injected: check your FXML file 'reporte-view.fxml'.";
        assert atrasBttn != null : "fx:id=\"atrasBttn\" was not injected: check your FXML file 'reporte-view.fxml'.";
        assert aulaCasilla != null : "fx:id=\"aulaCasilla\" was not injected: check your FXML file 'reporte-view.fxml'.";
        assert calendarCasilla != null : "fx:id=\"calendarCasilla\" was not injected: check your FXML file 'reporte-view.fxml'.";
        assert cancelarBttn != null : "fx:id=\"cancelarBttn\" was not injected: check your FXML file 'reporte-view.fxml'.";
        assert descripcionCasilla != null : "fx:id=\"descripcionCasilla\" was not injected: check your FXML file 'reporte-view.fxml'.";
        assert nombreCasilla != null : "fx:id=\"nombreCasilla\" was not injected: check your FXML file 'reporte-view.fxml'.";
        assert solicitarBttn != null : "fx:id=\"solicitarBttn\" was not injected: check your FXML file 'reporte-view.fxml'.";
        assert tipoobjetoCasilla != null : "fx:id=\"tipoobjetoCasilla\" was not injected: check your FXML file 'reporte-view.fxml'.";
        assert udCasilla != null : "fx:id=\"udCasilla\" was not injected: check your FXML file 'reporte-view.fxml'.";

    }

}
