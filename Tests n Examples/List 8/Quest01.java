import java.util.Scanner;

public class Quest01 {

	public static void main (String[]args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to this stupid question!!");
		int v1[] = new int [5];
		int soma = 0;
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
			
			soma += v1[i];
		}
		
		System.out.printf("A soma dos valores é %d", soma);
		
	}

}
