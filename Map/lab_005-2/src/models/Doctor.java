package src.models;

public class Doctor extends TaxPayer {

    private int patients;

    public Doctor(String name, boolean ownsHouse, boolean ownsCar, int patients) {
        super(name, ownsHouse, ownsCar, 10 * patients);
        this.patients = patients;

    }

    public void setPatients(int patients) {
        this.patients = patients;
    }

    public int getPatients() {
        return this.patients;
    }

}
