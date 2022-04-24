import java.util.Scanner;

public class test004 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int num = 6;
        System.out.println("Digite um número inteiro entre 1-38");
        num = scan.nextInt();

        if(num > 0 && num < 39){
            for (int i=1; i <= num; i++){
                for (int k=1; k <= num; k++){
                    if(i == 1 || i == num){
                        System.out.print("* ");
                    } else if (k == 1 || k == num){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Fora dos limites");
        }
        scan.close();
        
    }
    
}
