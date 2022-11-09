package src.interfaces;

import java.util.ArrayList;

import src.middlewares.DoctorMiddleware;
import src.models.TaxPayer;

public interface TaxPayerRepository {

    default TaxPayer findOne(String id, ArrayList<TaxPayer> taxPayers) {
        if (!new DoctorMiddleware().validFindOne(id))
            return null;

        for (int i = 0; i < taxPayers.size(); i++) {
            if (taxPayers.get(i).getSecurityNumber().equals(id)) {
                return taxPayers.get(i);
            }
        }

        return null;

    }

    default boolean delete(String id, ArrayList<TaxPayer> taxPayers) {
        if (new DoctorMiddleware().validFindOne(id))
            return false;
        for (int i = 0; i < taxPayers.size(); i++) {
            if (taxPayers.get(i).getSecurityNumber().equals(id)) {

                taxPayers.remove(taxPayers.get(i));
                return true;
            }
        }

        return false;

    }
}
