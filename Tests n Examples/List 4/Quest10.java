//Quest10.java exibe o cubo do número que o usuário digitar na tela
import java.util.Scanner;

public class Quest10 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
						
		//Entrada
		System.out.println("Digite um número: ");
		double n1 = scanner.nextDouble();
		
		//Processamento
		double r1 = Math.pow(n1, 3);
		
		//Saída
		System.out.printf("O cubo dele é: %.2f", r1 );
		
		
		// TODO Auto-generated method stub

	}

}