package Pieces;

public class LS { //a klass to transform letters and numbers
	
	public static String s(int Nr) {//switch number to letter
		String letter;
		switch (Nr) {
			case 1: letter = "a";
				break;
			case 2: letter = "b";
				break;
			case 3: letter = "c";
				break;
			case 4: letter = "d";
				break;
			case 5: letter = "e";
				break;
			case 6: letter = "f";
				break;
			case 7: letter = "g";
				break;
			case 8: letter = "h";
				break;
			default: letter = "that position is not on the board";
		}
		return letter;
	}
	
	public static int s (String Lt) {//switch letter to number
		int nr;
		switch (Lt) {
			case "a": nr = 1;
				break;
			case "b": nr = 2;
				break;
			case "c": nr = 3;
				break;
			case "d": nr = 4;
				break;
			case "e": nr = 5;
				break;
			case "f": nr = 6;
				break;
			case "g": nr = 7;
				break;
			case "h": nr = 8;
				break;
			default: nr = -1;
		}
		return nr;
	}
}
