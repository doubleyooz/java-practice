package src.repositories;

import java.util.ArrayList;

import src.middlewares.TeacherMiddleware;
import src.models.Teacher;

public class TeacherRepository {
    private static ArrayList<Teacher> teachers = new ArrayList<Teacher>();

    private static TeacherMiddleware middleware = new TeacherMiddleware();

    public static boolean store(String name, boolean ownsHouse, boolean ownsCar, double wage) {
        if (!middleware.validStore(name, wage))
            return false;

        teachers.add(new Teacher(name, ownsHouse, ownsCar, wage));

        return true;

    }

    public static boolean update(String name, double wage, String id) {

        boolean[] validProperties = middleware.validUpdate(name, wage, id);

        if (validProperties.length == 0)
            return false;

        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getSecurityNumber().equals(id)) {
                if (validProperties[0])
                    teachers.get(i).setName(name);

                if (validProperties[1])
                    teachers.get(i).setWage(wage);
                

                return true;
            }
        }
        return false;

    }

    public static Teacher findOne(String id) {
        if (!middleware.validFindOne(id))
            return null;

        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getSecurityNumber().equals(id)) {
                return teachers.get(i);
            }
        }

        return null;

    }

    public static ArrayList<Teacher> list() {
        return teachers;
    }

    public static void printAll() {
        System.out.println("\n[");
        for (int i = 0; i < teachers.size(); i++) {

            System.out.printf("\t%d: {\n", i);
            System.out.printf("\t\tname: %s,\n", teachers.get(i).getName());
            System.out.printf("\t\townsHouse: %b,\n", teachers.get(i).getOwnsHouse());
            System.out.printf("\t\townsCar: %b,\n", teachers.get(i).getOwnsCar());
            System.out.printf("\t\twage: %.2f,\n", teachers.get(i).getWage());
            System.out.printf("\t\tsecurityNumber: %s,\n", teachers.get(i).getSecurityNumber());
            System.out.printf("\t},\n");

        }
        System.out.println("]");
    }

    public static boolean delete(String id) {
        if (middleware.validFindOne(id))
            return false;
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getSecurityNumber().equals(id)) {

                teachers.remove(teachers.get(i));
                return true;
            }
        }

        return false;

    }
}
