package com.nabethse.polimorfismo.models;

import java.util.ArrayList;

public class Universidad {
    private GestorEstudiantes studentsBase1 = new BaseDeDatosUno();
    private GestorEstudiantes studentsBase2 = new  BaseDeDatosDos();
    private GestorEstudiantes studentBase3 = new BaseDeDatosTres();



    public boolean addStudent(Student newstudent) {
        boolean bandera;
        if (studentsBase1.save(newstudent)&& studentsBase2.save(newstudent)&& studentBase3.save(newstudent)){
            System.out.println("Agegado con exito");
            bandera= true;
        }
        else {
            bandera= false;
            System.out.println("No se a podido agregar");
        }
        return bandera;
    }

    public boolean updateStudent(Student editedStudent) {
        boolean result = false;
        if (studentsBase1.update(editedStudent) ||
                studentsBase2.update(editedStudent) ||
                studentBase3.update(editedStudent)) {
            result = true;
            System.out.println("Editado con éxito");
        } else {
            System.out.println("Error al editar");
        }
        return result;
    }

    public Student findStudentByMatricula(int matricula) {
        Student student = studentsBase1.findStudentByMatricula(matricula);
        if (student == null) {
            student = studentsBase2.findStudentByMatricula(matricula);
        }
        if (student == null) {
            student = studentBase3.findStudentByMatricula(matricula);
        }
        return student;
    }
    public ArrayList<Student> getStudentBase1(){
        return studentsBase1.getAllStudents();
    }
    public ArrayList<Student> getStudentBase2(){
        return studentsBase2.getAllStudents();
    }
    public ArrayList<Student> getStudentBase3(){
        return studentsBase2.getAllStudents();
    }
}


