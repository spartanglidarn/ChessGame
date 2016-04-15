
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 0; x < Board.drawBoard().size(); x ++){
			if (x % 8 == 0){
				System.out.println("");
			}
			System.out.print(Board.drawBoard().get(x));
		}
		//System.out.println(Board.drawBoard());

	}

}
