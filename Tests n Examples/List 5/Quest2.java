import java.util.Scanner;
public class Quest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n1 = scanner.nextInt();
		if (n1 % 2 == 0)
			System.out.println("É múltiplo de 2!!");
		if (n1 % 3 == 0)
			System.out.println("É múltiplo de 3!!");
		else
			System.out.println("Não é múltiplo de 2 nem de 3.");
	
	}
}
