package src.models;

public class Teacher extends TaxPayer {

    private double wage;

    private static double calcImposedCost(double wage) {
        final double minimunWage = 1000;
        if (wage <= minimunWage)
            return wage * 0.05;
        else if (wage <= minimunWage * 5) {
            return wage * 0.1;
        } else {
            return wage * 0.2;
        }
    }

    public Teacher(String name, boolean ownsHouse, boolean ownsCar, double wage) {
        super(name, ownsHouse, ownsCar, calcImposedCost(wage));
        this.wage = wage;

    }

    @Override
    public double calculateTaxes(double tax, double discount){
        double result = tax - discount * 0.5;
        return result > 0 ? result : 0;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return this.wage;
    }

}
