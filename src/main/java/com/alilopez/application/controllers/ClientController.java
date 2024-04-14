package com.alilopez.application.controllers;

import com.alilopez.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ClientController {


    @FXML
    private CheckBox ClickRecordarmr;

    @FXML
    private Button IngresarButtonIniciarSes;

    @FXML
    private Button atrasButtonIniciarSes;

    @FXML
    private Button closeButton;

    @FXML
    private PasswordField contra1Casilla;

    @FXML
    private TextField matriculaCasilla;

    @FXML
    void onClickCerrar(MouseEvent event) {
    }

    @FXML
    void onClickClAtras(MouseEvent event) {
        App.newStage("home-view", "HOME");
    }
    @FXML
    void onClickClIngresar(MouseEvent event) {
        String matricula = matriculaCasilla.getText();
        String contra = contra1Casilla.getText();

        if (matricula.isEmpty() || contra.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Campos Vacíos");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, complete todos los campos.");
            alert.showAndWait();
        } else {
            boolean usuarioRegistrado = false;
            for (String usuario : RegistrarseController.listaUsuarios) {
                String[] datosUsuario = usuario.split(",");
                if (datosUsuario.length == 2 && datosUsuario[0].equals(matricula) && datosUsuario[1].equals(contra)) {
                    usuarioRegistrado = true;
                    break;
                }
            }
            if (usuarioRegistrado) {
                // Si la matrícula y la contraseña son correctas, abrimos el menú
                App.newStage("menu-view", "MENU");
            } else {
                // Si la matrícula o la contraseña son incorrectas, mostramos la alerta correspondiente
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Matrícula o contraseña incorrecta");
                alert.setHeaderText(null);
                alert.setContentText("La matrícula o la contraseña ingresada es incorrecta.");
                alert.showAndWait();
            }
        }
    }



    @FXML
    void initialize() {
        assert ClickRecordarmr != null : "fx:id=\"ClickRecordarmr\" was not injected: check your FXML file 'client-view.fxml'.";
        assert IngresarButtonIniciarSes != null : "fx:id=\"IngresarButtonIniciarSes\" was not injected: check your FXML file 'client-view.fxml'.";
        assert atrasButtonIniciarSes != null : "fx:id=\"atrasButtonIniciarSes\" was not injected: check your FXML file 'client-view.fxml'.";
        assert closeButton != null : "fx:id=\"closeButton\" was not injected: check your FXML file 'client-view.fxml'.";
        assert contra1Casilla != null : "fx:id=\"contra1Casilla\" was not injected: check your FXML file 'client-view.fxml'.";
        assert matriculaCasilla != null : "fx:id=\"matriculaCasilla\" was not injected: check your FXML file 'client-view.fxml'.";
    }

}
