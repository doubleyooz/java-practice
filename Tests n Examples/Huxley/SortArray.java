import java.io.*;
import java.util.*;

https://thehuxley.com/problem/407
public class SortArray {
    
    public static int[] sortArray(int[] arr1){
        int n = arr1.length - 1;
        int arr2[] = new int[n+1];
        
        for (int i=0; i < arr1.length; i++)
            arr2[i] = arr1[i];
        
        
        while(n > 0){
            if(arr2[n-1] > arr2[n]){
                int temp = arr2[n-1];
                arr2[n-1] = arr2[n];
                arr2[n] = temp;
            }
            n--;
        }
        /*n=arr1.length-1;
        System.out.printf("old = { ");
        for(int i=0; i < n+1; i++){
            if(i == n)
                System.out.printf("%d ", arr1[i]);
            else
                System.out.printf("%d, ", arr1[i]);
        }
        System.out.printf("}\n");
        
        System.out.printf("new = { ");
        for(int i=0; i < n+1; i++){
            if(i == n)
                System.out.printf("%d ", arr2[i]);
            else
                System.out.printf("%d, ", arr2[i]);
        }
        System.out.printf("}\n");
        */
        if (!Arrays.equals(arr1, arr2))
            arr2 = sortArray(arr2);
            
        return arr2;
       
    }
    
   
    
  public static void main(String args[]) {
    int[] arr = new int[5];
    int[] arr2 = new int[5];
    
    
    Scanner scan = new Scanner(System.in);
    
    arr[0] = scan.nextInt();
    arr[1] = scan.nextInt();
    arr[2] = scan.nextInt();
    arr[3] = scan.nextInt();
    arr[4] = scan.nextInt();
    
    arr2 = sortArray(arr);
    
    for(int i=0; i < 3; i++){
        System.out.println(arr2[i]);
    }
  }
}
