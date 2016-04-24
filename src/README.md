# RockPaperScissorGameV2
Version two of rock, paper and scissor game. Made in Java with class hierarchy


## Packages
	
	Default
	Gui
	Pieces

## Classes

	Main
		Initializing the game and drawing a board.
	Piece
		Superclass to all pieces that will hold variables and methods for all types of pieces (Queen, Bishop, pawn etc....
	Pawn
		Superclass to Piece that will hold the logic and information that is specific to a pawn and no other pieces.
	Board
		Builds an ArrayList with all the positions on the board. 
		Also contains an ArrayList with all the removed pieces from the board. (not implemented yet)
	ColorPiece
		Not sure what this will do yet. Ignore
	LS
		Switch between numbers and letters in positioning
	GUIBoard
		Will be the all the GUI classes. (not implemented yet)