package com.supinfo.version2;

public class StudentApplication {
    StudentDomain studentDomain = new StudentDomain();

    public String getName (int id){
        return studentDomain.getName(id);
    };

    public double getMoyenne (int id){
        return studentDomain.getMoyenne(id);
    }
}
