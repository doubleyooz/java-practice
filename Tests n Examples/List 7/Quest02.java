import java.util.Scanner;
public class Quest02 {
	
	public static int result(int vetor[]) {
		int soma = 0;
		 for(int i = 0; i < vetor.length; i++){
             soma = soma +  vetor[i]; // soma a variavel soma com cada valor dos indices do vetor. 
      }
		 return soma;
	}
	
	public static boolean loop(String restart) { // menu sim ou não
		Scanner scanner = new Scanner (System.in);
		char temp = 'd';
		boolean end = false;
		
		while (temp != 's') {  //O loop só é quebrado se o usuário entrar com 's'ou 'n'
			
			if (restart.length() < 2 ||restart.equalsIgnoreCase(""))
				restart = "p";
			temp = restart.charAt(0);
				
			if (temp == 'n') {
				System.out.println("Fim de Programa.");
				end = true; //encerra o programa
				break;
			}	
			else if (temp != 's') {
				System.out.println("Opção inválida!!");
				restart = scanner.nextLine();
			}
				
		}
		return end;
	}
	public static void main(String [] args) {
		
		System.out.println("Seja bem vindo ao Quest02nator!!");
		int loop = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (loop == 0) { //loop
			boolean normal = true;
			String strli = "", strls = "";
			int li = 0, ls = 0, reset = 0;
			System.out.println("Digite o limite inferior: ");
			strli = scanner.nextLine();
			
			//validação do limite inferior
			try {	
				
				li = Integer.parseInt(strli);
				
							
			}
			catch (NumberFormatException e) {
				normal = false;
			}
			
			if (li < 0 || !normal) {
				System.out.println("Erro 101.");
				System.out.println("Os dados informados são inválidos para esse tipo de processamento!");
				System.out.println("Deseja continuar(s/n)? ");
				int v = 0;
				String restart = scanner.nextLine();
				while (v == 0) {
					
					if (loop(restart)) {
						v ++;
						loop ++;
					}
					
					else 
						v++;
					reset = 1;	
				}
				normal = false; // caso caia aqui por li < 0
			}
			
			if (normal) { //Só continua se li for válido
				System.out.println("Digite o limite superior: ");
				strls = scanner.nextLine();
				
			
				//validação do limite inferior
				try {	
					
					ls = Integer.parseInt(strls);
					
								
				}
				catch (NumberFormatException e) {
					normal = false;
				}
				
				
				if (ls < li || !normal) {
					System.out.println("Erro 102.");
					System.out.println("Os dados informados são inválidos para esse tipo de processamento!");
					System.out.println("Deseja continuar(s/n)? ");
					int v = 0;
					String restart = scanner.nextLine();
					while (v == 0) { //Só é executado uma vez
						
						if (loop(restart)) {
							v ++;
							loop ++;
						}
						
						else 
							v++;
						reset = 1;	
					}
					normal = false; // caso caia aqui por li < 0
				}
			}	
			
			
			
			switch (reset) {
			case 0 :
				
				//Se tudo estiver normal o código prossegue 
				if (normal) {
					int quadr = 0;
					int vetor[] = new int [(ls - li) + 1];
					int count = 0;
					for (int i = li;  i <= ls; i++, count++) {
						quadr = i * i;
						if (count < ((ls - li) + 1))
							vetor[count] = quadr;
						
						if (i == li) 
							System.out.println("O quadrado de todos os números dentro do limite: ");	
						
						System.out.println(quadr);
					}
					System.out.println("A soma é: " + result(vetor));
				}
				
				System.out.println("Deseja continuar(s/n)? ");
				int v = 0;
				String restart = scanner.nextLine();
				while (v == 0) { //Só é executado uma vez
					
					if (loop(restart)) {
						v ++;
						loop ++;
					}
					
					else 
						v++;
				}
				break;
			
			default: //reset != 0 vai para aqui, poderia colocar as boas vindas aqui
				break;
			}
				
					
		}
		
	}

}
