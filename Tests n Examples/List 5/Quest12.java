import java.util.Scanner;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Quest12 {
	
		
	public static boolean valida(String k) {
		
		boolean numero = k.matches("[0-9]+");//Se conter apenas números na String retorna true
		int pos = k.indexOf("-");//Se "-" é o primeiro caractere retorna 0
		if (!numero && pos == 0)
			numero = true;
		return numero;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo ao  EquaçãodeSegundoGraunator (ax²+bx+c)!! "); // Boas-Vindas
		String restart;
				
		// LOOP
		int i = 0;
		while (i == 0) {
			
			boolean nextBreak = false; // serve para encerrar o programa
			boolean outMenu = false; // sai de menu de escolha
			
			int a = 0;
			int b = 0;
			int c = 0;
			
			
			System.out.println("Entre com o valor de a:");
			String n1 = scanner.nextLine();
			
			//Validação de a;
			if (!valida(n1)) { //a = 0 encerra;
				
				System.out.println(n1 + " É um valor inválido!!");
				System.out.println("Deseja tentar novamente(s/n)? ");
				restart = scanner.nextLine();
				
				char temp = 'd'; //faz parte do loop				
				while (temp != 's') {
				
				 //O loop só é quebrado se o usuário entrar com 's'ou 'n'
					if (restart.length() < 2 && !restart.equals("")) {
						temp = restart.charAt(0);
					
						if (temp == 'n') {
							System.out.println("Fim de Programa.");
							i++;
							nextBreak = true;
							break;
						//encerra o programa
						}	
					}
					if (temp != 's') {
							System.out.println("Opção inválida!!");
							restart = scanner.nextLine();
						}
					
					else if (temp == 's') {
						outMenu = true;
					}
									
				}
							
			}	
			
			else {
				a = Integer.parseInt(n1);
				if (a == 0) {
					outMenu = true;
					System.out.println(a + "não é um valor válido para a!");
					System.out.println("Tente Novamente!");
				}
			}
				
			if (nextBreak)
				break;
			if (!outMenu) {
			
			//Validação de b;						
			System.out.println("Entre com o valor de b:");
			String n2 = scanner.nextLine();
					
			if (!valida(n2)) { 
				System.out.println(n2 + " É um valor inválido!!");
				System.out.println("Deseja tentar novamente(s/n)? ");
				restart = scanner.nextLine();
				
				char temp = 'd'; //faz parte do loop				
				while (temp != 's') {
				
				 //O loop só é quebrado se o usuário entrar com 's'ou 'n'
					if (restart.length() < 2 && !restart.equals("")) {
						temp = restart.charAt(0);
					
						if (temp == 'n') {
							System.out.println("Fim de Programa.");
							i++;
							nextBreak = true;
							break;
						//encerra o programa
						}	
					}
					if (temp != 's') {
							System.out.println("Opção inválida!!");
							restart = scanner.nextLine();
						}
					
					else if (temp == 's') {
						outMenu = true;
					}
									
				}			
			}	
					
			else 
				b = Integer.parseInt(n2);
				
			if (nextBreak)
				break;
			if (!outMenu) { //Reinicia o loop
			
			//Validação de c;	
			System.out.println("Entre com o valor de c:");
			String n3 = scanner.nextLine();
					
			if (!valida(n3)) { 
				System.out.println(n3 + " É um valor inválido!!");
				System.out.println("Deseja tentar novamente(s/n)? ");
				restart = scanner.nextLine();
				
				char temp = 'd'; //faz parte do loop				
				while (temp != 's') {
				
				 //O loop só é quebrado se o usuário entrar com 's'ou 'n'
					if (restart.length() < 2 && !restart.equals("")) {
						temp = restart.charAt(0);
					
						if (temp == 'n') {
							System.out.println("Fim de Programa.");
							i++;
							nextBreak = true;
							break;
						//encerra o programa
						}	
					}
					if (temp != 's') {
							System.out.println("Opção inválida!!");
							restart = scanner.nextLine();
						}
					
					else if (temp == 's') {
						outMenu = true;
					}
									
				}			
			}	
						
			else 
				c = Integer.parseInt(n3);
			
			if (nextBreak)
				break;
			if (!outMenu) {// Reinicia o Loop
			
					
			
			// validação do switch
			
			double x, x2;
			double delta = Math.pow(b, 2) - 4 * a * c;		
			
			if (delta < 0) {
				System.out.println("A equação não possui raízes reais!!");
				break;
			}
			
			else if (delta == 0) {
				x = -b / (2 * a);
				System.out.println("A raiz real da equação é: " + x);
			}
			
			else if (delta > 0) {
				x = -b + Math.sqrt(delta) / (2 * a);
				x2 = -b - Math.sqrt(delta) / (2 * a);
				System.out.printf("As raízes reais da equação são: %.2f e %.2f", x, x2);
				
			}
			
			System.out.println("\nDeseja tentar novamente(s/n)? ");
			restart = scanner.nextLine();
			char temp = 'd'; //faz parte do loop				
			while (temp != 's') {
			
			 //O loop só é quebrado se o usuário entrar com 's'ou 'n'
				if (restart.length() < 2 && !restart.equals("")) {
					temp = restart.charAt(0);
				
					if (temp == 'n') {
						System.out.println("Fim de Programa.");
						i++;
						nextBreak = true;
						break;
					//encerra o programa
					}	
				}
				if (temp != 's') {
						System.out.println("Opção inválida!!");
						restart = scanner.nextLine();
					}
				
				else if (temp == 's') {
					outMenu = true;
				}
								
			}
			
		}
		
		}}}	//Fecha os três if outMenu	
		
	}
}
