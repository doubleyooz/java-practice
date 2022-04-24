import java.util.Scanner;
public class Quest8 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Bem vindo ao ComparadordeTrêsInteirosnator 2.0!!!");
		System.out.println("Digite um inteiro: ");
		int n1 = scanner.nextInt();
		System.out.println("Digite um segundo inteiro: ");
		int n2 = scanner.nextInt();
		System.out.println("Digite mais um inteiro: ");
		int n3 = scanner.nextInt();
		
		if (n1 < n2 && n1 < n3)
			System.out.println("O menor é: " + n1);
		else if (n2 < n1 && n2 < n3)
			System.out.println("O menor é: " + n2);
		else if (n3 < n2 && n3 < n1)
			System.out.println("O menor é: " + n3);
		else
			System.out.println("Todos são iguais.");
		
	}
}