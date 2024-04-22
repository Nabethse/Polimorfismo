package com.nabethse.polimorfismo.models;

import java.util.ArrayList;

public interface GestorEstudiantes {
    boolean save(Student newstudent);
    boolean update(Student editedStudent);
    ArrayList<Student> getAllStudents();
    Student findStudentByMatricula(int matricula);
}

