import java.util.Scanner;
public class Quest10 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Bem vindo ao ComparadordeTrêsInteirosnator 2.0!!!");
		int i = 0;
		String restart = ""; 
		char temp;
		while (i == 0) {
			System.out.println("Digite um inteiro: ");
			int n1 = scanner.nextInt();
			System.out.println("Digite um segundo inteiro: ");
			int n2 = scanner.nextInt();
			System.out.println("Digite mais um inteiro: ");
			int n3 = scanner.nextInt();
			
			System.out.println("Na ordem descrescente:");
			
			if ((n1 > n2 && n1 > n3) || (n1 == n2 && n1 > n3))// Maior número
				System.out.print(" " + n1);
			else if ((n2 > n1 && n2 > n3) || (n2 > n1 && n2 == n3))
				System.out.print(" " + n2);
			else if ((n3 > n2 && n3 > n1) || (n3 > n2 && n3 == n1))
				System.out.print(" " + n3);
						
			if ((n1 > n2 && n1 < n3) || (n1 > n3 && n1 < n2) )// número do meio
				System.out.print(" " + n1);
			else if ((n2 > n1 && n2 < n3) || (n2 > n3 && n2 < n1))
				System.out.print(" " + n2);
			else if ((n3 > n2 && n3 < n1) || (n3 > n1 && n3 < n2))
				System.out.print(" " + n3);
			
			if ((n1 < n2 && n1 < n3) || (n1 == n2 && n1 < n3))// Menor número
				System.out.print(" " + n1);
			else if ((n2 < n1 && n2 < n3) || (n2 < n1 && n2 == n3))
				System.out.print(" " + n2);
			else if ((n3 < n2 && n3 < n1) || (n3 < n2 && n3 == n1))
				System.out.print(" " + n3);
					
			else 
				System.out.println("Todos são iguais");

			temp = 'p';
			System.out.println("\nContinuar? s/n");
			restart = scanner.nextLine();
			
			while (temp != 's') {
				restart = scanner.nextLine();
				temp = restart.charAt(0);
				
				if (temp == 'n') {
					System.out.println("Fim de Programa.");
					i = i + 2;
					break;
				}
				
				else if (temp != 's')
					System.out.println("Digite uma opção válida!!");
			}	
				
			
			
		}
		
	}
}
