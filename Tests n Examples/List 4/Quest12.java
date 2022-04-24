//Quest12.java Converte um medida em metros para centímetros que o usuário digitar na tela
import java.util.Scanner;

public class Quest12 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
						
		//Entrada
		System.out.println("Bem vindo ao conversor de medidas Converter3000!!! \nConverta metros em centimetros\n"
				+ "Digite um medida em metros: ");
		double n1 = scanner.nextDouble();
		
		//Processamento
		double r1 = n1 * 100;
		
		//Saída
		System.out.printf("Corresponde a %.0f cm", r1 );
		
		
		// TODO Auto-generated method stub

	}

}