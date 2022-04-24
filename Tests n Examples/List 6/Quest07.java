import java.util.Scanner;
public class Quest07 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String n1;
		char l;
		int b = 0, c = 0 , d = 0;
		System.out.println("Digite uma palavra: ");
		n1 = scanner.nextLine();
		
		for (int i = 0;  i < n1.length(); i++) {
			l = n1.charAt(i);
			if (l == 'B')
				b++;
			else if ( l == 'C')
				c++;
			else if (l == 'D')
				d++;
		}
		System.out.println("Na palavra contém: ");
		System.out.println(b + " letras B;");
		System.out.println(c + " letras C;");
		System.out.println(d + " letras D;");
	}

}
