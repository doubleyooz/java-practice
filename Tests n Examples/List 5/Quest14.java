import java.util.Scanner;
public class Quest14 {

public static boolean valida(String k) {
		
		boolean numero = k.matches("[0-9]+");//Se a condição acima for verdade nesta String retorna true
		
		return numero;
}
			
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma data (dd/mm/aaaa): "); // Pede dados ao usuário		
		
		String restart = ""; //faz parte do loop
		
		// LOOP
		int i = 0;
		while (i == 0) {
			char temp = 'd'; //faz parte do loop
			
			String data = scanner.nextLine();  
			
			if (data.equals("bissexto")) {
				System.out.println("Esse programa não trabalha com validação de anos bissextos.");
			}
			
			// validação do switch
			
			int valid = 0; //inteiro de validação
			int barra = 0;
			char c1;
			
			for (int j = 0; j < data.length() - 1; j++) { //verifica o formato da data
				c1 = data.charAt(j);
				if (c1 == '/')
					barra = barra + 1;
			}
			
			if (barra != 2 ) //validando o valid
				valid = valid + 1;
			
			else if (barra == 2) {
				String [] parts2 = data.split("/"); //separa a string recebida em partes			
							
				if (!valida(parts2[0])||!valida(parts2[1])||!valida(parts2[2]))
					valid = valid +1;
			}
			
						
			// início do switch
			switch (valid) {
				case 0:
					
					String [] parts = data.split("/"); //separa a string recebida em partes
					int dia = Integer.valueOf(parts[0]);
					int mes = Integer.valueOf(parts[1]);
					int ano = Integer.valueOf(parts[2]);
					
					
					//validação dos inteiros da data
					boolean dd = false;   
					boolean mm = false;
					boolean aaaa = false;
						
					//boolean bissexto = false; 
					
					//if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) 
						//bissexto = true;
				
					if (dia > 31 || dia < 1)
						dd = true;
					else if (mes > 12 || mes < 1 || (dia == 31 && mes % 2 == 0 && mes < 8) 
							||(dia == 31 && mes % 2 == 1 && mes >= 8)||((dia >= 29 && mes == 2) 
							&&  !(dia == 29 && mes == 2))) //&& bissexto == true
						mm = true;
					else if (ano < 0)
						aaaa = true;
					
					
					// Saída
					if (dd == true || mm == true || aaaa == true)
						System.out.println("Digite uma data válida!!");
					else {
						System.out.println("A data digitada é válida." );
						System.out.println("Deseja continuar(s/n)? ");
						
						while (temp != 's') {  //O loop só é quebrado se o usuário entrar com 's'ou 'n'
							restart = scanner.nextLine();
							if (restart.length() < 2)
								if (restart.equalsIgnoreCase(""))
									restart = "p";
								temp = restart.charAt(0);
							
							if (temp == 'n') {
								System.out.println("Fim de Programa.");
								i = i + 1; //encerra o programa
								break;
							}	
							else if (temp != 's') {
								System.out.println("Opção inválida!!");
							}
							
						}
						if (temp != 'n')
							System.out.println("Digite uma data (dd/mm/aaaa): "); // Pede dados ao usuário
					}
					
					break;
				default : //qualquer formato inválido vai parar aqui
					System.out.println("Digite a data em formato válido!!");
				
			}
			
			
		}
		
		
		
	}
}
