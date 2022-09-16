package models;

import java.util.ArrayList;
import java.util.UUID;

import interfaces.Document;

public class Course extends Document {
    private String name;
    private String timetable;

    private ArrayList<Student> students;
    private Professor professor = null;

    public Course(String name, String timetable, UUID id) {
        super(id);
        this.name = name;
        this.timetable = timetable;
        this.students = new ArrayList<Student>();
    
    }

    public void setStudents(ArrayList<Student> students){
        this.students = students;

    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public String getTimetable() {
        return this.timetable;
    }

    public String getName() {
        return this.name;
    }

    public void setTimetable(String timetable){
        this.timetable = timetable;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public Professor getProfessor() {
        return this.professor;
    }
}