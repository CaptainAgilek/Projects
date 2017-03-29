import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

import noobsofjava.flexichess.ChessBoard;
import noobsofjava.flexichess.ChessPiece;
import noobsofjava.flexichess.SimpleMove;
import noobsofjava.flexichess.Pawn;
import noobsofjava.flexichess.Square;

public class MoveTester {

	@Test
	public void simpleMove() {
		ChessBoard board = new ChessBoard(3, 3, 
				new Square('b', 1), new Square('b', 3));
		ChessPiece whitePawn = new Pawn(board, ChessPiece.Color.WHITE, 'c', 2);
		ChessPiece blackPawn = new Pawn(board, ChessPiece.Color.BLACK, 'a', 2);
		
		SimpleMove move = new SimpleMove(whitePawn, new Square('c', 3));
		assertEquals(new Square("c2"), move.from());
		assertEquals(new Square("c3"), move.to());
		assertSame(whitePawn, move.piece());
		assertFalse(move.isCapturing());
		assertEquals("Pc2-c3", move.notation());
		assertEquals("Pc2-c3", move.toString());
		
		move.executeOnBoard(board);
		
		String expected = 
				"   â”Śâ”€â”€â”€â”¬â”€â”€â”€â”¬â”€â”€â”€â”\n" + 
				" 3 â”‚   â”‚-K â”‚+P â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 2 â”‚-P â”‚   â”‚   â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 1 â”‚   â”‚+K â”‚   â”‚\n" +
				"   â””â”€â”€â”€â”´â”€â”€â”€â”´â”€â”€â”€â”\n" +
				"     a   b   c \n" +
				"W+:\n" +
				"B-:";
		assertEquals(expected, board.toString());
		assertEquals(1, whitePawn.moveCounter());
		
		move.revertOnBoard(board);
		expected = 
				"   â”Śâ”€â”€â”€â”¬â”€â”€â”€â”¬â”€â”€â”€â”\n" + 
				" 3 â”‚   â”‚-K â”‚   â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 2 â”‚-P â”‚   â”‚+P â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 1 â”‚   â”‚+K â”‚   â”‚\n" +
				"   â””â”€â”€â”€â”´â”€â”€â”€â”´â”€â”€â”€â”\n" +
				"     a   b   c \n" +
				"W+:\n" +
				"B-:";
		assertEquals(expected, board.toString());
		assertEquals(0, whitePawn.moveCounter());
		
		move = new SimpleMove(blackPawn, new Square('c', 2));
		assertEquals(new Square("a2"), move.from());
		assertEquals(new Square("c2"), move.to());
		assertSame(blackPawn, move.piece());
		assertTrue(move.isCapturing());
		assertEquals("Pa2-xc2", move.notation());
		assertEquals("Pa2-xc2", move.toString());
		
		move.executeOnBoard(board);
		expected = 
				"   â”Śâ”€â”€â”€â”¬â”€â”€â”€â”¬â”€â”€â”€â”\n" + 
				" 3 â”‚   â”‚-K â”‚   â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 2 â”‚   â”‚   â”‚-P â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 1 â”‚   â”‚+K â”‚   â”‚\n" +
				"   â””â”€â”€â”€â”´â”€â”€â”€â”´â”€â”€â”€â”\n" +
				"     a   b   c \n" +
				"W+: P\n" +
				"B-:";
		assertEquals(expected, board.toString());
		assertEquals(1, blackPawn.moveCounter());
		
		move.revertOnBoard(board);
		expected = 
				"   â”Śâ”€â”€â”€â”¬â”€â”€â”€â”¬â”€â”€â”€â”\n" + 
				" 3 â”‚   â”‚-K â”‚   â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 2 â”‚-P â”‚   â”‚+P â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 1 â”‚   â”‚+K â”‚   â”‚\n" +
				"   â””â”€â”€â”€â”´â”€â”€â”€â”´â”€â”€â”€â”\n" +
				"     a   b   c \n" +
				"W+:\n" +
				"B-:";
		assertEquals(expected, board.toString());
		assertEquals(0, blackPawn.moveCounter());
	}
}
