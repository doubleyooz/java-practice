package src.interfaces;

public interface RoadWorker {
    default double calculateKilometers(double value) {
        return (value / 2) + (double)(Math.random() * ((1000 - value) + 1));
    }
}
