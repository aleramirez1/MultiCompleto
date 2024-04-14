package com.alilopez.application.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class AdministraController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button eliminarreporteBttn;

    @FXML
    private Button exitButton;

    @FXML
    private PieChart graficaBttn;

    @FXML
    private Button validarincidenciaBttn;

    @FXML
    private Button verreporteBttn;

    @FXML
    void onMouseClickExitButton(MouseEvent event) {

    }

    @FXML
    void onclickedEliminar(MouseEvent event) {

    }

    @FXML
    void onclickedValidarncidencia(MouseEvent event) {

    }

    @FXML
    void onclickedVerreporte(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert eliminarreporteBttn != null : "fx:id=\"eliminarreporteBttn\" was not injected: check your FXML file 'Administra-view.fxml'.";
        assert exitButton != null : "fx:id=\"exitButton\" was not injected: check your FXML file 'Administra-view.fxml'.";
        assert graficaBttn != null : "fx:id=\"graficaBttn\" was not injected: check your FXML file 'Administra-view.fxml'.";
        assert validarincidenciaBttn != null : "fx:id=\"validarincidenciaBttn\" was not injected: check your FXML file 'Administra-view.fxml'.";
        assert verreporteBttn != null : "fx:id=\"verreporteBttn\" was not injected: check your FXML file 'Administra-view.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Resueltos", 50),
                        new PieChart.Data("Sin resolver", 50)
                );
        graficaBttn.setData(pieChartData);
        graficaBttn.setTitle("Gráfica de incidencias");
    }
}