import java.util.Scanner;

public class Main10 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas vezes o programa deve repetir?");
		int t = scan.nextInt();// O valor de t define quantas vezes o loop continuará
		int min;
		
		while(t-- !=0) {
			
			//System.out.println("Quantos inteiros irão ser digitados?");
			//int n = scan.nextInt() - 1; //Essa é uma maneira de pedir essa informação para o usuário 
			System.out.println("Qual o comprimento do vetor?");
			int n = scan.nextInt();// O valor de n define quantos arrays o r terá
			int[] r = new int[n];
			min = 10000;
			
			//Aqui o usuário insere o valor de cada array
			for(int i=0; i<=r.length - 1; i++) { // Dessa maneira o último array fica vazio, o certo seria 
				System.out.println("Digite um inteiro: ");//for(int i=0; i<=r.length; i++) 
				r[i] = scan.nextInt();
				
				
			}
			
			for(int i=0; i<r.length - 1; i++) {// min é reduzido para um valor menor/igual que r[i]
				while(r[i]%min != 0) {
					min--;
				}
			}
			
			for(int i =0; i<n; i++) {// O valor de cada array é divido por min
				r[i]= r[i]/min;
				System.out.printf("O valor da posição %d foi alterado \n", i);
			}
		
			for(int i =0; i<n; i++) {//Aqui ele exibe o novo valor de cada array
				System.out.print(r[i]+" ");
				
			}
			
			System.out.println();
		}
	}
}