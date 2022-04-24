package Tests;
import Code.Triangulo;

public class TesteTriangulo {
	// A e B precisa ser maior que C
	// A, B e C precisam ser maiores que 0

	private String message1 = "O programa não conhece a condição de existência de um triângulo";
	private String message2 = "O programa não reconhece triângulos ";

	public void testaEscaleno() {
		Triangulo t;

		double a = 3, b = 4, c = 6 ;

		for(int i = 0; i < 100; i++) {
			t = new Triangulo (a, b, c);
			t.definirTriangulo();
			t.validarTriangulo();

			if (!t.type.equalsIgnoreCase("Escaleno")) {
				System.out.println( message2 + "escalenos");
				break;			
			}

			else if (!t.valid){
				System.out.println(message1);
			}
			a *= 2;
			b *= 2;
			c *= 2;
		}
	}

	public void testaEquilatero() {
		Triangulo t;
		double a = 1, b = 1, c = 1;

		for(int i = 0; i < 100; i++) {
			t = new Triangulo (a, b, c);
			t.definirTriangulo();
			t.validarTriangulo();

			if (!t.type.equalsIgnoreCase("Equilátero")) {
				System.out.println( message2 + "equiláteros");
				break;			
			}

			else if (!t.valid)
				System.out.println(message1);
		
			a *= 2;
			b *= 2;
			c *= 2;
		}
	}

	public void testaIsosceles() {
		Triangulo t;
		double a = 2, b = 2, c = 1;

		for(int i = 0; i < 100; i++) {
			t = new Triangulo (a, b, c);
			t.definirTriangulo();
			t.validarTriangulo();

			if (!t.type.equalsIgnoreCase("Isósceles")) {
				System.out.println( message2 + "isósceles");
				break;			
			}

			else if (!t.valid)
				System.out.println(message1);
			
			a *= 2;
			b *= 2;
			c *= 2;
		}
	}
}