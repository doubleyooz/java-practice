package models;

import java.util.UUID;

import interfaces.Document;

public class Professor extends Document {
    private String name;

    public Professor(String name, UUID id) {
        super(id);
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}