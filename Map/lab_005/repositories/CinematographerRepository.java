package repositories;

import java.util.ArrayList;
import java.util.UUID;

import interfaces.Employee;
import middlewares.EmployeeMiddleware;
import models.Cinematographer;

public class CinematographerRepository extends EmployeeRepository {

    public CinematographerRepository() {
        super(new ArrayList<Employee>());

    }

    private static EmployeeMiddleware middleware = new EmployeeMiddleware();

    public static boolean store(String name, double wage, String legalGender, int age) {
        if (!middleware.validStore(name, wage, legalGender, age))
            return false;

        employees.add((Employee) new Cinematographer(name, wage, age, legalGender, UUID.randomUUID()));
        return true;

    }

}
