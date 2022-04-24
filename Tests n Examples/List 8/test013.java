import java.util.Scanner;

public class test013 {
   

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int id=0, quantity=0;
        double cart = 0;
        boolean repeat = true;

        while(repeat){

            System.out.println("Insira o id do produto: ");
            id = scan.nextInt();
    
            System.out.println("Insira a quantidade vendida: ");
            quantity = scan.nextInt();
            scan.nextLine();
            switch (id) {
                case 1:
                    cart += quantity * 2.98;
                    break;
                case 2:
                    cart += quantity * 4.5;
                    break;
                case 3:
                    cart += quantity * 9.98;
                    break;
                case 4:
                    cart += quantity * 4.49;
                    break;
                case 5:
                    cart += quantity * 6.87;
                    break;
            
                default:
                    System.out.println("Produto não encontrado!!");
                    break;
            
               
            }

            System.out.println("Tecle ENTER para continuar ou 'exit' para finalizar a operação.");
            try {
                String read = scan.nextLine();
                
                if(read.equalsIgnoreCase("exit"))
                    repeat = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
       System.out.printf("\nCarrinho: R$ %.2f", cart);
        scan.close();
    }
}
 