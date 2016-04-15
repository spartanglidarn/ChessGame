package Pieces;

public class Pawn extends Piece {
	private String name = "Pawn";
	String position;
	
	public Pawn() {
		String returnStatement = "I am a pawn without a position";
	}
	
	public Pawn(int x, int y) {
		posX = x;
		posY = y;
		
		String returnStatement = "I am a pawn with a position";
		
	}
	
	public String getName () {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
}
