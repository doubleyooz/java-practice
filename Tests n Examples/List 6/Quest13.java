import java.util.Scanner;
public class Quest13 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		System.out.println("Bem vindo ao ProtoCalculator versão 1.3!!!");
		while (i == 0) {
			
			System.out.println("Escolha a opção desejada: ");
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Sair");
			String str = scan.nextLine();
			int valid;
			double n1 = 0, n2 = 0, r;
			
			try {	
				
				valid = Integer.parseInt(str);
			
			}
			catch (NumberFormatException e) {
				valid = 9;
			}
			
			if (valid == 5) {
				System.out.println("Fim de Programa");
				break;
			}
			else if (valid > 0 && valid < 5) {
				System.out.println("Digite um número: ");
				n1 = scan.nextDouble();
				System.out.println("Digite outro número: ");
				n2 = scan.nextDouble();
			}
			
			switch (valid) {
				case 1:
					r = n1 + n2;
					System.out.println("A soma é: " + r);
					break;
					
				case 2:
					r = n1 - n2;
					System.out.println("O resto é: " + r);
					break;
					
				case 3:
					r = n1 * n2;
					System.out.println("O produto é: " + r);
					break;
					
				case 4:
					if (n2 != 0)
						r = n1 / n2;
					else {
						System.out.println("Impossível dividir por zero!!");
						break;
					}	
					System.out.println("O quociente é: " + r);
					break;
					
				default :
					System.out.println("Opção inválida!!");
					break;
			}
				String ignoreLastEnter = scan.nextLine();
			 System.out.println("Tecle [ENTER] para continuar: ");
	        	String enter = "nada";
	        		        	
				while (!enter.equals("")) {
					
					enter = scan.nextLine();//vai ler o que o usuário digitar
					//O loop só é quebrado se o usuário entrar com \n
					if (enter.equals(""))
						break;
				}	
		}
	
		
	}
}
