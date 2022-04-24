//Quest15.java exibe o resultado do salário com o aumento proposto
//que o usuário digitar na tela
import java.util.Scanner;

public class Quest15 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
						
		//Entrada
		System.out.println("Digite o valor do salário: ");
	    double n1 = scanner.nextDouble();
		
		System.out.println("Digite o valor do aumento proposto em %: ");
	    double n2 = scanner.nextDouble();
		
		//Processamento
		
	    double r1 = n1 + n1*(n2/100);
		//Saída
	    
	   
	    	System.out.printf("O novo salário é : R$ %.2f", r1);
	    
	    
	  		// TODO Auto-generated method stub
	}
}
