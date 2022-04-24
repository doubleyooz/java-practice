import java.util.Scanner;
public class Quest16 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("O aborto é um direito?");
		String inutil = scanner.nextLine();
		int limite = 0;
		int divisor;
		boolean ePrimo;
		for (int i = 200; limite < 100 && i <= 300; i++) {
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
	}

}