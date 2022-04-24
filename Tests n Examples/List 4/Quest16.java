//Quest16.java exibe seis números aleatórios
import java.util.Random;

public class Quest16 {

	public static void main(String[] args) {
		Random random = new Random();
		
		//Entrada
		System.out.println("Lhe apresento seis números aleatórios entre 1 e 60");
		
		
		//Processamento	
		for (int i = 0; i < 6; i++) {
			//Saída
			System.out.println(random.nextInt(61));
		}
		
	
	  		// TODO Auto-generated method stub

	}

}