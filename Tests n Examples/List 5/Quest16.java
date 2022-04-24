import java.util.Scanner;

public class Quest16 {
	public static boolean valida(String k) {
		
			boolean numero = k.matches("[0-9]+");//Se a condição acima for verdade nesta String retorna true
		
			return numero;
	}	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        String restart;
        boolean nextBreak = false;
        boolean ignoreRest = false;
        
        while (i == 0) {
        	   //Entrada
            
            System.out.println("Bem Vindo ao CalculaMedianator!!!!");
            
            
            System.out.println("Tecle [ENTER] para continuar: ");
        	String enter = scanner.nextLine();
        	
			while (!enter.equals("")) {
				enter = scanner.nextLine();//vai ler o que o usuário digitar
				//O loop só é quebrado se o usuário entrar com \n
				if (enter.equals(""))
					break;
			
			}
            System.out.println("Digite sua primeira média: ");
            String m1 = scanner.nextLine();
            
            System.out.println("Digite sua segunda média: ");
            String m2 = scanner.nextLine();
            
            System.out.println("Digite sua terceira média: ");
            String m3 = scanner.nextLine();
            if (!valida(m3) || !valida(m2) || !valida(m1)) {
            	System.out.println("O formato informado inválido!");
            	System.out.println("Deseja continuar? (s/n)");
              	char temp = 'd';
    			while (temp != 's') {
    				restart = scanner.nextLine();//vai ler o que o usuário digitar
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
    				if (temp != 's') 
    					System.out.println("Digite uma opção válida!!");
    						
    				if (temp == 's')
    					ignoreRest = true;
    			}
            }
            if (nextBreak)
            	break;
            if (!ignoreRest) {
            
            m1 = m1.replace(",", "."); //String para double
            n1 = Double.parseDouble(m1);
            m2 = m2.replace(",", ".");
            n2 = Double.parseDouble(m2);
            m3 = m3.replace(",", ".");
            n3 = Double.parseDouble(m3);
          
            if ((n1 > 10 || n2 > 10 || n3 > 10) || (n1 < 0 || n2 < 0 || n3 < 0)) {
            	System.out.println("Valores digitados são inválidos!!!");
            	System.out.println("Deseja continuar? (s/n)");
              	char temp = 'd';
    			while (temp != 's') {
    				restart = scanner.nextLine();//vai ler o que o usuário digitar
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
    				if (temp != 's') 
    					System.out.println("Digite uma opção válida!!");
    						
    				if (temp == 's')
    					ignoreRest = true;
    			}
            	
            }
            if (nextBreak)
            	break;
            
            if (!ignoreRest) {
            double media = (n1 + n2 + n3) / 3;
            
            
            
            if (media >= 7) {
            	System.out.println("O aluno está aprovado!!");
            }
            
            else if (media >= 4  && media < 7) {
            System.out.println("O aluno deverá passar pela prova final, podendo ou não ser aprovado.");
            }
            else if (media < 4)
            	System.out.println("O aluno será reprovado.");
            
            System.out.println("Deseja continuar? (s/n)");
          	char temp = 'd';
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
           
						
            }}//ignoreRest	
			
            
        }
    }
}
