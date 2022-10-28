package repositories;

import java.util.ArrayList;
import java.util.UUID;

import middlewares.MovieMiddleware;
import models.Movie;

public class MovieRepository {

    private static ArrayList<Movie> movies = new ArrayList<Movie>();
    private static MovieMiddleware middleware = new MovieMiddleware();

    public static boolean store(String title) {
        if (!middleware.validStore(title))
            return false;

        movies.add(new Movie(UUID.randomUUID(), title));
        return true;
    }

    protected static boolean update(UUID id, String title) {
        if (!middleware.validStore(title))
            return false;

        boolean[] validProperties = middleware.validUpdate(title);

        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getId() == id) {
                if (validProperties[0])
                    movies.get(i).setTitle(title);

                return true;
            }
        }

        return false;

    }

    public static void printAll() {
        System.out.println("\n[");
        for (int i = 0; i < movies.size(); i++) {

            System.out.printf("\t%d: {\n", i);
            System.out.printf("\t\ttitle: %s,\n", movies.get(i).getTitle());
            System.out.printf("\t\treleaseDate: %s,\n", movies.get(i).getReleaseDate());
            System.out.printf("\t\tid: %s,\n", movies.get(i).getId().toString());

            System.out.printf("\t\tcast: {\n");
            for (int k = 0; k < (movies.get(i)).getCast().size(); k++) {
                System.out.printf("\t\t\t\tid: %s,\n", (movies.get(i).getCast().get(k)).getId().toString());
                System.out.printf("\t\t\t\tname: %s,\n", (movies.get(i).getCast().get(k)).getName());
                System.out.printf("\t\t\t\twage: %.2f,\n", (movies.get(i).getCast().get(k)).getWage());
                System.out.printf("\t\t\t\tage: %d,\n", (movies.get(i).getCast().get(k)).getAge());
                System.out.printf("\t\t\t\ttimetable: %s,\n", (movies.get(i).getCast().get(k)).getTimetable());
                System.out.printf("\t\t\t\tlegalGender: %s,\n", (movies.get(i).getCast().get(k)).getLegalGender());
                System.out.printf("\t\t\t\thiringDate: %s,\n",
                        (movies.get(i).getCast().get(k)).getHiringDate().toString());

            }

            System.out.printf("\t\t},\n");

            System.out.printf("\t},\n");

        }
        System.out.println("]");
    }

    public static Movie findOne(UUID id) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getId() == id) {
                return movies.get(i);
            }
        }

        return null;

    }

    public static ArrayList<Movie> list() {
        return movies;
    }

    public static boolean delete(UUID id) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getId() == id) {

                movies.remove(movies.get(i));
                return true;
            }
        }

        return false;

    }
}
