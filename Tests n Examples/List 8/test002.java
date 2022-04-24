import java.util.Scanner;

public class test002 {
    
    private static String nome = "jojo", sobrenome = "Souza", sexo = "M", dia = "26", mes = "6", ano = "1999";
    private static double altura = 1.8, peso = 80.0;

    private static void setInfo(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        nome = scan.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = scan.nextLine();

        System.out.println("Informe seu sexo (M/F): ");
        sexo = scan.nextLine();

        System.out.println("Informe o dia de seu nascimento: ");
        dia = scan.nextLine();

        System.out.println("Informe o mes de seu nascimento: ");
        mes = scan.nextLine();

        System.out.println("Informe o ano de seu nascimento: ");
        ano = scan.nextLine();

        System.out.println("Informe o seu altura em m: ");
        altura = scan.nextDouble();

        System.out.println("Informe o seu peso em Kg: ");
        peso = scan.nextDouble();

        scan.close();
    }

    public static void main(String args[]){
        try{
            setInfo();
        
            PerfilDeSaude f1 = new PerfilDeSaude(nome, sobrenome, sexo, dia, mes, ano, altura, peso);
    
            System.out.println(f1.getNome());
            System.out.println(f1.getSobrenome());
            System.out.println(f1.getSexo());
            System.out.printf("%s/%s/%s\n", f1.getDia(), f1.getMes(), f1.getAno());
            System.out.printf("%.2fm\n", f1.getAltura());
            System.out.printf("%.2fkg\n", f1.getPeso());

            int idade = f1.calcularIdade();
            int max = f1.maxFrequencia(idade);
            double[] intervalo = f1.calcularIntervalo(idade);

            System.out.printf("Sua Idade: %d\n", idade);
            System.out.printf("Sua frequência máxima : %d\n", max);
            System.out.printf("Sua intervalo desejado : Entre %.2f e %.2f\n", intervalo[0], intervalo[1]);
            f1.printImcTable();
            f1.printImc(f1.calcularIMC());
        } catch (Exception e){
            e.printStackTrace();
        }     
    }
}