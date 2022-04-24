import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main{

    private final static int row=8, column=8, max=1000;
    private static int[][] table = new int[row][column];
    private static int[] winsRecord = new int[max];
    private static TablesRecord t1 = new TablesRecord(5);
    private static int movesCount=0, wins=0;
    /*
    0 1 0 1 0 0 0 0
    1 0 0 0 1 0 0 0
    0 0 1 0 0 0 0 0
    1 0 0 0 1 0 0 0
    0 1 0 1 0 0 0 0
    0 0 0 0 0 0 0 0
    0 0 0 0 0 0 0 0
    0 0 0 0 0 0 0 0
    */

   
    private static int[] shuffleArray(int[] array){
        int index;
        int temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--){
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    private static void resetTable(){
        for (int i=0; i < row; i++){
            for (int j=0; j < column; j++){
                table[i][j]=0;
            }
        }
    }

    //not working
    private static int generateSetup2(int moveRow, int moveColumn){
        
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7};
        
        Coordinate differences[] = {                
            new Coordinate(-2, -1),
            new Coordinate(-2, 1),
            new Coordinate(1, -2),
            new Coordinate(-1, -2),
            new Coordinate(2, -1),
            new Coordinate(2, 1),
            new Coordinate(-1, 2),
            new Coordinate(1, 2)
        };
       
        array = shuffleArray(array);
       
        for (int i=0; i < 8; i++){
            table[i][array[i]] = 1;
            if(!((i == 0 && array[i] == 0) || 
                 (i == 0 && array[i] == 7) ||
                 (i == 7 && array[i] == 0) ||
                 (i == 7 && array[i] == 7))
                ){
                 
                Coordinate dest = new Coordinate(i, array[i]); // current position
                for(int i=0; i < differences.length; i++){
                    Coordinate dest = new Coordinate(moveRow, moveColumn);           
                    dest.incrementCoordinate(differences[i]);
        
                    if(dest.isValid()){
                        generateSetup2(dest.getRow(), dest.getColumn());
        
                    }
                }
        
                   
            } else {
                
                
                
            }
          
            
            
            
        }
        


      

        int validMoves = 0;

        
        return validMoves;
    }

    private static boolean validateSetup(boolean verbose){
        if(verbose){
            for (int i=0; i<8; i++){
                for (int k=0; k<8; k++){
                    if(table[i][k] == 1){
                        System.out.printf("table[%d][%d] == 1\n", i, k);
                        Coordinate c1 = new Coordinate(i-1, k+1);
                        Coordinate c2 = new Coordinate(i+1, k-1);
                        Coordinate c3 = new Coordinate(i+1, k+1);
                        Coordinate c4 = new Coordinate(i-1, k-1);
                        while(c1.isValid() || c2.isValid() || c3.isValid() || c4.isValid()){
                            System.out.printf("\nc1 table[%d][%d]\n", c1.getRow(), c1.getColumn());
                            if(c1.isValid()){
                                if(table[c1.getRow()][c1.getColumn()] == 1){
                                    System.out.printf("c1 table[%d][%d] == 1\n", c1.getRow(), c1.getColumn());
                                    return false;
                                }
                                    
                                c1.incrementCoordinate(new Coordinate(-1, 1));
                            } 
                       
                            System.out.printf("\nc2 table[%d][%d]\n", c2.getRow(), c2.getColumn());
                            if(c2.isValid()){
                                if(table[c2.getRow()][c2.getColumn()] == 1){
                                    System.out.printf("c2 table[%d][%d] == 1\n", c2.getRow(), c2.getColumn());
                                    return false;
                                }
                                   
                                c2.incrementCoordinate(new Coordinate(1, -1));
                            } 
                            System.out.printf("\nc3 table[%d][%d]\n", c3.getRow(), c3.getColumn());
                            if(c3.isValid()){
                                if(table[c3.getRow()][c3.getColumn()] == 1){
                                    System.out.printf("c3 table[%d][%d] == 1\n", c3.getRow(), c3.getColumn());
                                    return false;
                                }
                                   
                                c3.incrementCoordinate(new Coordinate(1, 1));
                            } 
                            System.out.printf("\nc3 table[%d][%d]\n", c4.getRow(), c4.getColumn());
                            if(c4.isValid()){
                                if(table[c4.getRow()][c4.getColumn()] == 1){
                                    System.out.printf("c4 table[%d][%d] == 1\n", c4.getRow(), c4.getColumn());
                                    return false;
                                }
                                   
                                c4.incrementCoordinate(new Coordinate(-1, -1));
                            } 
                            
                        }
                        
                    }
                }
            }
            return true;
        }
        
        for (int i=0; i<8; i++){
            for (int k=0; k<8; k++){
                if(table[i][k] == 1){
                    Coordinate c1 = new Coordinate(i-1, k+1);
                    Coordinate c2 = new Coordinate(i+1, k-1);
                    Coordinate c3 = new Coordinate(i+1, k+1);
                    Coordinate c4 = new Coordinate(i-1, k-1);
                    while(c1.isValid() || c2.isValid() || c3.isValid() || c4.isValid()){
                        if(c1.isValid()){
                            if(table[c1.getRow()][c1.getColumn()] == 1)
                                return false;
                            
                            c1.incrementCoordinate(new Coordinate(-1, 1));
                        } 

                        if(c2.isValid()){
                            if(table[c2.getRow()][c2.getColumn()] == 1)
                                return false;
                            
                            c2.incrementCoordinate(new Coordinate(1, -1));
                        } 
                       
                        if(c3.isValid()){
                            if(table[c3.getRow()][c3.getColumn()] == 1)
                                return false;
                            
                            c3.incrementCoordinate(new Coordinate(1, 1));
                        } 
                    
                        if(c4.isValid()){
                            if(table[c4.getRow()][c4.getColumn()] == 1)
                                return false;
                        
                            c4.incrementCoordinate(new Coordinate(-1, -1));
                        } 
                    }
                }
            }
        }
        return true;
        
    }
   
    private static void generateSetup(){
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7};
       
        array = shuffleArray(array);
       
        for (int i=0; i < 8; i++)
            table[i][array[i]] = 1;
        

    }

    private static void printTable(){
        
        System.out.println("     0  1  2  3  4  5  6  7");
        for(int i=0; i < row; i++){
            System.out.printf("%d |  ", i);
            for(int j=0; j < column; j++){
                System.out.printf("%d  ", table[i][j]);                
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main (String[]args){
        while(movesCount < max){
            movesCount++;
            generateSetup();
            if(validateSetup(false)){
                System.out.printf("TRUE n° %d\n", movesCount);
                printTable();
                winsRecord[wins] = movesCount;
                t1.addTable(table); 
                wins++;
                
            } else{
                System.out.printf("FALSE n° %d\n", movesCount);
            }
            resetTable();
        }
        
        System.out.println("******************************************");
        System.out.println("Total Soluções");
        System.out.printf("%d      %d\n", movesCount, wins);
        if(wins != 0){
            System.out.print("Soluções verdadeiras: ");
            for(int i=0; i<wins; i++){
                if(i == wins-1)
                    System.out.printf("%d.\n", winsRecord[i]);
                else
                    System.out.printf("%d, ", winsRecord[i]);
        
            }
           
            if(wins < 5){
                for(int i=0; i<wins; i++){
                    System.out.printf("%d:\n", winsRecord[i]);
                    t1.printTable(i);
                }
            }
        }
    }
}