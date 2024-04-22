package com.nabethse.polimorfismo.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.nabethse.polimorfismo.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class OpcionesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Ver2;

    @FXML
    private Button Ver3;

    @FXML
    private Button agregar;

    @FXML
    private Button editar;

    @FXML
    private Button salir;

    @FXML
    private Button ver;

    @FXML
    void onClickVer3(MouseEvent event) {
        HelloApplication.newStage("ver3-view","Base3");
    }

    @FXML
    void onClickagregar(MouseEvent event) {
        HelloApplication.newStage("agregar-view","AGREGAR");
    }

    @FXML
    void onClickeditar(MouseEvent event) {
        HelloApplication.newStage("editar-view","EDITAR");
    }

    @FXML
    void onClicksalir(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void onClickver(MouseEvent event) {
        HelloApplication.newStage("ver-view","BASE1");
    }

    @FXML
    void onclickVer2(MouseEvent event) {
        HelloApplication.newStage("ver2-view","BASE2");
    }

    @FXML
    void initialize() {
        assert Ver2 != null : "fx:id=\"Ver2\" was not injected: check your FXML file 'opciones-view.fxml'.";
        assert Ver3 != null : "fx:id=\"Ver3\" was not injected: check your FXML file 'opciones-view.fxml'.";
        assert agregar != null : "fx:id=\"agregar\" was not injected: check your FXML file 'opciones-view.fxml'.";
        assert editar != null : "fx:id=\"editar\" was not injected: check your FXML file 'opciones-view.fxml'.";
        assert salir != null : "fx:id=\"salir\" was not injected: check your FXML file 'opciones-view.fxml'.";
        assert ver != null : "fx:id=\"ver\" was not injected: check your FXML file 'opciones-view.fxml'.";

    }

}
