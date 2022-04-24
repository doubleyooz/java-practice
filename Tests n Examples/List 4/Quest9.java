//Quest9.java exibe a média de três números que o usuário digitar na tela
import java.util.Scanner;

public class Quest9 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
						
		//Entrada
		System.out.println("Digite um número: ");
		double n1 = scanner.nextDouble();
		
		System.out.println("Digite outro número: ");
		double n2 = scanner.nextDouble();
		
		System.out.println("Digite mais um número");
		double n3 = scanner.nextDouble();
	
		//Processamento
		double r1 = (n1+n2+n3)/3;
		
		//Saída
		System.out.printf("A média aritmética deles é: %.2f", r1 );
		
		
		// TODO Auto-generated method stub

	}

}