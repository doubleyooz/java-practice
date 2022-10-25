package models;

import java.util.ArrayList;
import java.util.UUID;

import interfaces.Employee;
import interfaces.Star;

public class Actor extends Employee implements Star{
    
    private String timetable;
    

    private ArrayList<Movie> filmography;
    
    public Actor(String name, String timetable, String legalGender, int age, double wage, UUID id) {
        super(id, name, wage, legalGender, age);
        this.timetable = timetable;
        this.filmography = new ArrayList<Movie>();
    
    }

    public void act(){
        System.out.println("acting...");
    }

    public void giveAutographs(){
        System.out.println("Denying...");
    }

    public void setFilmography(ArrayList<Movie> filmography){
        this.filmography = filmography;

    }

    public ArrayList<Movie> getFilmography() {
        return this.filmography;
    }

    public String getTimetable() {
        return this.timetable;
    }


    public void setTimetable(String timetable){
        this.timetable = timetable;
    }

}