package src.middlewares;

import src.utils.Constraints;

public class DoctorMiddleware {

    public boolean validStore(String name, int patients) {
        return Constraints.isValidName(name) && Constraints.isValidPatients(patients);
    }

    public boolean[] validUpdate(String name, int patients, String id) {
        if(!Constraints.isValidSecurityNumber(id)){
            boolean[] temp = {};
            return temp;
        }
        
        boolean[] validProperties = {
                Constraints.isValidName(name),
                Constraints.isValidPatients(patients)
        };
        return validProperties;

    }

    public boolean validFindOne(String id){
        return Constraints.isValidSecurityNumber(id);
    }
}
