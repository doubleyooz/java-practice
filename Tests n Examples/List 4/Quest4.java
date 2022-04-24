//Quest4.java exibe o sucessor e o antecessor do número que o usuário digitar na tela
import java.util.Scanner;

public class Quest4 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
		//Entrada
		System.out.println("Digite um número: ");
		int num = scanner.nextInt();
		
	
		//Processamento
		int suc = num + 1;
		int ant = num - 1;
		//Saída
		System.out.printf("O sucessor dele é: %d \nO antecessor dele é: %d", suc, ant  );
		
		
		// TODO Auto-generated method stub

	}

}