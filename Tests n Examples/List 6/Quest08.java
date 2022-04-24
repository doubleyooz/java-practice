import java.util.Scanner;
public class Quest08 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = 41, n2 = 42 , n3 = 43;
		int t = 0;
		System.out.println("A escola pode substituir a educação familiar?");
		String inutil = scanner.nextLine();
		
		for (int i = 0; i < 10; i++) {
			t = n1 * n2 * n3;
			n1++;
			n2++;
			n3++;
			System.out.println(t);
		}
		
	}

}