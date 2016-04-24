package Pieces;
import java.util.ArrayList;

public class Pawn extends Piece {

	//ArrayList<String> positionList;
	public Pawn() {
		this.name = "Pawn";
		String position;
		String returnStatement = "I am a pawn without a position";
	}
	
	public Pawn(String x, String y) { //Us this constructor to set a position to the object when you create it
		position = x+y;
	}
	
	public Pawn(String n) { //use this constructor to set a different name then pawn to the object
		this.name = n;
	}
	

}
