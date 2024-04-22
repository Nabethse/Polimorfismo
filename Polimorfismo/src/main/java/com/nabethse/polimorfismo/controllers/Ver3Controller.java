package com.nabethse.polimorfismo.controllers;

import com.nabethse.polimorfismo.HelloApplication;
import com.nabethse.polimorfismo.models.Student;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Ver3Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Salir;

    @FXML
    private TableView<Student> TableStudents;

    @FXML
    private TableColumn<Student,Integer> edadColumn;

    @FXML
    private TableColumn<Student,Integer> matriculaColumn;

    @FXML
    private TableColumn<Student,String> nombreColumn;

    @FXML
    void onClickSalir(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void initialize() {
        matriculaColumn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getMatricula()).asObject());
        nombreColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        edadColumn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getEdad()).asObject());

        ArrayList<Student> studentsList = HelloApplication.getUniversidad().getStudentBase3();

        ObservableList<Student> students = FXCollections.observableArrayList(studentsList);

        TableStudents.setItems(students);
    }

}
