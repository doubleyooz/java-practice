package src.utils;

import java.util.UUID;

public class Constraints {
    public static boolean isValidName(String name) {
        int length = name.length();
        return length > 0 && length < 50;
    }

    public static boolean isValidPatients(int patients) {
        return patients >= 0;
    }

    public static boolean isValidPassengers(int patients) {
        return patients >= 0;
    }

    public static boolean isValidImposedCost(double imposedCost) {
        return imposedCost > 0;
    }

    public static boolean isValidWage(double wage) {
        return wage > 0 && wage < 500000;
    }

    public static boolean isValidSecurityNumber(String securityNumber){
        return UUID.fromString(securityNumber).toString().equals(securityNumber);
    }
}
