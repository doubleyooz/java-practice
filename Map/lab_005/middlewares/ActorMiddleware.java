package middlewares;
import utils.Constraints;

public class ActorMiddleware {
    public boolean validStore(String name, double wage, String timetable, String legalGender, int age) {
        return (Constraints.isValidName(name) && Constraints.isValidTimetable(timetable) && Constraints.isValidLegalGender(legalGender)&& Constraints.isValidAge(age)
                && Constraints.isValidWage(wage));

    }

    public boolean[] validUpdate(String name, double wage, String timetable, String legalGender, int age) {
        boolean[] validProperties = {
                Constraints.isValidName(name),
                Constraints.isValidTimetable(timetable),
                Constraints.isValidLegalGender(legalGender),
                Constraints.isValidAge(age),
                Constraints.isValidWage(wage) };
        return validProperties;

    }

}
