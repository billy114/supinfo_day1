package com.supinfo.version2;

import bdd.Student;

import java.util.List;

public class StudentDomain {
    StudentInfra studentInfra = new StudentInfra();

    public String getName(int id) {
        Student student = studentInfra.getStudent(id);
        return student.getName();
    }

    public double getMoyenne(int id) {
        Student student = studentInfra.getStudent(id);
        List<Integer> notes = student.getNotes();
        int somme = 0;
        for (Integer note : notes){
            somme += note;
        }
        double moyenne = somme / notes.size();
        return moyenne;
    }
}
