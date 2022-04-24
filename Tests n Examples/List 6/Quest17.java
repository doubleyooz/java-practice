import java.util.Scanner;
public class Quest17 {
	public static boolean eTriang (int n) {
		int n1 = 1, n2 = 2 , n3 = 3; // aparentemente não é apenas isso que define um número triangular
		int t = 0;
		boolean triangular = false;
		
		for (; t < n;) {
			t = n1 * n2 * n3; //t = (n * (n + 1))/ 2;??????
			n1++;
			n2++;
			n3++;
			if (t == n)
				triangular = true;
		}
		return triangular;
	}
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual é o limite da liberdade de expressão?");
		String inutil = scanner.nextLine();
		int loop = 0;
		while (loop == 0) {
			
			for (int i = 300; i <+ 500; i++ ) {
				if (eTriang(i))
					System.out.println(i);
				
					
			}
			System.out.println("Deseja continuar(s/n)? ");
			char temp = 'd';
				
			
			while (temp != 's') {  //O loop só é quebrado se o usuário entrar com 's'ou 'n'
				String restart = scanner.nextLine();
				if (restart.length() < 2)
					if (restart.equalsIgnoreCase(""))
				restart = "p";
				temp = restart.charAt(0);
					
				if (temp == 'n') {
					System.out.println("Fim de Programa.");
					loop = loop + 1; //encerra o programa
					break;
				}	
				else if (temp != 's') {
					System.out.println("Opção inválida!!");
				}
					
			}
		
		}
		
	}

}