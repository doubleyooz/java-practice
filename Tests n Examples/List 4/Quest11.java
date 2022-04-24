//Quest11.java exibe a raiz quadrada do número que o usuário digitar na tela
import java.util.Scanner;

public class Quest11 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
						
		//Entrada
		System.out.println("Digite um número: ");
		double n1 = scanner.nextDouble();
		
		//Processamento
		double r1 = Math.sqrt(n1);
		
		//Saída
		System.out.printf("A raiz quadrada dele é: %.2f", r1 );
		
		
		// TODO Auto-generated method stub

	}

}