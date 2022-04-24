import java.util.Scanner;
public class Quest03 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("O erro do Lula foi amar demais?");
		String n1 = scanner.nextLine(); //não serve para nada
		double l = 0;
		for (int i = 50;  i <= 100; i++) {
			l = Math.sqrt(i);
			System.out.printf("%.2f\n", l);
		
		}
			
	}

}
