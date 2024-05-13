package com.supinfo.version2;

import bdd.MySqlBdd;
import bdd.Student;

public class StudentInfra {
    MySqlBdd mySqlBdd = new MySqlBdd();

    public Student getStudent (int id){
        return mySqlBdd.findStudentById(id);
    }

}
