package src.repositories;

import java.util.ArrayList;

import src.middlewares.TaxiDriverMiddleware;
import src.models.TaxiDriver;

public class TaxiDriverRepository extends TaxPayerRepository {

    private static TaxiDriverMiddleware middleware = new TaxiDriverMiddleware();

    public static boolean store(String name, boolean ownsHouse, boolean ownsCar, int passengers) {
        if (!middleware.validStore(name, passengers))
            return false;

        taxPayers.add(new TaxiDriver(name, ownsHouse, ownsCar, passengers));

        return true;

    }

    public static boolean update(String name, int passengers, String id) {

        boolean[] validProperties = middleware.validUpdate(name, passengers, id);

        if (validProperties.length == 0)
            return false;

        for (int i = 0; i < taxPayers.size(); i++) {
            if (taxPayers.get(i).getSecurityNumber().equals(id)) {
                if (validProperties[0])
                    taxPayers.get(i).setName(name);

                if (validProperties[1])
                    ((TaxiDriver) taxPayers.get(i)).setPassengers(passengers);

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
            System.out.printf("\t\tpassengers: %d,\n", ((TaxiDriver) taxPayers.get(i)).getPassengers());
            System.out.printf("\t\tsecurityNumber: %s,\n", taxPayers.get(i).getSecurityNumber());
            System.out.printf("\t},\n");

        }
        System.out.println("]");
    }
}