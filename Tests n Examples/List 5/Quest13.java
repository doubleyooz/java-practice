import java.util.Scanner;

public class Quest13 {
	public static void main (String[] args) {
		int i = 0;
		Scanner scanner = new Scanner (System.in);
		int ano;
		while (i == 0) {
			char temp = 'd';
			String restart;
			System.out.println("Bem vindo ao BissextoAdivinhator 3000!!");
			System.out.println("Digite um ano: ");
			ano = scanner.nextInt();		
			if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) 
				System.out.println("É bissexto.");
			else
				System.out.println("Não é bissexto.");
			System.out.println("Deseja continuar(s/n)? ");
			restart = scanner.nextLine();// Vai receber o \n que sobra da linha de cima

			while (temp != 's') {
				restart = scanner.nextLine();//vai ler o que o usuário digitar
				//O loop só é quebrado se o usuário entrar com 's'ou 'n'
				if (restart.length() < 2 && !restart.equals("")) {
					temp = restart.charAt(0);
				
					if (temp == 'n') {
						System.out.println("Fim de Programa.");
						i++;
						break;
						//encerra o programa
					}	
				}
				if (temp != 's') {
					System.out.println("Opção inválida!!");
				
				}
				
													
				}
			}
	}
}
