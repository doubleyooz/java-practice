package figures;

public class Rectangle implements Figure {

    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.width = width;
        this.height = height;

    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return height * 2 + width * 2;
    }

    @Override
    public void printArea() {
        System.out.printf("Area of Rectangle: %.2f\n", this.getArea());

    }

    @Override
    public void printPerimeter() {
        System.out.printf("Perimeter of Rectangle: %.2f\n", this.getPerimeter());

    }

    @Override
    public String toString() {
        return "The created rectangle has a width of: " +
                this.width + "\n" + "and a height of: " + this.height;

    }

}