import java.util.Scanner;

public class teste {

	
	public static void main(String[] args) {
		System.out.println("Hello World");
		boolean enter = false;
		
		Scanner scanner = new Scanner (System.in);
		String n1 = scanner.nextLine();

		if (n1.equals(""))
			enter = true;
		
		
		System.out.print("20");
		System.out.println(n1);
		System.out.println("18");
		System.out.println(enter);
	}
}