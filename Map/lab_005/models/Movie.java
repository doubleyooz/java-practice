package models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import interfaces.Document;

public class Movie extends Document{
    private String title;
    private Date releaseDate;

    public ArrayList<Actor> cast;
    public ArrayList<Director> directors;

    public Movie(UUID id, String title) {
        super(id);
        this.title = title;
        this.cast = new ArrayList<Actor>();
        this.directors = new ArrayList<Director>();
        
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.YEAR, 3);
        this.releaseDate = c.getTime();
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    }

    public Date getReleaseDate(){
        return this.releaseDate;
    }
    

    public void setCast(ArrayList<Actor> cast){
        this.cast = cast;
    }

    public ArrayList<Actor> getCast(){
        return this.cast;
    }

    public void setdirectors(ArrayList<Director> directors){
        this.directors = directors;
    }

    public ArrayList<Director> getDirectors(){
        return this.directors;
    }

  
    
}
