import java.util.Scanner;

public class test001 {
    
    private static String nome = "jojo", sobrenome = "Souza", dia = "26", mes="6", ano="1999";

    private static void setInfo(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        nome = scan.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = scan.nextLine();

        System.out.println("Digite o dia de seu nascimento: ");
        dia = scan.nextLine();

        System.out.println("Digite o mes de seu nascimento: ");
        mes = scan.nextLine();

        System.out.println("Digite o ano de seu nascimento: ");
        ano = scan.nextLine();
        scan.close();
    }

    public static void main(String args[]){
        try{
            setInfo();
        
            FrequenciaCardiaca f1 = new FrequenciaCardiaca(nome, sobrenome, dia, mes, ano);
    
            System.out.println(f1.getNome());
            System.out.println(f1.getSobrenome());
            System.out.printf("%s/%s/%s\n", f1.getDia(), f1.getMes(), f1.getAno());
    
            int idade = f1.calcularIdade();
            int max = f1.maxFrequencia(idade);
            double[] intervalo = f1.calcularIntervalo(idade);

            System.out.printf("Sua Idade: %d\n", idade);
            System.out.printf("Sua frequência máxima : %d\n", max);
            System.out.printf("Sua intervalo desejado : Entre %.2f e %.2f\n", intervalo[0], intervalo[1]);
        } catch (Exception e){
            e.printStackTrace();
        }     
    }
}