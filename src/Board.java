import java.util.ArrayList;

public class Board {

	ArrayList<String> removedPieces = new ArrayList<String>();
	
	public static ArrayList<String> drawBoard () {
		int[] x = new int[8];
		int[] y = new int[8];
		
		ArrayList<String> theBoard = new ArrayList<String>();
		
		for (int i =0; i < x.length; i++) {
			for (int j = 0; j < y.length; j ++) {
				String letter = "";
				switch (i) {
					case 0: letter = "a";
					break;
					case 1: letter = "b";
					break;
					case 2: letter = "c";
					break;
					case 3: letter = "d";
					break;
					case 4: letter = "e";
					break;
					case 5: letter = "f";
					break;
					case 6: letter = "g";
					break;
					case 7: letter = "h";
					break;
				}
				theBoard.add(letter + (j+1));
			}//end nested for-loop
		}//end nested for-loop
		
		return theBoard;
	} // end drawBoard method
	
}
