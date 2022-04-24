import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test016 {
   
    private static int counter = 0;

    private static Integer[][] useMatrix(Integer[][] matrix, int length){
        Integer[][] zeroPosition = new Integer[length*length][];
        
        
        for(int i = 0; i < length; i++){
           for(int j = 0; j < length; j++){
                if (matrix[i][j] == 0){
                    Integer[] newArray = {j};
                    zeroPosition[counter] = newArray;
                    counter++;
                    
                }
                
            }
        }

        return zeroPosition;
        
    }

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int y=0, x=0, count=0;
        double sum=0;

        System.out.println("Digite o lado de uma matriz.");
        y = scan.nextInt();
        x = y * y;

        Integer[][] matrix = new Integer[y][y];
        
        System.out.printf("Informe %d inteiros:\n", x);
        for(int i = 0; i < y; i++)
            for(int j = 0; j < y; j++)
                matrix[i][j] = scan.nextInt();
        
        
        for(int i = 0; i < y; i++){
            
            for(int j = 0; j < y; j++)
                System.out.printf(" %d ", matrix[i][j]);
            System.out.println();
        }

        Integer[][] zeros = useMatrix(matrix, y);

        for(int i = 0; i < zeros.length; i++){
            if(zeros[i] != null){
                try{
                   
                    for(int j = 0; j < zeros[i].length; j++){
                        if(zeros[i][j] != null){
                            System.out.printf("linha = %d || coluna = %d\n", i, zeros[i][j]);
                        }
                    }                  
                    System.out.println();
                } catch(Exception e){
    
                }
            }
            
            
        }
        System.out.printf("Zeros encontrados: %d", counter);

        scan.close();
    }
}
 