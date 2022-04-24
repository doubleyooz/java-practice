import java.util.Scanner;
public class Quest1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n1 = scanner.nextInt();
		if (n1 % 5 == 0)
			System.out.println("É múltiplo de 5!!");
		else
			System.out.println("Não é múltiplo de 5!!");
	
	}
}
