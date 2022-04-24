import java.util.Scanner;
public class Quest04 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("O homem corrompe o meio ou é corrompido por este?");
		String n1 = scanner.nextLine(); //não serve para nada
		
		for (int i = 100;  i < 300; ) {
			System.out.println(i);
			i += 2;
		}
		
	}

}
