package com.alilopez.application;

import com.alilopez.application.models.HistorialIncidencia;
import com.alilopez.application.models.HistorialSolicitudIncidencia;
import com.alilopez.application.models.Usuario;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;
import java.io.IOException;
import java.util.ArrayList;

public class App extends Application {

    private static Stage stageView;
    private static Stage stageRoot;
    private static HistorialIncidencia historialIncidencia;
    private static HistorialSolicitudIncidencia historialSolicitudIncidencia;
    public static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void loadView(String s, String Home) {
        App.loadView("home-view.fxml", "Home");
    }

    @Override
    public void start(Stage stage) throws IOException {
        stageRoot = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setTitle("Objetos Perdidos - Home");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();



    }

    public static void newStage(String fxml, String title) {
        stageView = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(loadFXML(fxml));
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            stageView.setTitle(title);
            stageView.setScene(scene);
            stageView.centerOnScreen();
            stageView.initOwner(stageRoot);
            stageView.initModality(Modality.APPLICATION_MODAL);
            stageView.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Stage getStageView() {
        return stageView;
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        Usuario admin = new Usuario("", "123", 100, "correo@gmail.com", 0);
        Usuario alumnoPrueba = new Usuario("", "250", 123456, "proyecto@gmail.com", 2);

        usuarios.add(admin);
        usuarios.add(alumnoPrueba);

        launch(args);
    }

    public static void buscarIncidencia() {

    }

    public static void añadirIncidencia() {

    }

    public static void eliminarIncidencia() {
    }

    public static void buscarSolicitud() {

    }

    public static void añadirSolicitud() {

    }

    public static void eliminarSolicitud() {

    }

    public static void añadirAlumno(String nombre, String contraseña, int matricula, String correo, int cuatrimestre) {
        Usuario user = new Usuario(nombre, contraseña, matricula, correo, cuatrimestre);
        usuarios.add(user);
    }

    public static void validarAlumno() {

    }
}