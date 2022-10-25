package middlewares;
import utils.Constraints;

public class EmployeeMiddleware {
    public boolean validStore(String name, double wage, String legalGender, int age) {
        return (Constraints.isValidName(name) && Constraints.isValidLegalGender(legalGender) && Constraints.isValidAge(age)
                && Constraints.isValidWage(wage));

    }

    public boolean[] validUpdate(String name, double wage, String legalGender, int age) {
        boolean[] validProperties = {
                Constraints.isValidName(name),
                Constraints.isValidLegalGender(legalGender),
                Constraints.isValidAge(age),
                Constraints.isValidWage(wage) };
        return validProperties;

    }

}
