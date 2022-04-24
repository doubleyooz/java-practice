import java.util.Scanner;
public class Quest5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char temp;
		String restart;
		
		for (int i = 0; i < 1;) {
			System.out.println("Digite o valor a ser sacado: ");
			int n1 = scanner.nextInt();
			int n2;
			if (n1 % 10 == 0) {
				if (n1 >= 50) {
					n2 = n1 / 50;
					if (n2 == 1)
						System.out.println(n2 + " nota de cinquenta");
					else
						System.out.println(n2 + " notas de cinquenta");
					n1 = n1 % 50;
				}
				
				if (n1 >= 10) {
					n2 = n1 / 10;
					if (n2 == 1)
						System.out.println(n2 + " nota de dez");
					else
						System.out.println(n2 + " notas de dez");
					n1 = n1 % 10;
				}
				
				if (n1 != 0)
					System.out.println("Error 101");
			}
			
			else 
				System.out.println("Impossível sacar esse valor!");
				
		
			temp = 'p';
			System.out.println("Continuar? s/n");
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
