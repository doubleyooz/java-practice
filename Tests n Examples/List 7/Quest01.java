import java.util.Scanner;
public class Quest01 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int vetor[] = new int [30];
		int media, maior = 0, menor = 999999999, soma = 0;
	
		for ( int i = 0; i < 30; i++) {
			vetor[i] = scanner.nextInt();
			soma += vetor[i];
			
			if (maior < vetor[i])
				maior = vetor[i];
			
			else if (menor > vetor[i])
				menor = vetor[i];
			
			if (i != 29)
			System.out.println("Digite outro número: ");
		}
		media = soma / 30;
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);
		System.out.println("O maior número inserido foi: " + maior);
		System.out.println("O menor número inserido foi: " + menor);
	}
}
