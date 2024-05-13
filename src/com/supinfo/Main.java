package com.supinfo;

import bdd.MySqlBdd;
import bdd.Student;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MySqlBdd mySqlBdd = new MySqlBdd();
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
//        System.out.println("l'id de l'étudiant est : " + id);
        Student student = mySqlBdd.findStudentById(id);
        List<Integer> notes = student.getNotes();
        int somme = 0;
        for (Integer note : notes){
            somme += note;
        }
        double moyenne = somme / notes.size();
        System.out.println(student.getName()+" : "+moyenne);
    }
}
