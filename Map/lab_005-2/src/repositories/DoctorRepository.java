package src.repositories;


import src.middlewares.DoctorMiddleware;
import src.models.Doctor;

public class DoctorRepository extends TaxPayerRepository {

    private static DoctorMiddleware middleware = new DoctorMiddleware();

    public static boolean store(String name, boolean ownsHouse, boolean ownsCar, int patients) {
        if (!middleware.validStore(name, patients))
            return false;

        taxPayers.add(new Doctor(name, ownsHouse, ownsCar, patients));

        return true;

    }

    public static boolean update(String name, int patients, String id) {

        boolean[] validProperties = middleware.validUpdate(name, patients, id);

        if (validProperties.length == 0)
            return false;

        for (int i = 0; i < taxPayers.size(); i++) {
            if (taxPayers.get(i).getSecurityNumber().equals(id)) {
                if (validProperties[0])
                    taxPayers.get(i).setName(name);

                if (validProperties[1])
                    ((Doctor) taxPayers.get(i)).setPatients(patients);

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
            System.out.printf("\t\tpatients: %d,\n", ((Doctor) taxPayers.get(i)).getPatients());
            System.out.printf("\t\tsecurityNumber: %s,\n", taxPayers.get(i).getSecurityNumber());
            System.out.printf("\t},\n");

        }
        System.out.println("]");
    }

}