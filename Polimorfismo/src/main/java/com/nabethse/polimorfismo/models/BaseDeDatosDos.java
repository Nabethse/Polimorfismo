package com.nabethse.polimorfismo.models;



import java.util.ArrayList;

public class BaseDeDatosDos implements GestorEstudiantes {

    private ArrayList<Student> estudents = new ArrayList<>();

    @Override
    public boolean save(Student newstudent) {
       return estudents.add(newstudent);
    }

    @Override
    public boolean update(Student editedStudent) {
        boolean found=false;
        for (int i = 0; i < estudents.size(); i++) {
            if (editedStudent.getMatricula() == estudents.get(i).getMatricula()){
                estudents.set(i,editedStudent);
                found= true;
            }
        }
        return found;
    }

    @Override
    public ArrayList<Student> getAllStudents() {
        return estudents;
    }

    @Override
    public Student findStudentByMatricula(int matricula) {
        int index = findStudentIndexByMatricula(matricula);
        if (index != -1) {
            return estudents.get(index);
        }
        return null;
    }

    private int findStudentIndexByMatricula(int matricula) {
        for (int i = 0; i < estudents.size(); i++) {
            if (estudents.get(i).getMatricula() == matricula) {
                return i;
            }
        }
        return -1;
    }
}
