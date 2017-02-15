import java.util.*;

public class Letter extends AsciiArtDesign{
	private final int ROW = 10;
	private final int COL = 20;
	private final char printStream;
	public Letter(char printStream){
		// initialize instance variables
		this.printStream = printStream;
	}

	public void print(){
		char[][] asciiMatrix = hashmap.get(printStream); 
		for(int i = 0; i< ROW; i++){
			for(int j = 0; j < COL; j++){
				System.out.print(asciiMatrix[i][j]);
			}
			System.out.println();
		}
	}
}