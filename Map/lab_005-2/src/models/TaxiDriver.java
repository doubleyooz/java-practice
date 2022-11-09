package src.models;

import src.interfaces.RoadWorker;

public class TaxiDriver extends TaxPayer implements RoadWorker{

    private int passengers;
    private double kilometers;

    public TaxiDriver(String name, boolean ownsHouse, boolean ownsCar, int passengers) {
        super(name, ownsHouse, ownsCar, 0.5);
        this.passengers = passengers;
        this.kilometers = this.calculateKilometers(passengers);

    }


    public void setPassengers(int passengers){
        this.kilometers = this.calculateKilometers(passengers);
        this.passengers = passengers;
    }

    public double getKilometers() {
        return this.kilometers;
    }

    public int getPassengers() {
        return this.passengers;
    }
    
    
}
