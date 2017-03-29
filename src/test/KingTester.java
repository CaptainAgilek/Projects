import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

import noobsofjava.flexichess.ChessBoard;
import noobsofjava.flexichess.ChessPiece;
import noobsofjava.flexichess.SimpleMove;
import noobsofjava.flexichess.Pawn;
import noobsofjava.flexichess.Square;

public class KingTester extends ChessPieceTester {

	@Test
	public void openField() {
		ChessBoard board = new ChessBoard(3, 3, 
				new Square('b', 1), new Square('b', 3));
		
		assertEquals(
				Arrays.asList(
					new Square('a', 1),
					new Square('a', 2),
					new Square('b', 2),
					new Square('c', 1),
					new Square('c', 2)
				), 
				sortSquares(board.king(ChessPiece.Color.WHITE).threatens()));		
		
		assertEquals(
				Arrays.asList(
					new Square('a', 2),
					new Square('a', 3),
					new Square('b', 2),
					new Square('c', 2),
					new Square('c', 3)
				), 
				sortSquares(board.king(ChessPiece.Color.BLACK).threatens()));
		
		assertEquals(
				Arrays.asList(
					new SimpleMove(board.king(ChessPiece.Color.WHITE), new Square('a', 1)),
					new SimpleMove(board.king(ChessPiece.Color.WHITE), new Square('c', 1))
				), 
				sortMoves(board.king(ChessPiece.Color.WHITE).validMoves()));
		
		assertEquals(
				Arrays.asList(
					new SimpleMove(board.king(ChessPiece.Color.BLACK), new Square('a', 3)),
					new SimpleMove(board.king(ChessPiece.Color.BLACK), new Square('c', 3))
				), 
				sortMoves(board.king(ChessPiece.Color.BLACK).validMoves()));
	}
}
