package repositories;

import java.util.ArrayList;
import java.util.UUID;

import interfaces.Employee;
import middlewares.EmployeeMiddleware;

public class EmployeeRepository {
    protected static ArrayList<Employee> employees = new ArrayList<>();
    private static EmployeeMiddleware middleware = new EmployeeMiddleware();

    public EmployeeRepository(ArrayList<Employee> database) {
        employees = database;
    }

    protected static boolean update(UUID id, String name, double wage, String legalGender, int age) {
        if (!middleware.validStore(name, wage, legalGender, age))
            return false;

        boolean[] validProperties = middleware.validUpdate(name, wage, legalGender, age);

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                if (validProperties[0])
                    employees.get(i).setName(name);
                if (validProperties[1])
                    employees.get(i).setLegalGender(legalGender);
                if (validProperties[2])
                    employees.get(i).setAge(age);
                if (validProperties[3])
                    employees.get(i).setWage(wage);
                return true;
            }
        }

        return false;

    }

    public static Employee findOne(UUID id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return employees.get(i);
            }
        }

        return null;

    }

    public static ArrayList<Employee> list() {
        return employees;
    }

    public static void printAll() {
        System.out.println("\n[");
        for (int i = 0; i < employees.size(); i++) {

            System.out.printf("\t%d: {\n", i);
            System.out.printf("\t\tname: %s,\n", employees.get(i).getName());
            // System.out.printf("\t\ttimetable: %s,\n", employees.get(i).getTimetable());
            System.out.printf("\t\tage: %d,\n", employees.get(i).getAge());
            System.out.printf("\t\tlegalGender: %s,\n", employees.get(i).getLegalGender());
            System.out.printf("\t\twage: %.2f,\n", employees.get(i).getWage());
            System.out.printf("\t\thiringDate: %s,\n", employees.get(i).getHiringDate());
            System.out.printf("\t\tid: %s,\n", employees.get(i).getId().toString());

            /*
             * /
             * System.out.printf("\t\tfilmography: {\n");
             * for (int k = 0; k < employees.get(i).getFilmography().size(); k++) {
             * System.out.printf("\t\t\t\ttitle: %s,\n",
             * employees.get(i).getFilmography().get(k).getTitle());
             * System.out.printf("\t\t\t\treleaseDate: %s,\n",
             * employees.get(i).getFilmography().get(k).getReleaseDate());
             * }
             * 
             * System.out.printf("\t\t},\n");
             */
            System.out.printf("\t},\n");

        }
        System.out.println("]");
    }

    public static boolean delete(UUID id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {

                employees.remove(employees.get(i));
                return true;
            }
        }

        return false;

    }
}
