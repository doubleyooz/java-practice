// Quest1.java exibe um número que o usuário digitar na tela
import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
		//Entrada
		System.out.println("Digite um número: ");
		double num = scanner.nextDouble();
		double num1 = num/3;
		
		//Saída
		System.out.println("O número que você digitou foi: " + num);
		System.out.println(num1);
		
		
		// TODO Auto-generated method stub

	}

}
