package src.repositories;

import java.util.ArrayList;

import src.middlewares.TeacherMiddleware;
import src.models.Teacher;

public class TeacherRepository extends TaxPayerRepository {

    private static TeacherMiddleware middleware = new TeacherMiddleware();

    public static boolean store(String name, boolean ownsHouse, boolean ownsCar, double wage) {
        if (!middleware.validStore(name, wage))
            return false;

        taxPayers.add(new Teacher(name, ownsHouse, ownsCar, wage));

        return true;

    }

    public static boolean update(String name, double wage, String id) {

        boolean[] validProperties = middleware.validUpdate(name, wage, id);

        if (validProperties.length == 0)
            return false;

        for (int i = 0; i < taxPayers.size(); i++) {
            if (taxPayers.get(i).getSecurityNumber().equals(id)) {
                if (validProperties[0])
                    taxPayers.get(i).setName(name);

                if (validProperties[1])
                    ((Teacher) taxPayers.get(i)).setWage(wage);

                return true;
            }
        }
        return false;

    }

    public static void printAll() {
        System.out.println("\n[");
        for (int i = 0; i < taxPayers.size(); i++) {

            System.out.printf("\t%d: {\n", i);
            System.out.printf("\t\tname: %s,\n", taxPayers.get(i).getName());
            System.out.printf("\t\townsHouse: %b,\n", taxPayers.get(i).getOwnsHouse());
            System.out.printf("\t\townsCar: %b,\n", taxPayers.get(i).getOwnsCar());
            System.out.printf("\t\twage: %.2f,\n", ((Teacher) taxPayers.get(i)).getWage());
            System.out.printf("\t\tsecurityNumber: %s,\n", taxPayers.get(i).getSecurityNumber());
            System.out.printf("\t},\n");

        }
        System.out.println("]");
    }

}
