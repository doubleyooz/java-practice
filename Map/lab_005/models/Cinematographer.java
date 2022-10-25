package models;

import java.util.UUID;

import interfaces.Employee;

public class Cinematographer extends Employee {
   

    public Cinematographer(String name, int age, double wage, UUID id) {
        super(id, name, wage, name, age);
        

    }

    public void adaptScene(){
        System.out.println("Adapting...");
    }

   

}