package repositories;

import java.util.ArrayList;

import interfaces.Employee;
import interfaces.Star;


public class StarRepository extends EmployeeRepository {

    public StarRepository(ArrayList<Employee> database) {
        super(database);
    }

    public static void printAll() {
        System.out.println("\n[");
        for (int i = 0; i < employees.size(); i++) {

            System.out.printf("\t%d: {\n", i);
            System.out.printf("\t\tname: %s,\n", employees.get(i).getName());
            // System.out.printf("\t\ttimetable: %s,\n",
            // ((Star)employees.get(i)).getTimetable());
            System.out.printf("\t\tage: %d,\n", employees.get(i).getAge());
            System.out.printf("\t\tlegalGender: %s,\n", employees.get(i).getLegalGender());
            System.out.printf("\t\twage: %.2f,\n", employees.get(i).getWage());
            System.out.printf("\t\thiringDate: %s,\n", employees.get(i).getHiringDate());
            System.out.printf("\t\tid: %s,\n", employees.get(i).getId().toString());

            System.out.printf("\t\tfilmography: {\n");
            for (int k = 0; k < ((Star) employees.get(i)).getFilmography().size(); k++) {
                System.out.printf("\t\t\t\ttitle: %s,\n", ((Star) employees.get(i)).getFilmography().get(k).getTitle());
                System.out.printf("\t\t\t\treleaseDate: %s,\n",
                        ((Star) employees.get(i)).getFilmography().get(k).getReleaseDate());
            }

            System.out.printf("\t\t},\n");

            System.out.printf("\t},\n");

        }
        System.out.println("]");
    }

}
