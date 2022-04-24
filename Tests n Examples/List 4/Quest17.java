//Quest17.java exibe o resultado do salário com o aumento proposto
//que o usuário digitar na tela
import java.util.Scanner;

public class Quest17 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
						
		//Entrada
		System.out.println("Digite uma data no formato dd/mm/aaaa:  ");
	    
		String data = scanner.next();
		String ano = data.substring(6);  //pega a posicao do ultimo caractere da string, nesse caso a posicao seria 2
		String mes = data.substring(4, 5);
		String dia = data.substring(1, 2);
       
		System.out.printf(" %s, %s, %s", dia, mes, ano);
	
	}

}