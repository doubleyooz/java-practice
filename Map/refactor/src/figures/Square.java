package figures;

public class Square implements Figure {

    private final double side;

    public Square(double side) {
        this.side = side;

    }

    @Override
    public double getHeight() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }

    @Override
    public void printArea() {
        System.out.printf("Area of Square: %.2f\n", this.getArea());

    }

    @Override
    public void printPerimeter() {
        System.out.printf("Perimeter of Square: %.2f\n", this.getPerimeter());

    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "The created square has a side of: " + this.side + "\n";

    }

}