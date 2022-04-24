import java.util.Scanner;

public class test006 {
    
    private static double cilindro(double radius, double height){
        return Math.PI * Math.pow(radius, 2) * height;
    }

    private static double cone(double radius, double height){
        return Math.PI * Math.pow(radius, 2) * (height/3);
    }

    private static double prisma(double baseArea, double height){
        return baseArea * height;
    }

    private static double esfera(double radius){
        return Math.PI * Math.pow(radius, 3) * 4/3;
    }
    public static void main (String[] args){
        int n = 0;
        boolean repeat = true;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculator");

        while(repeat){
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Calcular e exibir o volume de um cilindro");
            System.out.println("2 - Calcular e exibir o volume de um cone");
            System.out.println("3 - Calcular e exibir o volume de um prisma");
            System.out.println("4 - Calcular e exibir o volume de uma esfera");
            System.out.println("5 - Finalizar aplicação");
            
            n = scan.nextInt();

            double radius, height;
            switch(n){
                case 1:
                    System.out.println("Digite o raio: ");
                    radius = scan.nextDouble();
                    System.out.println("Digite a altura: ");
                    height = scan.nextDouble();
                    System.out.printf("O volume do cilindro é %.2f\n", cilindro(radius, height));
                    break;
                case 2:
                    System.out.println("Digite o raio: ");
                    radius = scan.nextDouble();
                    System.out.println("Digite a altura: ");
                    height = scan.nextDouble();
                    System.out.printf("O volume do cone é %.2f\n", cone(radius, height));
                    break;
                case 3:
                    System.out.println("Digite a área da base: ");
                    radius = scan.nextDouble();
                    System.out.println("Digite a altura: ");
                    height = scan.nextDouble();
                    System.out.printf("O volume do prisma regular é %.2f\n", prisma(radius, height));
                    break;
                case 4:
                    System.out.println("Digite o raio: ");
                    radius = scan.nextDouble();
                    
                    System.out.printf("O volume da esfera é %.2f\n", esfera(radius));
                    break;
                case 5:
                    repeat = !repeat;
                    scan.close();
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
            
        }
    }
}
