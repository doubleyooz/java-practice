import java.util.Scanner;
import java.util.Arrays;

public class test008 {
         
    public static void main (String[] args){
        int n=0, km=0, lt=0, temp=0, temp2=0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos tanques serão avaliados?");

        n = scan.nextInt();
        
        double[] results = new double [n];
        for (int i=0; i < n; i++){
            System.out.print("\nQuilometros corridos: ");
            temp = scan.nextInt();
            km += temp;
            System.out.print("Litros consumidos: ");
            temp2 = scan.nextInt();

            lt+=temp2;

            results[i] = (double) temp/temp2;
            System.out.printf("\nTanque %d: %.2f km/lt\n", i+1, results[i]);
            System.out.printf("Distância percorrida até então: %d km\n", km);
            System.out.printf("Gasolida consumida até então: %d L\n", lt);

        }

        System.out.printf("arr[] : %s\n", Arrays.toString(results));
        scan.close();
    }
}
