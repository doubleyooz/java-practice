import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class PerfilDeSaude{
   
    private String nome;
    
    private String sobrenome, sexo, dia, mes, ano;

    private double altura, peso;

    private int max = 220;



    public PerfilDeSaude(
        String nome,
        String sobrenome,
        String sexo,
        String dia,
        String mes,
        String ano,
        double altura,
        double peso
    )
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
        this.peso = peso;
    }

    public void printImcTable(){
        System.out.println("\nMuito abaixo do peso [16-16,9]");
        System.out.println("Abaixo do peso       [17-18,4]");
        System.out.println("Peso normal          [18,5-24,9]");
        System.out.println("Acima do peso        [25-29,9]");
        System.out.println("Obesidade Grau I     [30-34,9]");
        System.out.println("Obesidade Grau II    [35-40]");
        System.out.println("Obesidade Grau III   [Maior que 40]\n");
    }

    public void printImc(double imc){
        if (imc < 16){
            System.out.println("Criticamente abaixo do peso.");
        } else if (imc >= 16 && imc < 17){
            System.out.println("Muito abaixo do peso.");
        } else if (imc >= 17 && imc < 18.5){
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25){
            System.out.println("Peso normal.");
        } else if (imc >= 25 && imc < 30){
            System.out.println("Acima do peso.");
        } else if (imc >= 30 && imc < 35){
            System.out.println("Obesidade Grau I.");
        } else if (imc >= 35 && imc < 40){
            System.out.println("Obesidade Grau II.");
        } else {
            System.out.println("Obesidade Grau III.");
        }
    }

    public int maxFrequencia(int idade){

        return max - idade;
    }

    public int calcularIdade() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date firstDate = sdf.parse(mes + "/" + dia + "/" + ano);
        

        long diffInMillies = Math.abs(new Date().getTime() - firstDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

    
        return  (int) (diff / 365);
    }

    public double calcularIMC(){
        return peso / (altura * altura);
    }


    public double[] calcularIntervalo(int idade){
        
        int intervalo = maxFrequencia(idade);
        return new double[] { intervalo * 0.85, intervalo * 0.5 };
        
    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getDia(){
        return this.dia;
    }

    public void setDia(String dia){
        this.dia = dia;
    }

    public String getMes(){
        return this.mes;
    }

    public void setMes(String mes){
        this.mes = mes;
    }

    public String getAno(){
        return this.ano;
    }

    public void setAno(String ano){
        this.ano = ano;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    
    
}