
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner (System.in);
        //Entrada
                    
        System.out.println("Seja Bem vindo ao Java Calculator");
        System.out.println("Digite um número");
        double n1 = scanner.nextDouble();
        System.out.println("Digite outro número");
        double n2 = scanner2.nextDouble();
        
        //Processamento
        
        double r1 = n1 + n2;
        double r2 = n1 - n2;
        double r3 = n1 * n2;
        double r4 = n1 / n2;
        
        System.out.println("Agora digite um operador correspondente a operação desejada: " +
        "Adição +, Subtração -, Multiplicação *, Divisão /");

        String op1 = scanner3.nextLine();
        //System.out.println("valor de op1= "+op1);
    
        //Saída
        //if( op1.charAt(0) == '+') este aqui também funciona desse jeito 
        if(op1.equalsIgnoreCase("+"))
            System.out.println("A soma deles é :" + r1 );
        else
            if (op1.equalsIgnoreCase("/"))
                System.out.println("O quociente deles é :" + r4 );
            else
                if (op1.equalsIgnoreCase("*"))
                    System.out.println("O produto deles é :" + r3 );
                else
                    if (op1.equalsIgnoreCase("-"))
                        System.out.println("A subtração deles é :" + r2 );
                    else {
                        System.out.println("Digite um operador válido!");
                    }
    }

}
