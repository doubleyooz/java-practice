import java.util.Scanner;

public class ThreeNPlusOne
{
    private static int buffer = 0;
    
    private static int sequence(int n) {
        buffer++;
       
        if (n == 1) return buffer;
        else if(n % 2 == 0) return sequence(n/2);
        else return sequence(3 * n + 1);
        
    }
    
    private static int[] period(int j, int k){
        if(j > k) {
            int temp = j;
            j = k;
            k = temp;
        }
        
        int[] intArray = new int[k - j + 1];
        for (; j <= k; j++) intArray[k - j] = j;
        
        return intArray;
    }
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    while (scan.hasNextInt()){
	        int j = scan.nextInt(), k = scan.nextInt(), h=0;
	    
    	    int[] arr = period(j, k);
    	    
    	    for (int i : arr) {
    	        int result = sequence(i);
    	        if(h < result) h = result;
    	        buffer = 0;
    	    }
    	    
    		System.out.printf("%d %d %d\n", j, k, h);
	    }
        scan.close();
	   
	}
}
