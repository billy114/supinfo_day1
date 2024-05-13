package bdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySqlBdd {
    Map<Integer, Student> studentsBdd = new HashMap<>();

    public MySqlBdd(){
        List<Integer> notesStudent1 = new ArrayList<>(
                List.of(12, 15, 20)
        );
        Student student1 = new Student("Jhon", notesStudent1);
        studentsBdd.put(1, student1);

        List<Integer> notesStudent2 = new ArrayList<>(
                List.of(16, 19, 20)
        );
        Student student2 = new Student("Mariama", notesStudent2);
        studentsBdd.put(2, student2);
    }

    public Student findStudentById (Integer id){
        return studentsBdd.get(id);
    }
}


