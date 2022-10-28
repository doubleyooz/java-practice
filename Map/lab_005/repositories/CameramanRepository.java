package repositories;

import java.util.ArrayList;
import java.util.UUID;

import interfaces.Employee;
import middlewares.EmployeeMiddleware;
import models.Cameraman;

public class CameramanRepository extends EmployeeRepository {

    public CameramanRepository() {
        super(new ArrayList<Employee>());

    }

    private static EmployeeMiddleware middleware = new EmployeeMiddleware();

    public static boolean store(String name, double wage, String legalGender, boolean privateEquipment, int age) {
        if (!middleware.validStore(name, wage, legalGender, age))
            return false;

        employees.add((Employee) new Cameraman(name, wage, age, privateEquipment, legalGender, UUID.randomUUID()));
        return true;

    }

   
}
