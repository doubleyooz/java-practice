import java.util.Scanner;
public class Quest03 {
	public static boolean ePar (int n) {
		boolean par = false;
		if (n % 2 == 0) {
			par = true;
		}
		return par;
	}
	
	public static int sum(int vetor[]) {
		int soma = 0;
		 for(int i = 0; i < vetor.length; i++){
             soma = soma +  vetor[i]; // soma a variavel soma com cada valor dos indices do vetor. 
      }
		 return soma;
	}
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Porque existem dias ruins?"); //reflexão do dia
		String inutil = scanner.nextLine();
		
		//define o tamanho do vetor
		int spc = 0;
		for (int i = 2; i <= 100; i++) {
			if (ePar(i))
				spc++;
		}
		
		int vetor[] = new int [spc];
		
		
		//atribui valor ao vetor		
		int count = 0;
		for (int i = 2;  i <= 2 * spc; i++) {
		
			if (ePar(i)) {
				vetor[count] += i;
				count++;//Não consegui exibir o vetor dentro desse for
			}
		}
		//exibe cada espaço do vetor
		
		for(int cont=0; cont<spc; cont++) 
            System.out.println(vetor[cont]);
		
		System.out.println("A soma é: " + sum(vetor));// = 2550
				
	}
}
