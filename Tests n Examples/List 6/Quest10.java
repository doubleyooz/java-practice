import java.util.Scanner;


public class Quest10 {
	public static boolean lerString(String s){
		
		boolean invalid = false;//RETORNA TRUE CASO ENCONTRE CARACTERES QUE NAO SEJAM 'TGCA'
		
		for (int i = 0;  i < s.length(); i++) {
			char l;
			l = s.charAt(i);
			if ( l != 'T' && l != 'G' && l != 'C' && l != 'A')
				invalid = true;
		}
		
		if (s.trim().isEmpty() || s.length() <= 1)//NÃO PODE ESTA VAZIO OU TER APENAS UM CARACTERE
			return false;
			
		if (invalid)
			return false;
		else
			return true;
			
	}


	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String n1;
		String n2 = "";
		char l;
		System.out.println("Digite uma fita de DNA: ");
		n1 = scanner.nextLine();
		if (!lerString(n1))
			System.out.println("Formato informado inválido!!");
		else {
			for (int i = 0;  i < n1.length(); i++) {
				l = n1.charAt(i);
				n2 = l + n2;//INVERSOR
				
			}
			System.out.println(n2);
		}
	}

}