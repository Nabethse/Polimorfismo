package com.nabethse.polimorfismo.controllers;

import com.nabethse.polimorfismo.HelloApplication;
import com.nabethse.polimorfismo.models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class EditarController {

    @FXML
    private TextField Matricula;

    @FXML
    private TextField Nombre;

    @FXML
    private TextField Edad;

    @FXML
    private Button editar;

    @FXML
    private Button salir;

    @FXML
    void onClickeditar(MouseEvent event) {
        String matriculaText = Matricula.getText().trim();
        String nombre = Nombre.getText().trim();
        String edadText = Edad.getText().trim();

        if (matriculaText.isEmpty() || nombre.isEmpty() || edadText.isEmpty()) {
            mostrarAlerta("Error", "Los campos están vacíos");
        } else {
            try {
                int matricula = Integer.parseInt(matriculaText);
                int edad = Integer.parseInt(edadText);

                // Buscar al estudiante por matrícula
                Student student = HelloApplication.getUniversidad().findStudentByMatricula(matricula);

                if (student != null) {
                    // Actualizar los datos del estudiante
                    student.setNombre(nombre);
                    student.setEdad(edad);

                    // Actualizar al estudiante en la universidad
                    boolean resultado = HelloApplication.getUniversidad().updateStudent(student);

                    if (resultado) {
                        mostrarAlerta("Hecho", "Estudiante editado con éxito");
                    } else {
                        mostrarAlerta("Información", "Error al editar estudiante");
                    }
                } else {
                    mostrarAlerta("Información", "No se encontró ningún estudiante con la matrícula especificada");
                }
            } catch (NumberFormatException e) {
                mostrarAlerta("Error", "Por favor, ingrese números válidos para la matrícula y la edad");
            } catch (Exception e) {
                mostrarAlerta("Error", "No se pudo editar al estudiante");
            }
        }
    }

    @FXML
    void onClicksalir(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    private void mostrarAlerta(String titulo, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
