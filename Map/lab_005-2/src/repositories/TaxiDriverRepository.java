package src.repositories;

import java.util.ArrayList;

import src.middlewares.TaxiDriverMiddleware;
import src.models.TaxiDriver;

public class TaxiDriverRepository {
    private static ArrayList<TaxiDriver> taxiDrivers = new ArrayList<TaxiDriver>();

    private static TaxiDriverMiddleware middleware = new TaxiDriverMiddleware();

    public static boolean store(String name, boolean ownsHouse, boolean ownsCar, int passengers) {
        if (!middleware.validStore(name, passengers))
            return false;

        taxiDrivers.add(new TaxiDriver(name, ownsHouse, ownsCar, passengers));

        return true;

    }

    public static boolean update(String name, int passengers, String id) {

        boolean[] validProperties = middleware.validUpdate(name, passengers, id);

        if (validProperties.length == 0)
            return false;

        for (int i = 0; i < taxiDrivers.size(); i++) {
            if (taxiDrivers.get(i).getSecurityNumber().equals(id)) {
                if (validProperties[0])
                    taxiDrivers.get(i).setName(name);

                if (validProperties[1])
                    taxiDrivers.get(i).setPassengers(passengers);
                

                return true;
            }
        }
        return false;

    }

    public static TaxiDriver findOne(String id) {
        if (!middleware.validFindOne(id))
            return null;

        for (int i = 0; i < taxiDrivers.size(); i++) {
            if (taxiDrivers.get(i).getSecurityNumber().equals(id)) {
                return taxiDrivers.get(i);
            }
        }

        return null;

    }

    public static ArrayList<TaxiDriver> list() {
        return taxiDrivers;
    }

    public static void printAll() {
        System.out.println("\n[");
        for (int i = 0; i < taxiDrivers.size(); i++) {

            System.out.printf("\t%d: {\n", i);
            System.out.printf("\t\tname: %s,\n", taxiDrivers.get(i).getName());
            System.out.printf("\t\townsHouse: %b,\n", taxiDrivers.get(i).getOwnsHouse());
            System.out.printf("\t\townsCar: %b,\n", taxiDrivers.get(i).getOwnsCar());
            System.out.printf("\t\twage: %.2f,\n", taxiDrivers.get(i).getWage());
            System.out.printf("\t\tsecurityNumber: %s,\n", taxiDrivers.get(i).getSecurityNumber());
            System.out.printf("\t},\n");

        }
        System.out.println("]");
    }

    public static boolean delete(String id) {
        if (middleware.validFindOne(id))
            return false;
        for (int i = 0; i < taxiDrivers.size(); i++) {
            if (taxiDrivers.get(i).getSecurityNumber().equals(id)) {

                taxiDrivers.remove(taxiDrivers.get(i));
                return true;
            }
        }

        return false;

    }
}
