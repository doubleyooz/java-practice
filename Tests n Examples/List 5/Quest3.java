import java.util.Scanner;
public class Quest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n1 = scanner.nextInt();
		if (n1 > 0)
			System.out.println("É positivo!!");
		else if (n1 < 0)
			System.out.println("É negativo!!");
		else
			System.out.println("É nulo!!");
	
	}
}
