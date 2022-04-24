import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Knight{

    private final static int row=8, column=8, max=1000;
    private static int[][] table = new int[row][column];
    private static int[] movesRecord = new int[max], winsRecord = new int[max],  highestRecord = new int[max]; 
    
    private static int squaresFilled=1, movesCount=0, win=0, highest=0;
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

    private static Coordinate[] removeArrayElement(int index, Coordinate[] array){
        if (array == null || index < 0 || index > array.length)
            return array;
           
        List<Coordinate> list = new ArrayList<Coordinate>();
        int i = 0;
        for(Coordinate c : array) {
            if(c != null && i != index)
                list.add(c);            
            i++;
        }

        return list.toArray(new Coordinate[list.size()]);
    }

    private static Coordinate[] sortArray(Coordinate[] array){
        Coordinate[] newArray = new Coordinate[array.length];
       
        /*
        System.out.print("Array: ");
        for(int k=0; k < array.length; k++){
            System.out.printf("(%d,%d) ", array[k].getRow(), array[k].getColumn());
        }
        System.out.println();
        */
        for (int i=0; i < newArray.length; i++){
            Coordinate lowestRate = array[0];
            int mark = 0;
            for (int j=0; j < array.length; j++){
                
                if(array[j] != null){
                    if(lowestRate.getRate() > array[j].getRate())
                    lowestRate = array[j];
                    mark = j;
                }
                
            }
            // Simple swap
            newArray[i] = lowestRate;
            array = removeArrayElement(mark, array);
            /*
            System.out.print("Between Array: ");
            for(int k=0; k < array.length; k++){
                System.out.printf("(%d,%d) ", array[k].getRow(), array[k].getColumn());
            }
            System.out.println();
            */

        }
    
        /*
        System.out.print("New Array: ");
        for(int k=0; k < newArray.length; k++){
            System.out.printf("(%d,%d) ", newArray[k].getRow(), newArray[k].getColumn());
        }
        System.out.println();
        */
        return newArray;
    }

    private static Coordinate[] shuffleArray(Coordinate[] array){
        int index;
        Coordinate temp;
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
        squaresFilled=1;
        movesCount=0;
        win=0;
        highest=0;
        for (int i=0; i < row; i++){
            for (int j=0; j < column; j++){
                table[i][j]=0;
            }
        }
    }

    private static int rateMove(int moveRow, int moveColumn){
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

        int validMoves = 0;

        for(int i=0; i < differences.length; i++){
            Coordinate dest = new Coordinate(moveRow, moveColumn);           
            dest.incrementCoordinate(differences[i]);

            if(dest.isValid()){
                if(table[dest.getRow()][dest.getColumn()] == 0)
                    validMoves++;

            }
        }
        return validMoves;
    }

    private static void knightMove(int currentRow, int currentColumn){
        
        movesCount++;
        while(win == 0){
            if(highest < squaresFilled){
                highest = squaresFilled;
            }

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

            
            Coordinate[] validMoves = new Coordinate[8];
            int marker = 0;   

            for(int i=0; i < differences.length; i++){
                Coordinate dest = new Coordinate(currentRow, currentColumn);
                
                
                dest.incrementCoordinate(differences[i]);

                if(dest.isValid()){  
                    
                    if(table[dest.getRow()][dest.getColumn()] == 0){
                        dest.setRate(rateMove(dest.getRow(), dest.getColumn()));
                        if(dest.getRate() != 0){
                            validMoves[marker] = dest;
                            marker++;
                        }                  
                    }
                }
            }
            
            if(marker == 0){
                if(squaresFilled == 64){
                    table[currentRow][currentColumn] = squaresFilled;
                    win = 1;
                }
                    
                return;
            } else{                
                List<Coordinate> list = new ArrayList<Coordinate>();
                for(Coordinate c : validMoves) {
                    if(c != null)
                        list.add(c);                
                }
                
                validMoves = sortArray(list.toArray(new Coordinate[list.size()]));
                Random rand = new Random();

                int n = rand.nextInt(11); // affects hit rate

                switch (n) {
                    case 2:
                        validMoves = shuffleArray(validMoves);
                        break;
                
                    default:
                        break;
                }
                table[currentRow][currentColumn] = squaresFilled;
                for (int i=0; i < validMoves.length && win == 0; i++){  
                    /*
                    System.out.printf("%d: %d - %d\n", squaresFilled, currentRow, currentColumn);
                    printTable(); 
                    */
                    squaresFilled++;
                    knightMove(validMoves[i].getRow(), validMoves[i].getColumn());
                    if(win == 0)
                        squaresFilled--;
                }                                
                return;                
            }                     
        }       
    }

    private static void printTable(){
        System.out.println("     0  1  2  3  4  5  6  7");
        for(int i=0; i < row; i++){
            System.out.printf("%d | ", i);
            for(int j=0; j < column; j++){
                if(table[i][j] < 10){
                    System.out.printf(" ");
                }
                System.out.printf("%d ", table[i][j]);                
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main (String[]args){
        
        resetTable();
        knightMove(2, 0);
        System.out.printf("Highest: %d, SquaresFilled: %d\n", highest, squaresFilled);
        if(highest < 64){
            System.out.printf("O passeio finalizou com %d movimentos\n", movesCount);
            System.out.println("Sem solução!");
        } else {
            System.out.printf("O passeio finalizou com %d movimentos\n", movesCount);
            System.out.println("Houve um passeio completo! Parabéns!");
        }
        printTable();
        Random rand = new Random();
    
        double hitRate = 0;
        for(int i=0; i < 1000; i++){
            resetTable();
            knightMove(rand.nextInt(8), rand.nextInt(8));
            winsRecord[i] = win;
            movesRecord[i] = movesCount;
            highestRecord[i] = highest;
            if(win == 1)
                hitRate++;
        }

        System.out.println("WINS   MOVES    HIGHEST");
        for(int i=0; i < 1000; i++){
            System.out.printf("%d :  %d   %d   %d\n", i+1, winsRecord[i], movesRecord[i], highestRecord[i]);
            
        }
        System.out.printf("Taxa de precisão: %.2f\n", (hitRate/1000));
        System.out.println("Fim de programa.");
    }
}
