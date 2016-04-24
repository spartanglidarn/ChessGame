package Pieces;

import java.util.HashMap;
import java.util.Map;

public class ColorPiece {
	public static final int WHITE = 0, BLACK = 1;
	int color;
	Map<String, String> positionMap = new HashMap<String, String>();
	
	public void setStartMap(int c) {
		color = c; 
		if (color == 0){ // 0 represents white
			for (int x = 0; x < 8; x++) { //for loop på add the pawns
				String row = "7"; 
				Pawn p = new Pawn("2", "a");
			}
		}

		
		if (color > 1){ // 1 represents black
			
		}
	}
	
}
