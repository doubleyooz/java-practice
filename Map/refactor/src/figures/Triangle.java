package figures;

public class Triangle implements Figure {

   private final double height, width;

   public Triangle(double height, double width) {
      this.height = height;
      this.width = width;
   }

   @Override
   public double getHeight() {
      return height;
   }

   @Override
   public double getWidth() {
      return width;
   }


   @Override
   public void printArea() {
       System.out.printf("Area of Triangle: %.2f\n", this.getArea());
       
   }

   @Override
   public void printPerimeter() {
       System.out.printf("Perimeter of Triangle: %.2f\n", this.getPerimeter());
       
   }


   @Override
   public double getArea() {
      return width * height / 2;
   }

   @Override
   public double getPerimeter() {
      return width + (Math.pow(width/2, 2) + Math.pow(height, 2));
   }

   @Override
   public String toString() {
       return "The created triangle has a width of: " +
               this.width + "\n" + "and a height of: " + this.height;

   }

}