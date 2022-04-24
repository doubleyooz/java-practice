import java.util.Scanner;
public class Quest05 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int r = 0;
		int n1;
		System.out.println("Digite um número: ");
		
		for (int i = 0;  i < 30; i++) {
			n1 = scanner.nextInt();
			r += n1;
			if (i != 29)
			System.out.println("Digite outro número: ");
		}
		System.out.printf("A soma é %d\n", r);
			
	}

}
