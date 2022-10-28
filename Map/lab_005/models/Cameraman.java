package models;

import java.util.UUID;

import interfaces.Employee;

public class Cameraman extends Employee {
    private boolean privateEquipment;

    public Cameraman(String name, double wage, int age, boolean privateEquipment, String legalGender, UUID id) {
        super(id, name, wage, legalGender, age);
        this.privateEquipment = privateEquipment;
        

    }

    public void record(){
        System.out.println("Recording...");
    }

    public void setPrivateEquipment(boolean privateEquipment) {
        this.privateEquipment = privateEquipment;
    }

    public boolean getPrivateEquipment() {
        return this.privateEquipment;
    }

}