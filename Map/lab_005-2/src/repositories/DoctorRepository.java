package src.repositories;

import java.util.ArrayList;

import src.interfaces.TaxPayerRepository;
import src.middlewares.DoctorMiddleware;
import src.models.Doctor;

public class DoctorRepository implements TaxPayerRepository{
    private static ArrayList<Doctor> doctors = new ArrayList<Doctor>();

    private static DoctorMiddleware middleware = new DoctorMiddleware();

    public static boolean store(String name, boolean ownsHouse, boolean ownsCar, int patients) {
        if (!middleware.validStore(name, patients))
            return false;

        doctors.add(new Doctor(name, ownsHouse, ownsCar, patients));

        return true;

    }

    public static boolean update(String name, int patients, String id) {

        boolean[] validProperties = middleware.validUpdate(name, patients, id);

        if (validProperties.length == 0)
            return false;

        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getSecurityNumber().equals(id)) {
                if (validProperties[0])
                    doctors.get(i).setName(name);

                if (validProperties[1])
                    doctors.get(i).setPatients(patients);
                ;

                return true;
            }
        }
        return false;

    }

    public static Doctor findOne(String id) {
        if (!middleware.validFindOne(id))
            return null;

        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getSecurityNumber().equals(id)) {
                return doctors.get(i);
            }
        }

        return null;

    }

    public static ArrayList<Doctor> list() {
        return doctors;
    }

    public static void printAll() {
        System.out.println("\n[");
        for (int i = 0; i < doctors.size(); i++) {

            System.out.printf("\t%d: {\n", i);
            System.out.printf("\t\tname: %s,\n", doctors.get(i).getName());
            System.out.printf("\t\townsHouse: %b,\n", doctors.get(i).getOwnsHouse());
            System.out.printf("\t\townsCar: %b,\n", doctors.get(i).getOwnsCar());
            System.out.printf("\t\tpatients: %d,\n", doctors.get(i).getPatients());
            System.out.printf("\t\tsecurityNumber: %s,\n", doctors.get(i).getSecurityNumber());
            System.out.printf("\t},\n");

        }
        System.out.println("]");
    }

    public static boolean delete(String id) {
        if (middleware.validFindOne(id))
            return false;
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getSecurityNumber().equals(id)) {

                doctors.remove(doctors.get(i));
                return true;
            }
        }

        return false;

    }
}
