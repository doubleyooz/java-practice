import java.util.Scanner;

public class Quest04 {
	
	public static boolean ePrimo(int n) {
		
		boolean primo = true;
		for (int i = 2; i < n; i++) {
					
			if (n % i == 0 && n != 2) {
				primo = false;
				break;
			}	
		}
		return primo;
	}
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Quanto custa a sua felicidade?"); //reflexão do dia
		String inutil = scanner.nextLine();
		
		//define o tamanho do vetor
		int vetor[] = new int [100];
		
		
		//atribui valor ao vetor		
		int count = 0;
		for (int i = 2;  count < 100; i++) {
		
			if (ePrimo(i)) {
				vetor[count] += i;
				count++;//Não consegui exibir o vetor dentro desse for
			}
		}
		//exibe cada espaço do vetor
		
		for(int cont = 0; cont < vetor.length; cont++) 
            System.out.println(vetor[cont]); //termina no 541
		
         		
		
	}
}



