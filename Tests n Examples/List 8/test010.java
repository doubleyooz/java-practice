import java.util.Scanner;

public class test010 {
    public static boolean isBinary(int number) {
        int copyOfInput = number;

        while (copyOfInput != 0) {
            if (copyOfInput % 10 > 1) {
                return false;
            }
            copyOfInput = copyOfInput / 10;
        }
        return true;
    }

    private static int toDecimal(int number) {
        int copyOfInput = number;
        double count=0, result=0;

        while (copyOfInput != 0) {
            if (copyOfInput % 10 > 0) {
                result += Math.pow(2, count);
            }
            copyOfInput = copyOfInput / 10;
            count++;
        }
        return (int) result;
    }
    public static void main(String[]args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número binário");
        n = scan.nextInt();

        if(isBinary(n)){
            System.out.printf("%d em decimal: %d\n", n, toDecimal(n));
            
        } else{
            System.out.println("Não é binário.");
        }
        scan.close();
    }
}
