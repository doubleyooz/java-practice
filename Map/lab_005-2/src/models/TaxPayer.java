package src.models;
import java.util.UUID;

public class TaxPayer {
    private String name;
    private double imposedCost; //gross value
    private UUID securityNumber;
    private boolean ownsHouse, ownsCar;

    public TaxPayer(String name, boolean ownsHouse, boolean ownsCar, double imposedCost){
        this.name = name;
        securityNumber = UUID.randomUUID();
        this.ownsCar = ownsCar;
        this.ownsHouse = ownsHouse;
        this.imposedCost = imposedCost;
    }

    public double calculateTaxes(double tax, double discount){
        double result = tax - discount;
        return result > 0 ? result : 0;
    }

    public double imposeEvenMoreCost(int value){
        double moreCost = 0;
        if(ownsCar)
            moreCost += (value/2) + (double)(Math.random() * ((1000 - value/2) + 1));
        if(ownsHouse)
            moreCost += (value*2) + (double)(Math.random() * ((10000 - value*2) + 1));
        return moreCost;
    }

    public String getSecurityNumber(){
        return securityNumber.toString();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public double getImposedCost(){
        return this.imposedCost;
    }

    public boolean getOwnsHouse(){
        return this.ownsHouse;
    }

    public boolean getOwnsCar(){
        return this.ownsCar;
    }

    public void switchOwnsHouse(){
        this.ownsHouse = !this.ownsHouse;
    }

    public void switchOwnsCar(){
        this.ownsCar = !this.ownsCar;
    }
    
}