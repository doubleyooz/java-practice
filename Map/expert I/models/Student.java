package models;

import java.util.UUID;

import interfaces.Document;

public class Student extends Document {
    private String name;
    private int age;

    public Student(String name, int age, UUID id) {
        super(id);
        this.name = name;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}