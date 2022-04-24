import java.util.Scanner;

public class test014 {
   
    private static double fatorial(int n){
        double result=n;
        n--;
        for (; n > 0; n--){
            result *= n;
        }

        return result;
        
    }

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int i=1, x=0;
        double sum=0;

        System.out.println("Digite um inteiro.");
        x = scan.nextInt();

        while(i <= 10){
            sum += x/fatorial(i);
            i++;
        }
        
       System.out.printf("\nA soma desses termos é: R$ %.4f", sum);
        scan.close();
    }
}
 