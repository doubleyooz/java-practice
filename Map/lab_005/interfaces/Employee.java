package interfaces;

import java.util.Date;
import java.util.UUID;

public abstract class Employee extends Document {

    private String name;
    private double wage;
    private final Date hiringDate;
    private String legalGender;
    private int age;

    public Employee(UUID id, String name, double wage, String legalGender, int age) {
        super(id);
        this.name = name;
        this.wage = wage;
        this.legalGender = legalGender;
        this.age = age;
        this.hiringDate = new Date();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setWage(double newWage) {
        this.wage = newWage;
    }

    public Double getWage() {
        return this.wage;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public void setLegalGender(String newLegalGender) {
        this.legalGender = newLegalGender;
    }

    public String getLegalGender() {
        return this.legalGender;
    }

    public Date getHiringDate() {
        return this.hiringDate;
    }

}
