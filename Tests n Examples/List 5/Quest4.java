import java.util.Scanner;
public class Quest4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n1 = scanner.nextInt();
		if (n1 % 2 == 0)
			System.out.println("É par!!");
		else
			System.out.println("É impar!!");
	
	}
}
