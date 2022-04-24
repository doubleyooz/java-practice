import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class FrequenciaCardiaca{

    private String nome, sobrenome, dia, mes, ano;

    private int max = 220;



    public FrequenciaCardiaca(
        String nome,
        String sobrenome,
        String dia,
        String mes,
        String ano
    )
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
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

    
    
}