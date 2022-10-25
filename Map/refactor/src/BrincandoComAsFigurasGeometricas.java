
public class BrincandoComAsFigurasGeometricas {

	public static void main(String[] args) {

		FigurasGeometricas fig = new FigurasGeometricas(10, 5, 7, 25);

		int[] inputs = { fig.R, fig.C, -2, 0 };

		double per = -1;
		for (int i = 0; i < inputs.length; i++) {
			per = fig.printPerimeter(inputs[i]);
			if (per < 0) {
				System.out.println("ERROR.");
			}

		}

		fig.printArea(0);
		fig.printArea(-1);
		fig.printArea(2);
		fig.printArea(1);
		fig.printArea(-2);

		System.out.println(fig.figureToString(-1));
		System.out.println(fig.figureToString(1));
		System.out.println(fig.figureToString(0));
		System.out.println(fig.figureToString(4));
		System.out.println(fig.figureToString(2));

	}

}
