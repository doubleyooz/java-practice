import figures.Circle;
import figures.Rectangle;
import figures.Square;
import figures.Triangle;

public class FigurasGeometricas {

	public final int R = -1;
	public final int Q = 0;
	public final int C = 1;
	public final int T = 2;


	private final Triangle triangle;
	private final Square square;
	private final Rectangle rectangle;
	private final Circle circle;

	public FigurasGeometricas(int height, int width, int lado, int radius) {

		this.triangle = new Triangle(height, width);
		this.square = new Square(width);
		this.rectangle = new Rectangle(height, width);
		this.circle = new Circle(radius);

	}

	public void printArea(int figureId) {
		switch (figureId) {
			case R:
				rectangle.printArea();
				break;
			case Q:
				square.printArea();
				break;
			case C:
				circle.printArea();
				break;
			case T:
				triangle.printArea();
				break;
			default:
				System.out.println("Please pick a valid option!!");
				break;
		}
	}

	public double printPerimeter(int figureId) {

		switch (figureId) {
			case R:
				return rectangle.getPerimeter();

			case Q:
				return square.getPerimeter();

			case C:
				return circle.getPerimeter();

			case T:
				return triangle.getPerimeter();

			default:
				System.out.println("Please pick a valid option!!");
				return -1;

		}

	}

	public String figureToString(int figureId) {
		
		switch (figureId) {
			case R:
				return rectangle.toString();
				
			case Q:
				return square.toString();
				
			case C:
				return circle.toString();
				
			case T:
				return triangle.toString();
				

			default:
				return "invalid option";
				
		}
		
	}
}
