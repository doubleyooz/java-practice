//Quest14.java exibe a decomposição em centena/dezena/unidade do número que o usuário digitar na tela
import java.util.Scanner;

public class Quest14 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
						
		//Entrada
		System.out.println("Digite um número de três digitos: ");
		int n1 = scanner.nextInt();
		
		//Processamento
		int centena = n1 / 100;
		
		
		long pegarDezena = n1 / 10;
		String longDezena = String.valueOf(pegarDezena);
		int stringDezena = longDezena.length() -1;  //pega a posicao do ultimo caractere da string, nesse caso a posicao seria 2
		int tamanhoStringDezena = longDezena.length(); //pega o tamanho da string, nesse caso, seria 3
        String charDezena = longDezena.substring(stringDezena, tamanhoStringDezena);//extrai o ultimo caractere da string utilizando as variaveis acima


        long pegarUnidade = n1;
		String longUnidade = String.valueOf(pegarUnidade);
		int stringUnidade = longUnidade.length() -1;  //pega a posicao do ultimo caractere da string, nesse caso a posicao seria 3
		int tamanhoStringUnidade = longUnidade.length(); //pega o tamanho da string, nesse caso, seria 3
        String charUnidade = longUnidade.substring(stringUnidade, tamanhoStringUnidade);//extrai o ultimo caractere da string utilizando as variaveis acimaint unidade = n1 / 1;
		
		//Saída
	    if ( 99 < n1 || n1 > 1000)
	    	System.out.printf("\n%d, %s, %s", centena, charDezena, charUnidade);
	    else System.out.println("Digite apenas um número de três dígitos!!");
	    
	  		// TODO Auto-generated method stub

	}

}