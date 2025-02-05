package tp.pr5.logic;

import tp.pr5.Resources.Counter;
import tp.pr5.Resources.Resources;

public class GravityMove extends Move{

	public GravityMove(int moveColumn, int moveRow, Counter moveColour) {
		super(moveColour, moveColumn);
		super.row = moveRow;
	}

	@Override
	public boolean executeMove(Board board) throws InvalidMove {
		boolean validMove = false;
		
		if ((column >= 1 && column <= Resources.DIMX_GRAVITY) && (row >= 1 && row <= Resources.DIMY_GRAVITY)) {
			if (board.getPosition(column, row) == Counter.EMPTY) {
				validMove = true;
				GravityMove realMove = Resources.applyGravity(board, column, row, super.getPlayer());
				board.setPosition(realMove.getColumn(), realMove.getRow(), realMove.getPlayer());
				row = realMove.getRow();
				column = realMove.getColumn();
			}
		}	
		
		return validMove;
	}

	public void undo(Board board) {
		board.setPosition(column, row, Counter.EMPTY); 
	}
	
	public int getColumn() {
		return this.column;
	}
	
	public int getRow() {
		return this.row;
	}
}
