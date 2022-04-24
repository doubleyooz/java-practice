import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test017 {
   
    
    private static void quadradoDeCaracteres(char a, char b, int num){
        
        for(int i = 0; i < num; i++){
            for(int j=0; j < num; j++){
                if(j==i){
                    System.out.printf("%c ", a);
                    
                } else if(j == num-i-1){
                    System.out.printf("%c ", a);
                } else {
                    System.out.printf("%c ", b);
                }
                
            }     
            System.out.println();
        }        
    }

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        char a, b;
        int num;

        System.out.println("Digite um caractere.");
        a = scan.next().charAt(0);

        System.out.println("Digite outro caractere.");
        b = scan.next().charAt(0);
    
        System.out.println("Digite o lado do quadrado.");
        num = scan.nextInt();
        
        quadradoDeCaracteres(a, b, num);

        scan.close();
    }
}
 