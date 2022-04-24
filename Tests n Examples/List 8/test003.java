public class test003 {
    
    private static double p = 1000000000, r = 0.04, n = 1;

    private static double[] calc(double limit, double n_limit){
        double total = 0;
        n = 1;
        switch ((int) n_limit){
            case 110:               
                while (n < n_limit){
                    total = p * Math.pow((1 + r), n);
                    n++;      
                }
                break;
            default:
                while (total < limit){
                    total = p * Math.pow((1 + r), n);
                    n++;
                }
                break;
        }        
        return new double[] {total, n};
    } 
    public static void main (String [] args){
        

        double[] result = calc(p*1.5, -n);

        System.out.printf("Levarão %.0f meses para o Facebook atingir 1.5 bi\n", result[1] -1);

        result = calc(p*2, -n);
        System.out.printf("Levarão %.0f meses para o Facebook atingir 2 bi\n", result[1]-1);

        result = calc(p, 110);
        System.out.printf("O Facebook terá %.0f usuários em 12/2021\n", result[0]);

    }
}
