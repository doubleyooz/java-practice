import java.util.Scanner;

public class Quest04 {
	//Cria um painel quadrado de lampadas que
	//acendem com e apagam com certas regras
	static Quadrado q1;
	static boolean end = false, nextBreak = false;
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bem-vindo ao LâmpadasInúteis 2.0!!!");
	
		while (!end) {
			q1.menu.menuA();
			boolean loop = true;
			
			while(loop) {
				q1.menu.choiceA();
				loop = false;
				if(nextBreak)
					break;
				System.out.println("Deseja voltar ao menu principal? s/n");
				
				String str = scan.nextLine();
				
				while (!str.equalsIgnoreCase("s")) {
					
					if (str.equalsIgnoreCase("n")) {
						System.out.println("Fim de Programa");
						end = true;
						break;
					}
					else if (!str.equalsIgnoreCase("s")) {
						System.out.println("Digite uma opção válida!!");
						str = scan.nextLine();
					}
				}
			}
			
		}
		
		
		
		
		
		
	}

}
