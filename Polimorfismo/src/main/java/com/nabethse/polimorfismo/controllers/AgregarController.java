package com.nabethse.polimorfismo.controllers;

import com.nabethse.polimorfismo.HelloApplication;
import com.nabethse.polimorfismo.models.*;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class AgregarController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Edad;

    @FXML
    private TextField Matricula;

    @FXML
    private TextField Nombre;

    @FXML
    private Button agregarE;

    @FXML
    private Button salir;

    @FXML
    void onClickagregarE(MouseEvent event) {
        if (Matricula.getText().trim().isEmpty() || Nombre.getText().trim().isEmpty() || Edad.getText().trim().isEmpty()){
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Los campos están vacíos");
            alert.showAndWait();
        } else {
            try {
                String nombre = Nombre.getText();
                int matricula = Integer.parseInt(Matricula.getText());
                int edad = Integer.parseInt(Edad.getText());
                Student student = new Student(matricula, nombre, edad);
                if (HelloApplication.getUniversidad().addStudent(student)) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Éxito");
                    alert.setHeaderText(null);
                    alert.setContentText("Estudiante agregado exitosamente");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Informacion");
                    alert.setContentText("No se ha podido añadir");
                    alert.showAndWait();
                }

            } catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setContentText("Error al agregar");
                alert.showAndWait();
            }
        }
    }

    @FXML
    void onClicksalir(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void initialize() {
        assert Edad != null : "fx:id=\"Edad\" was not injected: check your FXML file 'agregar-view.fxml'.";
        assert Matricula != null : "fx:id=\"Matricula\" was not injected: check your FXML file 'agregar-view.fxml'.";
        assert Nombre != null : "fx:id=\"Nombre\" was not injected: check your FXML file 'agregar-view.fxml'.";
        assert agregarE != null : "fx:id=\"agregarE\" was not injected: check your FXML file 'agregar-view.fxml'.";
        assert salir != null : "fx:id=\"salir\" was not injected: check your FXML file 'agregar-view.fxml'.";

    }
}
