import java.util.Scanner;
public class Quest06 {
	
	
	public static void main(String [] args) {
		int li = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o limite inferior: ");
		li = scanner.nextInt();
		System.out.println("Digite o limite superior: ");
		int ls = scanner.nextInt();
		int r = 0;
		for (int i = li;  i <= ls; i++) {
			r += i * i;
		}
		System.out.println(r);	
	}

}
