package bdd;

import java.util.List;

public class Student {
    private String name;
    private List<Integer> notes;

    public Student(String name, List<Integer> notes) {
        this.name = name;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNotes() {
        return notes;
    }
}
