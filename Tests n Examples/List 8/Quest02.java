import java.util.Scanner;

public class Quest02 {

	public static void main (String[]args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to this stupid question!!");
		int v1[] = new int [5];
		int soma = 0, menor = 0, maior = 0;
		
		for (int i = 0; i < v1.length; i++) {
			boolean fail;
			
			do {
				fail = true;
				if (i == 0)
					System.out.println("Digite um número inteiro:");
				else
					System.out.println("Digite outro número inteiro:");
				String str = scan.nextLine();
				
				try {
					v1[i] = Integer.parseInt(str);
				}
				catch (NumberFormatException e) {
					System.out.println("Valor inválido!!");
					fail = false;
				}
			}while(!fail);
			if (i == 0) {
				menor = v1[i];
				maior = v1[i];
			}
			else if (menor > v1[i])
				menor = v1[i];
			else if (maior < v1[i])
				maior = v1[i];
			
			
		}
		
		System.out.printf("O maior valor é %d\n", maior);
		System.out.printf("O menor valor é %d\n", menor);
		
	}

}
