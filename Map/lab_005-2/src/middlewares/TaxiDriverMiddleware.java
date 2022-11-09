package src.middlewares;

import src.utils.Constraints;

public class TaxiDriverMiddleware {

    public boolean validStore(String name, int passengers) {
        return Constraints.isValidName(name) && Constraints.isValidPassengers(passengers);
    }

    public boolean[] validUpdate(String name, int passengers, String id) {
        if(!Constraints.isValidSecurityNumber(id)){
            boolean[] temp = {};
            return temp;
        }
        
        boolean[] validProperties = {
                Constraints.isValidName(name),
                Constraints.isValidPassengers(passengers)
        };
        return validProperties;

    }

    public boolean validFindOne(String id){
        return Constraints.isValidSecurityNumber(id);
    }
}
