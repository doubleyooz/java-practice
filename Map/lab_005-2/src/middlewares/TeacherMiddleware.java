package src.middlewares;

import src.utils.Constraints;

public class TeacherMiddleware {

    public boolean validStore(String name, double wage) {
        return Constraints.isValidName(name) && Constraints.isValidWage(wage);
    }

    public boolean[] validUpdate(String name, double wage, String id) {
        if(!Constraints.isValidSecurityNumber(id)){
            boolean[] temp = {};
            return temp;
        }
        
        boolean[] validProperties = {
                Constraints.isValidName(name),
                Constraints.isValidWage(wage)
        };
        return validProperties;

    }

    public boolean validFindOne(String id){
        return Constraints.isValidSecurityNumber(id);
    }
}
