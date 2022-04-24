package Att_004;

import java.io.InterruptedIOException;

public class Labyrinth {

    private static final char vertical='|', horizontal='-', path='.', deadEnd='x';
    private static final char empty= ' ', obstacle='@', p1='a', p2='b';
    private static final int size = 10;
    private static final double prob = 0.6;
    private static char[][] table;
    private static int start[] = new int[2];
    private static int previous[] = new int[2];
    private static int end[] = new int[2];

    public static void main(String[]args){
        table = new char[size][size];
        createTable();
        printTable();
        try{
            if(findPath(start[0], start[1])){
                System.out.println("You have found your goal!!");
            } else{
                System.out.println("All the roads come to an end, in this case a dead end.");
            }
        } catch(Exception e){
            System.out.println("Something went wrong.");
        }
        
    }

    public static boolean findPath(int currentLine, int currentColumn) throws InterruptedException {
        
        boolean finish = false, deadEnded;
        while(!finish){
            char[] temp = {
                table[currentLine-1][currentColumn], // up
                table[currentLine+1][currentColumn], // down
                table[currentLine][currentColumn-1], // left
                table[currentLine][currentColumn+1]  // right
            };
            //System.out.printf("[ %c, %c, %c, %c]\n", temp[0], temp[1], temp[2], temp[3]);
                        
            deadEnded = true;
            Thread.sleep(1000);
            for (char c : temp){
                if (c == p2) {
                    table[currentLine][currentColumn] = path;
                    printTable();
                    return true;
                } else if (c == empty){
                    deadEnded=false;
                }
                 
            }

            if (deadEnded){
                finish=true;
                if(!(currentLine == start[0] && currentColumn == start[1]))
                    table[currentLine][currentColumn] = deadEnd;
                printTable();
            } else {

                for (int i=0; i < temp.length; i++) {
                    if (temp[i] == empty){
                        if(!(currentLine == start[0] && currentColumn == start[1]))
                            table[currentLine][currentColumn] = path;
                        previous[0] = currentLine;
                        previous[1] = currentColumn;
                        printTable();
                        switch (i){
                            case 0: // up
                                if(findPath(currentLine-1, currentColumn))
                                    return true;                                
                                break;
                            
                            case 1: // down
                                if(findPath(currentLine+1, currentColumn))
                                    return true;                               
                                break;
    
                            case 2: // left
                                if (findPath(currentLine, currentColumn-1))
                                    return true;
                                break;
    
                            case 3: // right
                                if (findPath(currentLine, currentColumn+1))
                                    return true;                               
                                break;
                            
                            default:
                                break;
                        }
                    } 
                }
            }                 
        }
        return false;
    }

    public static int generateNumber(int min, int max){
        return (int) (min + Math.round(Math.random()*(max-min)));
    }

    public static void createTable(){
        for (int i=0; i < size; i++){
            table[i][0] = vertical;
            table[i][size-1] = vertical;
            table[0][i] = horizontal;
            table[size-1][i] = horizontal;
        }
        table[size-1][0] = horizontal; //improving ui

        for (int i=1; i < size-1; i++){
            for (int j=1; j < size-1; j++){
                if(Math.random() > prob){
                    table[i][j] = obstacle;
                } else{
                    table[i][j] = empty;
                }
            }
        }
        // the start point always appears on the botton left of the table
        // the end point always appears on the upper right of the table
        start[0] = generateNumber(5, size-1);
        start[1] = generateNumber(1, size/2-1);
        end[0] = generateNumber(1, size/2-1);
        end[1] = generateNumber(size/2, size-3);

        table[start[0]][start[1]] = p1;
        table[end[0]][end[1]] = p2;
    }

    public static void printTable(){
        for (int i=0; i < size; i++){
            for (int j=0; j < size; j++){
               System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }    
}