package se.lexicon.workshop_14.data_access.model;

import java.util.Objects;

public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        setId(id);
        setName(name);
    }

    public Student(String name) {
        setName(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Objects.requireNonNull(name);
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
