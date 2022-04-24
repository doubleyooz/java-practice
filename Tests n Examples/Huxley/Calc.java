import java.io.*;
import java.util.*;

//https://thehuxley.com/problem/2
public class Calc {
    
    private static int cycleSize=2;
    
    public static int calc(int n1){
        if(n1%2 == 0)
            n1/=2;
        else {
            n1*=3;
            n1++;
        }
        
        //System.out.printf("%d, ", n1);
        if(n1 != 1){
            cycleSize++;
            calc(n1);
        }
            
                
        return n1;
    }
    
  public static void main(String args[]) {
   
    int n1, n2, max=0;
    
    Scanner scan = new Scanner(System.in);
    while (scan.hasNextInt()){
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        System.out.printf("%d %d ", n1, n2);
        if(n2 < n1){
            int temp = n1;
            n1=n2;
            n2=temp;
        }
        
        
        
        while(n1 <= n2){
            calc(n1);
            if(max < cycleSize)
                max = cycleSize;
            cycleSize=2;
            n1++;
        }
        System.out.println(max);
        
        
    }
   
    
    
  
  }
}