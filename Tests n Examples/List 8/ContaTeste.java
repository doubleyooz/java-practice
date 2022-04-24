public class ContaTeste {
    
    public static void main (String[]args){
        ContaBancaria cb1 = new ContaBancaria(500);
        ContaBancaria cb2 = new ContaBancaria(0);

        if(cb1.saque(200))
            System.out.println("Saque 1 realizado com sucesso");
        else
            System.out.println("Saque 1 falhou.");
        
        if(cb2.saque(450))
            System.out.println("Saque 2 realizado com sucesso");
        else
            System.out.println("Saque 2 falhou.");

        System.out.printf("Saldo conta 1: US$ %.2f\n", cb1.getSaldo());
        System.out.printf("Saldo conta 2: US$ %.2f\n", cb2.getSaldo());
    }
}
