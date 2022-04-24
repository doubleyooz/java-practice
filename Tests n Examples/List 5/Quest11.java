import java.util.Scanner;
import java.util.Random;
public class Quest11 {
	public static void main (String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner (System.in);
		System.out.println("Bem vindo ao IMCnator 3.0!!!");
		int i = 0;
		String restart = ""; 
		char temp;
		while (i == 0) {
			double maldade = random.nextInt(100);
			System.out.println("Digite seu peso em Kg: ");
			double n1 = scanner.nextDouble();
			System.out.println("Digite sua altura em m: ");
			double n2 = scanner.nextDouble();
			
			double imc = n1 / Math.pow(n2, 2);
			
			System.out.println("Seu IMC é de: " + imc);
			
			if (imc < 20) {// Tabela
				System.out.println("Você está abaixo do peso!!" );
				if (maldade > 90)
					System.out.println("Está na hora de parar com o xvideos e começar a malhar >:(");
			}	
			else if (imc >= 20 && imc < 25) {
				System.out.println("Você está no seu peso ideal!!");
				if (maldade > 90)
					System.out.println("Você pode até está fitness, mas todos sabemos que sua barriga é quebrada.");
			}	
			else if (imc >= 25 && imc < 30) {
				System.out.println("Você está acima do peso!!");
				if (maldade > 90)
					System.out.println("Tenha vergonha seu gordo vagabundo!! Vai trabalhar!");
			}	
			else if (imc >= 30 && imc < 35) {
				System.out.println("Você está obeso!!");
				if (maldade > 90)
					System.out.println("Ser uma bola também é está em forma...");
			}	
			else if  (imc >= 35) {
				System.out.println("Você está em obesidade mórbica !!");
				if (maldade > 90)
					System.out.println("Não prestamos assistência técnica para baleias, consultar manual.");
		}	
			

			temp = 'p';
			System.out.println("\nAnalisar um novo IMC? s/n");
			restart = scanner.nextLine();
			
			
			while (temp != 's') {
				restart = scanner.nextLine();
				temp = restart.charAt(0);
				
				if (temp == 'n') {
					System.out.println("Fim de Programa.");
					i = i + 2;
					break;
				}
				
				else if (temp != 's')
					System.out.println("Digite uma opção válida!!");
			}	
				
			
			
		}
		
	}
}
