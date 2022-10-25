package models;

import java.util.ArrayList;
import java.util.UUID;

import interfaces.Employee;
import interfaces.Star;

public class Director extends Employee implements Star {

    private String favouriteGenre;

    private ArrayList<Movie> filmography;

    public Director(String name, String favouriteGenre, int age, double wage, UUID id) {
        super(id, name, wage, favouriteGenre, age);

        this.filmography = new ArrayList<Movie>();

    }

    public void advise() {
        System.out.println("Advising...");
    }

    public void giveOrders() {
        System.out.println("Commanding...");
    }

    public void giveAutographs() {
        System.out.println("Signing...");
    }

    public void setFilmography(ArrayList<Movie> filmography) {
        this.filmography = filmography;

    }

    public ArrayList<Movie> getFilmography() {
        return this.filmography;
    }

    public String getFavouriteGenre() {
        return this.favouriteGenre;
    }

    public void setFavouriteGenre(String favouriteGenre) {
        this.favouriteGenre = favouriteGenre;
    }

}