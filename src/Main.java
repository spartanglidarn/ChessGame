import Pieces.Pawn;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pawn p = new Pawn();
		
		for (int x = 0; x < Board.drawBoard().size(); x ++){
			if (x % 8 == 0){
				System.out.println("");
			}
			System.out.print(Board.drawBoard().get(x));
		}
		System.out.println("");
		p.setPosition(7, 2);
		System.out.println(p.getName());
		System.out.println(p.getPosition());
		//System.out.println(LS.s(1));
		//System.out.println(LS.s("c"));
		p.move("a", 3);
		
		System.out.println(p.getPosition());
	}

}
