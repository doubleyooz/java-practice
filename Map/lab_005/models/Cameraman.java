package models;

import java.util.UUID;

import interfaces.Employee;

public class Cameraman extends Employee {
    private boolean privateEquipment;

    public Cameraman(String name, double wage, int age, boolean privateEquipment, UUID id) {
        super(id, name, wage, name, age);
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