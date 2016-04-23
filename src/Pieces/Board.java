package Pieces;
import java.util.ArrayList;

public class Board {

	ArrayList<String> removedPieces = new ArrayList<String>();
	//method for removing a piece and adding the removed piece to an arrayList
	public void removePiece (int posX, int posY){
		//get the piece that is at the position
		//add it to removedPieces arrayList
	}
	
	
	//Draw a board and save it to a arraylist that is returned if you call the method
	public static ArrayList<String> drawBoard () {
		int[] x = new int[8];
		int[] y = new int[8];
		
		ArrayList<String> theBoard = new ArrayList<String>();
		
		for (int i =0; i < x.length; i++) {
			for (int j = 0; j < y.length; j ++) {
				String letter = LS.s(i + 1); //sends the int from variable i to class LS and transforms it to a letter between a-h
				theBoard.add(letter + (j+1));
			}//end nested for-loop
		}//end nested for-loop
		
		return theBoard;
	} // end drawBoard method
	
}
