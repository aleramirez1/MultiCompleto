package com.alilopez.application.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.alilopez.application.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class IncidenciaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AtrasBttn;

    @FXML
    private TextField DescripcionobjetoCasilla;

    @FXML
    private Button GenerarreporteBttn;

    @FXML
    private ChoiceBox<?> aulaCasilla;

    @FXML
    private DatePicker calendarioCasilla;

    @FXML
    private Button cancelarBttn;

    @FXML
    private ColorPicker colorCasilla;

    @FXML
    private Button modificarBttn;

    @FXML
    private TextField nombreobjetoCasilla;

    @FXML
    private TextField tipoCasilla;

    @FXML
    private ChoiceBox<?> udCasilla;

    @FXML
    void guardarTipo(ActionEvent event) {

    }

    @FXML
    void guardardescripcion(ActionEvent event) {

    }

    @FXML
    void mostrarcalendarioClicked(MouseEvent event) {

    }

    @FXML
    void onClickedAtrasFormulario(MouseEvent event) {

        App.newStage("menu-view","MENU");

    }

    @FXML
    void onClickedCancelar(MouseEvent event) {

    }

    @FXML
    void onClickedGenerarReporte(MouseEvent event) {



    }

    @FXML
    void onClickedModificar(MouseEvent event) {

    }

    @FXML
    void onclickedAula(MouseEvent event) {

    }

    @FXML
    void onclickedColor(MouseEvent event) {

    }

    @FXML
    void onclickedUD(MouseEvent event) {

    }

    @FXML
    void onguardarnombreObjeto(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert AtrasBttn != null : "fx:id=\"AtrasBttn\" was not injected: check your FXML file 'incidencia-view.fxml'.";
        assert DescripcionobjetoCasilla != null : "fx:id=\"DescripcionobjetoCasilla\" was not injected: check your FXML file 'incidencia-view.fxml'.";
        assert GenerarreporteBttn != null : "fx:id=\"GenerarreporteBttn\" was not injected: check your FXML file 'incidencia-view.fxml'.";
        assert aulaCasilla != null : "fx:id=\"aulaCasilla\" was not injected: check your FXML file 'incidencia-view.fxml'.";
        assert calendarioCasilla != null : "fx:id=\"calendarioCasilla\" was not injected: check your FXML file 'incidencia-view.fxml'.";
        assert cancelarBttn != null : "fx:id=\"cancelarBttn\" was not injected: check your FXML file 'incidencia-view.fxml'.";
        assert colorCasilla != null : "fx:id=\"colorCasilla\" was not injected: check your FXML file 'incidencia-view.fxml'.";
        assert modificarBttn != null : "fx:id=\"modificarBttn\" was not injected: check your FXML file 'incidencia-view.fxml'.";
        assert nombreobjetoCasilla != null : "fx:id=\"nombreobjetoCasilla\" was not injected: check your FXML file 'incidencia-view.fxml'.";
        assert tipoCasilla != null : "fx:id=\"tipoCasilla\" was not injected: check your FXML file 'incidencia-view.fxml'.";
        assert udCasilla != null : "fx:id=\"udCasilla\" was not injected: check your FXML file 'incidencia-view.fxml'.";

    }

}
