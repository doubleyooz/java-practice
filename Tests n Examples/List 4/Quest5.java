//Quest5.java exibe a soma de dois números que o usuário digitar na tela
import java.util.Scanner;

public class Quest5 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
						
		//Entrada
		System.out.println("Digite um número: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Digite outro número: ");
		int n2 = scanner.nextInt();
		
	
		//Processamento
		double r1 = n1 + n2;
		
		//Saída
		System.out.printf("O resultado é: %.2f", r1 );
		
		
		// TODO Auto-generated method stub

	}

}