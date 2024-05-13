package com.supinfo.version2;

import java.util.Scanner;

public class StudentUI {

    StudentApplication studentApplication = new StudentApplication();

    public void getMoyenne (){
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = studentApplication.getName(id);
        double moyenne = studentApplication.getMoyenne(id);
        System.out.println(name+" : "+moyenne);
    }
}
