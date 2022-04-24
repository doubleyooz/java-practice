public class Coordinate {
    private int row, column, min=0, max=8;

   
    public Coordinate(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getColumn() {
        return this.column;
    }

    public int getRow() {
		return this.row;
	}

    public void printCoordinate(){
        System.out.printf("(%d, %d) ", this.row, this.column);
    }

    public void incrementCoordinate(Coordinate c){
        this.row += c.row;
        this.column += c.column;
    }
    
    public boolean isValid(){
        return this.row >= min && this.row < max && this.column >= min && this.column < max;
        
    }
}
