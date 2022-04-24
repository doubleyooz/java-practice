import java.util.Scanner;
import java.io.IOException;

public class Quest15 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = "";
		String str2 = "";
		double n1 = 1, n2 = 1, r;
		while ( !(n1 == 0 && n2 == 0)) {

            System.out.println("Tecle [ENTER] para continuar: ");
        	String enter = "nada";
        	boolean reset = false;
        	
			while (!enter.equals("")) {
				
				enter = scanner.nextLine();//vai ler o que o usuário digitar
				//O loop só é quebrado se o usuário entrar com \n
				if (enter.equals(""))
					break;
			}	
				System.out.println("Digite um número: ");
				str1 = scanner.nextLine();
			
		
			try {	
			
				str1 = str1.replace(",", ".");
				n1 = Double.parseDouble(str1);
			
			}
			catch (NumberFormatException e) {
				System.out.println("Formato inválido!!");
				reset = true;
				
			
			}
			if (!reset) {
		
		
				System.out.println("Digite outro número: ");
				str2 = scanner.nextLine(); //podia ser str1
			
				try {	
			
					str2 = str2.replace(",", ".");
					n2 = Double.parseDouble(str2);
					
				}
				catch (NumberFormatException e) {
					System.out.println("Formato inválido!!");;
					reset = true;
				}
			}	
		
			if (!reset) {
				if (!(n1 == 0 && n2 == 0)) {
					r = n1 * n2;
					System.out.println("O produto é: " + r);
					System.out.println("\n");
				}
				else 
					System.out.println("Fim de Programa.");
			}	
		}
	}

}