package tp.pr5.logic;

import tp.pr5.Resources.Resources;

public class ReversiRules implements GameRules {

	private int dimX = Resources.DIMX_REVERSI;
	private int dimY = Resources.DIMY_REVERSI;
	private Counter winner;
	
	public ReversiRules() {
		winner = Counter.EMPTY;
	}

	public Counter winningMove(Move lastMove, Board b) {
		boolean valid = false;
		Counter c = Counter.EMPTY;

		// Check if isFull(), no body wons
		
		return c;
	}

	
	
	
	// TODO: Aqu� faltan los algoritmos para ver si aluien ha gando o no
	
	
	
	
	
	public Board newBoard() {
		Board b = new Board(dimX, dimY);
		int initX = dimX / 2, initY = dimY / 2;

		// Initializing board with tiles
		
		b.setPosition(initX, initX+1, Counter.WHITE);
		b.setPosition(initX, initY, Counter.BLACK);
		b.setPosition(initX+1, initY+1, Counter.BLACK);
		b.setPosition(initX+1, initY, Counter.WHITE);
		
		return b;
	}

	public boolean isDraw(Counter lastMove, Board b) {
		boolean isDraw = false;
		
		if ((b.isFull()) && (winner == Counter.EMPTY)) {
			isDraw = true;
		}
		else {
			isDraw = false;
		} 
		 
		return isDraw;
	}

	public Counter initialPlayer() {
		return Counter.BLACK;
	}

	public Counter nextTurn(Counter lastMove, Board b) {
		Counter nextTurn = Counter.EMPTY;
		
		if (lastMove == Counter.WHITE) {
			nextTurn = Counter.BLACK;
		}
		else if (lastMove == Counter.BLACK) {
			nextTurn = Counter.WHITE;
		}

		return nextTurn;
	}

	public int getDimX() {return this.dimX;}
	public int getDimY() {return this.dimY;}
	public int intRules() {return 3;}

}
