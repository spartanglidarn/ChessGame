package Pieces;

public class Piece {
	String position;
	String name;
	String color; 
	
	public void setName(String n){
		name = n;
	}
	
	public String getName () {
		return name;
	}
	public void setPosition(int x, int y) {
		String i = LS.s(x);
		position = i + y;
	}
	public void setPosition(String x, int y) {
		position = x + y;
	}
	public String getPosition() {
		return position;
	}
	public void move(String x, int y){
		String newPosition = x + y;
		this.position = newPosition;
	}
	public void move(int x, int y){
		String letter = LS.s(x);
		String newPosition = letter + y;
		this.position = newPosition;
	}
}
