import java.util.Scanner;
public class Quest12 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quanto tempo de namoro é necessário antes de um casamento?");
		String inutil = scanner.nextLine();
		int limite = 0;
		int divisor;
		boolean ePrimo;
		for (int i = 2; limite < 100; i++) {
			divisor = 2;
			ePrimo = true;
			do {
				if (i % divisor == 0 && i != 2) {
					ePrimo = false;
					break;
				}
				else 
					divisor++;
			}while ( i > divisor );	
			
			
			if (ePrimo) {
				System.out.println(i);
				limite++;
			}
		}
		System.out.println("em anos.");
	}

}