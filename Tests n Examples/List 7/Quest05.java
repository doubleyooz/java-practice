import java.util.Scanner;
import java.util.Random;
public class Quest05 {
	
	private static Scanner scanner = new Scanner (System.in);
	
	//números aleatórios
	private static double m1[] = new double [40];
	private static double m2[] = new double [40];
	private static double m3[] = new double [40];
	private static double m4[] = new double [40];
	private static double start = 0;
	private static double end = 10;
	private static int repeat = 0;//loop
	private static boolean nextBreak = false;
	
	
	//preencher notas
	public static void preencherNotas() { //new Random().nextDouble()
		for (int i = 0;  i < m1.length; i++) { //double aleatório de 0 - 1;
			
			m1[i] = start + (new Random().nextDouble() * (end - start));
				
		}
		
		for (int i = 0;  i < m2.length; i++) {
			
			m2[i] = start + (new Random().nextDouble() * (end - start));
			
		}
		
		for (int i = 0;  i < m3.length; i++) {
			
			m3[i] = start + (new Random().nextDouble() * (end - start));
			
		}
		
		for (int i = 0;  i < m4.length; i++) {
			
			m4[i] = start + (new Random().nextDouble() * (end - start));
			
		}
	}
	
	
	
	public static double eDouble(String str) {
		double valid;
		try {	
			str = str.replace(",", ".");
			valid = Double.parseDouble(str);
		
		}
		catch (NumberFormatException e) {
			valid = 121;
		}
		return valid;
		
	}
	
	public static int eInteger(String str) {
		int valid;
		try {	
			
			valid = Integer.parseInt(str);
		
		}
		catch (NumberFormatException e) {
			valid = 121;
		}
		return valid;
		
	}
	
	public static boolean loop(String restart) { // menu sim ou não
		
		char temp = 'd';
		boolean end = false;
		
		while (temp != 's') {  //O loop só é quebrado se o usuário entrar com 's'ou 'n'
			
			if (restart.length() > 1 || restart.equalsIgnoreCase("")) 
				restart = "p";
				
			temp = restart.charAt(0);
				
			if (temp == 'n') {
				end = true; //encerra o programa
				break;
			}	
			else if (temp != 's') {
				System.out.println("Opção inválida!!");
				restart = scanner.nextLine();
			}
				
		}
		return end;
	}
	
	//receber notas
	public static void receberNotas(double m[]) {
		
		nextBreak = false;
		for (int i = 0;  i < m.length; i++) {
			String nota = "j";
			int loop2 = 0;
			while (loop2 == 0) {
				System.out.println("Digite a primeira nota do aluno " + (i + 1));
				nota = scanner.nextLine();
				
				if (nota.equals("Sair")) {
					System.out.println("Fim de Programa.");
					repeat++;
					nextBreak = true;
					break;
				}
					
				else if (eDouble(nota) >= 0 && eDouble(nota) <= 10) 	{
					m[i] += eDouble(nota);
					loop2++;
				}
				
				else {
					System.out.println("Valor digitado inválido!");
					System.out.println("Deseja tentar inserir esta nota novamente?");
					String answer = scanner.nextLine();
					if (loop(answer)) {
						loop2++;
						m[i] = 0;
						
					}
				}
			}
			
			if (nextBreak)
				break;						
		}
		
		
	}
	
