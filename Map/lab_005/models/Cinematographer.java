package models;

import java.util.UUID;

import interfaces.Employee;

public class Cinematographer extends Employee {

    public Cinematographer(String name, double wage, int age, String legalGender, UUID id) {
        super(id, name, wage, legalGender, age);

    }

    public void adaptScene() {
        System.out.println("Adapting...");
    }

}