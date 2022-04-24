public class test012 {
    
    public static void main (String[]args){
        int count=1, op=1, matchesAt = 0;
        double pi=4, n=4, n2=3;
        while(count <= 200000){
            switch (op) {
                case 0:
                    pi += n/n2; 
                    op = 1;
                    break;
                case 1:
                    pi -= n/n2;
                    op = 0;
                default:
                    break;
            }
            if(String.valueOf(pi).startsWith("3.14159") && matchesAt == 0){
                matchesAt = count;
            }
           
            n2+=2;
            count++;
        }
        System.out.printf("%.10f\n", pi);
        System.out.printf("A partir de %d termos a aproximações começam com 3,14159\n", matchesAt);
    }
}
