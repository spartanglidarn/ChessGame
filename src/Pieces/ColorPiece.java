package Pieces;

import java.util.HashMap;
import java.util.Map;

public class ColorPiece {
	int color;
	Map<String, String> positionMap = new HashMap<String, String>();
	
	public void setStartMap(int c) {
		color = c; 
		if (color < 0){ // negative number is white
			for (int x = 0; x < 8; x++) { //for loop på add the pawns
				String row = "7"; 
				Pawn p = new Pawn("2", "a");
			}
		}

		
		if (color > 0){ // positive number is black
			
		}
	}
	
}
