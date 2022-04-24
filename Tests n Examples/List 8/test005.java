import java.util.Scanner;

public class test005 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 10, sum = 0;
        
        a = scan.nextInt();
        b = scan.nextInt();
        scan.close();

        for (;a <= b; a++){
            if (a % 2 != 0)
                sum += a;
            
        }

        System.out.printf("A soma do números é %d", sum);
        
    }
}
