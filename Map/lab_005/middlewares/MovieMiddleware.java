package middlewares;

import utils.Constraints;

public class MovieMiddleware {
    public boolean validStore(String title) {
        return (Constraints.isValidTitle(title));

    }

    public boolean[] validUpdate(String name) {
        boolean[] validProperties = {
                Constraints.isValidName(name),
        };
        return validProperties;

    }

}
