import java.util.Scanner;

public class Quest15 {
	public static boolean valida(String k) {
		
			boolean numero = k.matches("[0-9]+");//Se a condição acima for verdade nesta String retorna true
		
			return numero;
	}	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valida = 9;
        int i = 0;
        double n1 = 0;
        double n2 = 0;
        String restart;
        String preValida = "";
        
        while (i == 0) {
        	   //Entrada
            
            System.out.println("Seja Bem vindo ao Java Calculator!");
            
            
            System.out.println("Tecle [ENTER] para continuar: ");
        	String enter = scanner.nextLine();
        	
			while (!enter.equals("")) {
				enter = scanner.nextLine();//vai ler o que o usuário digitar
				//O loop só é quebrado se o usuário entrar com \n
				if (enter.equals(""))
					break;
			
			}
                        
            System.out.println("\n\nEscolha a opção desejada: ");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            preValida = scanner.nextLine();
            if (!valida(preValida)) {
            	System.out.print("Isso que você digitou -> ");
            	System.out.println(preValida + " <- não é um opção válida!!");
            }
            else
            valida = scanner.nextInt();
            
            if (valida == 5) {
            	System.out.println("Fim de programa");
            	break;
            }
            if (valida <= 5) {
            System.out.println("Digite o primeiro número: ");
            n1 = scanner.nextDouble();
            System.out.println("Digite o segundo número: ");
            n2 = scanner.nextDouble();
            }
            switch (valida) {
            	case 1 :
            		double r1 = n1 + n2;
            		System.out.println("O resultado é: " + r1);
            		break;
            	case 2 :
            		double r2 = n1 - n2;
          		  	System.out.println("O resultado é: " + r2);
          		  	break;
            	case 3 :
            		double r3 = n1 * n2;
            		System.out.println("O resultado é: " + r3);
            		break;
            	case 4 :
            		double r4 = n1 / n2;
            		System.out.println("O resultado é: " + r4);
          		  	break;
            	        		
          	default : 
          		System.out.println("Opção inválida!!");
          		break;
            }
        	System.out.println("Deseja continuar(s/n)? ");
        	char temp = 'd';
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
				if (temp != 's') 
					System.out.println("Digite uma opção válida!!");
						
				
			}
            
        }
    }
}
