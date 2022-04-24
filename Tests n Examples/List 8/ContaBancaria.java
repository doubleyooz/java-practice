public class ContaBancaria {
 
    private double saldo;


    public ContaBancaria(double saldoInicial){
        if(saldo < 0)
            this.saldo = 0;
        else
            this.saldo = saldoInicial;
    }

    public void deposito(double value){
        if(value <= 0){

        } else
            this.saldo += value;
            
    }

    public boolean saque (double value){
        if(value > this.saldo){
            System.out.println("Saldo insuficiente para realizar a operação.");
            return false;
        } else{
            this.saldo -= value;
            return true;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }
}
