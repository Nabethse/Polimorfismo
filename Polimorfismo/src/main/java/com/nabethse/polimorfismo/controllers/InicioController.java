package com.nabethse.polimorfismo.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.nabethse.polimorfismo.HelloApplication;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class InicioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ingresar;

    @FXML
    private Button salir;

    @FXML
    private Label welcomeText;

    @FXML
    void onClickingresar(MouseEvent event) {
        HelloApplication.newStage("opciones-view", "OPCIONES");
    }

    @FXML
    void onClicksalir(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    void initialize() {
        assert ingresar != null : "fx:id=\"ingresar\" was not injected: check your FXML file 'inicio-view.fxml'.";
        assert salir != null : "fx:id=\"salir\" was not injected: check your FXML file 'inicio-view.fxml'.";
        assert welcomeText != null : "fx:id=\"welcomeText\" was not injected: check your FXML file 'inicio-view.fxml'.";

    }

}

