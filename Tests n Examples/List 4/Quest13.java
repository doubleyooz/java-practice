//Quest13.java exibe a circunferência e área de um círculo que possui o raio que o usuário digitar na tela
import java.util.Scanner;

public class Quest13 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
						
		//Entrada
		System.out.println("Digite o raio de um círculo: ");
		double n1 = scanner.nextDouble();
		
		//Processamento
		double r1 = Math.PI * 2 * n1; // circunferência
		double r2 = Math.PI * n1 * n1; //área
		
		//Saída
		System.out.printf("A circunferência mede: %.2f \nA área mede:%.2f ", r1, r2 );
		
		
		// TODO Auto-generated method stub

	}

}