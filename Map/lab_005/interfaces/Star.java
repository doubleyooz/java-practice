package interfaces;

import java.util.ArrayList;

import models.Movie;

public interface Star {
    public ArrayList<Movie> getFilmography();
    public void setFilmography(ArrayList<Movie> filmography);
    public void giveAutographs();
}