	public static void main(String[] args) {
	
		boolean newOption = false;
		
		System.out.println("Bem vindo ao Medianator 4000!!!"); // Boas vindas
		System.out.println("Tecle [ENTER] para continuar: ");
     	String enter = "nada";
     	  	
		while (!enter.equals("")) {
				
				enter = scanner.nextLine();//vai ler o que o usuário digitar
				//O loop só é quebrado se o usuário entrar com \n
				if (enter.equals(""))
					break;
		}	
		
		
		
		while (repeat == 0) {
			
			nextBreak = false;
			
			//menu 1
			System.out.println("Escolha a opção desejada: ");
			
			if (newOption)
				System.out.println("0 - Utilizar banco de dados existente ");
			
			System.out.println("1 - Gerar novo banco de dados");
			System.out.println("2 - Inserir novos dados");
			System.out.println("3 - Sair");
			String op = "e";
			
			int menu1 = 0;
			
			while (menu1 == 0) {
				op = scanner.nextLine();
				int option = eInteger(op);
				if (!newOption && option == 0)
					option = 121;
							
				
				
				switch (option) {
					case 0:
						menu1++;
						break;
						
					case 1: //As médias são preenchidas com números aleatórios
						
						preencherNotas();
						menu1++;
						break;
						
					case 2:// O usuário insere as notas de cada media
						
					
						System.out.println("Primeira avaliação.");
						System.out.println("Digite 'Sair' a qualquer momento para encerrar a aplicação.");
						
						receberNotas(m1);
						
						if (nextBreak)
							break;
						else 
							System.out.println(nextBreak);
												
						System.out.println("Segunda avaliação.");
						System.out.println("Digite 'Sair' a qualquer momento para encerrar a aplicação.");

						receberNotas(m2);
					
						if (nextBreak)
							break;
						
						System.out.println("Terceira avaliação.");
						System.out.println("Digite 'Sair' a qualquer momento para encerrar a aplicação.");
						
						receberNotas(m3);
												
						if (nextBreak)
							break;
						
						
						System.out.println("Quarta avaliação.");
						System.out.println("Digite 'Sair' a qualquer momento para encerrar a aplicação.");
						
						receberNotas(m4);
						
						menu1++;
						break;
						
					case 3:
						System.out.println("Fim de Programa.");
						repeat ++;
						nextBreak = true;
						break;
				
					default:
						System.out.println("Opção inválida tente novamente!!");
						break;
				}
				
				if (nextBreak)
					break;
			}
		
			if (nextBreak)
				break;
			
			//menu 2
			int menu2 = 1;
			System.out.println("Escolha um opção: ");
			System.out.println("1 - Exibir média anual de cada aluno");
			System.out.println("2 - Exibir média da turma");
			System.out.println("3 - Exibir média de um aluno específico");
			System.out.println("4 - Voltar para o menu anterior");
			
			do {				
				op = scanner.nextLine();
				int option2 = eInteger(op);
				
				
				double mediaAlunos[] = new double [40];
				double sum = 0;
				double mediaTurma = 0;
				
				if (option2 != 4) {
					for (int i = 0; i < 40; i++) { // Calcula a média de cada aluno
						mediaAlunos[i] = (m1[i] + m2[i] + m3[i] + m4 [i]) / 4;
					}	
				}
				
				switch (option2){
					case 1:
						System.out.println("A média de cada aluno: ");
						for (int i = 0; i < 40; i++) {
							System.out.println("Aluno " + (i + 1));
							System.out.printf(" %.2f\n", mediaAlunos[i]);
						}
						menu2++;
						break;
						
					case 2:
						for(int i2 = 0; i2 < mediaAlunos.length; i2++){
					        sum = sum +  mediaAlunos[i2];
						}
						mediaTurma = sum / 40;
						System.out.println("A média da turma é: ");
						System.out.printf(" %.2f\n", mediaTurma);
						menu2++;
						break;
					
					
					case 3:
						int aluno = 0;
						int selectThis = 0;
						
						while (selectThis == 0) {
							System.out.println("Digite o número do aluno desejado: ");
							op = scanner.nextLine();
							aluno = eInteger(op);
							if (aluno > 0 && aluno <= 40) {						
								System.out.printf("A média do aluno %d é: %.2f \n", aluno, mediaAlunos[aluno - 1]);
								menu2++;
								break;
							}
							
							else {
								System.out.println("Aluno inexistente!");
								System.out.println("Deseja tentar novamente?");
								String answer = scanner.nextLine();
								if (loop(answer))
									selectThis++;
								
							}
						}
						break;
						
						
						
					
					case 4:
						repeat = 0;
						menu2++;
						break;
						
					default: 
						System.out.println("Opção inválida!");
						menu2 = 0;
						break;
				}
				
				if (option2 >= 0 && option2 < 4) {
					newOption = true;
					System.out.println("Deseja continuar(s/n)? ");
					int v = 0;
					String restart = scanner.nextLine();
					while (v == 0) {
					
						if (loop(restart)) {
							System.out.println("Fim de Programa.");
							v++;
							repeat++;
						}
					
						else 
							v++;
					}
				}
				
			}while (menu2 == 0);		
					
		}
			
	}
}

