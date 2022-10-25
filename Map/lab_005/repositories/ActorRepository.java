package repositories;

import java.util.ArrayList;
import java.util.UUID;

import interfaces.Employee;
import middlewares.ActorMiddleware;
import models.Actor;

public class ActorRepository extends StarRepository {

    public ActorRepository() {
        super(new ArrayList<Employee>());

    }

    private static ActorMiddleware middleware = new ActorMiddleware();

    public static boolean store(String name, double wage, String legalGender, String timetable, int age) {
        if (!middleware.validStore(name, wage, timetable, legalGender, age))
            return false;

        employees.add((Employee) new Actor(name, timetable, legalGender, age, wage, UUID.randomUUID()));
        return true;

    }

    public static boolean update(UUID id, String name, double wage, String legalGender, String timetable, int age) {
        if (!middleware.validStore(name, wage, timetable, legalGender, age))
            return false;

        boolean[] validProperties = middleware.validUpdate(name, wage, timetable, legalGender, age);

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                if (validProperties[0])
                    employees.get(i).setName(name);
                if (validProperties[1])
                    ((Actor) (employees.get(i))).setTimetable(timetable);
                if (validProperties[2])
                    employees.get(i).setLegalGender(legalGender);
                if (validProperties[3])
                    employees.get(i).setAge(age);
                if (validProperties[4])
                    employees.get(i).setWage(wage);
                return true;
            }
        }

        return false;

    }
}
