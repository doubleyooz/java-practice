package figures;

public class Circle {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return this.radius;
    }

   
    public double getArea() {
        return Math.PI * radius * radius;
    }

   
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

   
    public void printArea() {
        System.out.printf("Area of Circle: %.2f\n", this.getArea());

    }

    public void printPerimeter() {
        System.out.printf("Perimeter of Circle: %.2f\n", this.getPerimeter());

    }

    @Override
    public String toString() {
        return "The created circled has a radius of: " + radius + "\n";

    }

}