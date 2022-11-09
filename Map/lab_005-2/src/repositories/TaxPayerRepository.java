package src.repositories;

import java.util.ArrayList;

import src.middlewares.DoctorMiddleware;
import src.models.TaxPayer;

public class TaxPayerRepository {

    protected static ArrayList<TaxPayer> taxPayers = new ArrayList<>();

    protected static TaxPayer findOne(String id) {
        if (!new DoctorMiddleware().validFindOne(id))
            return null;

        for (int i = 0; i < taxPayers.size(); i++) {
            if (taxPayers.get(i).getSecurityNumber().equals(id)) {
                return taxPayers.get(i);
            }
        }

        return null;

    }

    protected static ArrayList<TaxPayer> list() {
        return taxPayers;
    }

    protected static boolean delete(String id) {
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
