import java.util.Arrays;
public class TablesRecord {
    private int size, length=0, rows=8, columns=8;
    
    private int[][][] tablesRecord;
   
    public TablesRecord(int size) {
        if(size < 1)
            size = 2;
        this.size = size;
        tablesRecord = new int[this.size][rows][columns];
    }
    
    public void addTable(int[][] t) {
        if(length == size)
            doubleSize();
       
        tablesRecord[length] = new int[rows][];
    
        for (int row = 0; row < rows; row++)
            tablesRecord[length][row] = Arrays.copyOf(t[row], t[row].length);
       
        length++;
    }
    
    public void removeTable(int index) {
        tablesRecord[index] = null;
        for (int i=index; i<length; i++){
            tablesRecord[i] = tablesRecord[i+1];
        }
        length--;
    }
    
    public void printTable(int index){
        System.out.println("     0  1  2  3  4  5  6  7");
        for(int i=0; i < rows; i++){
            System.out.printf("%d |  ", i);
            
            for(int j=0; j < columns; j++)
                System.out.printf("%d  ", tablesRecord[index][i][j]);                
            
            System.out.println();
        }
        System.out.println();
    }
    
    public void printAllTables(){
        for(int i=0; i<length; i++){
            System.out.printf("\n%d :\n", i);
            System.out.println("     0  1  2  3  4  5  6  7");
            for(int j=0; j < rows; j++){
                System.out.printf("%d |  ", j);
                
                for(int k=0; k < columns; k++)
                    System.out.printf("%d  ", tablesRecord[i][j][k]);                
                
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public int getLength(){
        return this.length;
    }

    private void doubleSize(){
        this.size *= 2;
        int[][][] temp = new int[this.size][rows][columns];
        
        for(int i=0; i<this.tablesRecord.length; i++)
            temp[i] = this.tablesRecord[i]; 
        
        
        this.tablesRecord = temp;
    }
   
}
