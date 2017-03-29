import java.util.Collections;
import java.util.List;

import noobsofjava.flexichess.ChessBoard;
import noobsofjava.flexichess.ChessPiece;
import noobsofjava.flexichess.ChessPieceVisitor;
import noobsofjava.flexichess.Move;
import noobsofjava.flexichess.Square;

public class TestPiece extends ChessPiece {

	public TestPiece(ChessBoard board, Color color) {
		super(board, color);
	}

	public TestPiece(ChessBoard board, Color color, char column, int row) {
		super(board, color, column, row);
	}

	@Override
	public char letter() {
		return 'T';
	}
	
	@Override
	public List<Move> validMoves() {
		return Collections.emptyList();
	}

	@Override
	public List<Square> threatens() {
		return Collections.emptyList();
	}

	@Override
	public boolean canBeCaptured() {
		return true;
	}

	@Override
	public <T> T accept(ChessPieceVisitor<T> visitor) {
		return null;
	}
}