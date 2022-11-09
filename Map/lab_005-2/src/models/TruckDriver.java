package src.models;

import src.interfaces.RoadWorker;

public class TruckDriver extends TaxPayer implements RoadWorker {

    private double kilometers, tons;

    private static double calcImposedCost(double tons){
        if (tons < 10)
            return 500;
        else {
            return 500 + 1.5 * (tons - 10);
        }
    }
   
    public TruckDriver(String name, boolean ownsHouse, boolean ownsCar, double tons) {
        super(name, ownsHouse, ownsCar, calcImposedCost(tons));
        this.tons = tons;
        this.kilometers = this.calculateKilometers(tons);

        // TODO Auto-generated constructor stub
    }

    public void setTons(int tons) {
        this.tons = this.calculateKilometers(tons);
        this.tons = tons;
    }

    public double getKilometers() {
        return this.kilometers;
    }

    public double getTons() {
        return this.tons;
    }

}
