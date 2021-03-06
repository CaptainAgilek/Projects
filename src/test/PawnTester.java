import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

import noobsofjava.flexichess.ChessBoard;
import noobsofjava.flexichess.ChessPiece;
import noobsofjava.flexichess.Move;
import noobsofjava.flexichess.Pawn;
import noobsofjava.flexichess.SimpleMove;
import noobsofjava.flexichess.Square;

public class PawnTester extends ChessPieceTester {
	
	@Test
	public void basePosition() {
		ChessBoard board = new ChessBoard(3, 6, 
				new Square('b', 1), new Square('b', 6));
		Pawn whitePawn1 = new Pawn(board, ChessPiece.Color.WHITE, 'a', 1);
		Pawn whitePawn2 = new Pawn(board, ChessPiece.Color.WHITE, 'a', 2);
		Pawn whitePawn3 = new Pawn(board, ChessPiece.Color.WHITE, 'b', 2);
		Pawn whitePawn4 = new Pawn(board, ChessPiece.Color.WHITE, 'c', 2);
		Pawn whitePawn5 = new Pawn(board, ChessPiece.Color.WHITE, 'c', 1);
		
		Pawn blackPawn1 = new Pawn(board, ChessPiece.Color.BLACK, 'a', 6);
		Pawn blackPawn2 = new Pawn(board, ChessPiece.Color.BLACK, 'a', 5);
		Pawn blackPawn3 = new Pawn(board, ChessPiece.Color.BLACK, 'b', 5);
		Pawn blackPawn4 = new Pawn(board, ChessPiece.Color.BLACK, 'c', 5);
		Pawn blackPawn5 = new Pawn(board, ChessPiece.Color.BLACK, 'c', 6);
		
		assertEquals(
				Arrays.asList(
					new Square('b', 2)
				), 
				sortSquares(whitePawn1.threatens()));		
		
		assertEquals(
				Arrays.asList(
					new Square('a', 3),
					new Square('c', 3)
				), 
				sortSquares(whitePawn3.threatens()));
		
		assertEquals(
				Arrays.asList(
					new Square('b', 2)
				), 
				sortSquares(whitePawn5.threatens()));
		
		assertEquals(
				Arrays.asList(
					new Square('b', 5)
				), 
				sortSquares(blackPawn1.threatens()));
		
		assertEquals(
				Arrays.asList(
					new Square('a', 4),
					new Square('c', 4)
				), 
				sortSquares(blackPawn3.threatens()));
		
		assertEquals(
				Arrays.asList(
					new Square('b', 5)
				), 
				sortSquares(blackPawn5.threatens()));
		
		//----------------------------------------------------------------
		
		assertEquals(
				Collections.EMPTY_LIST, 
				sortMoves(board.king(ChessPiece.Color.WHITE).validMoves()));		
		
		assertEquals(
				Collections.EMPTY_LIST, 
				sortMoves(whitePawn1.validMoves()));
		
		assertEquals(
				Arrays.asList(
					new SimpleMove(whitePawn3, new Square('b', 3)),
					new SimpleMove(whitePawn3, new Square('b', 4))
				), 
				sortMoves(whitePawn3.validMoves()));
				
		assertEquals(
				Collections.EMPTY_LIST, 
				sortMoves(board.king(ChessPiece.Color.BLACK).validMoves()));
		
		assertEquals(
				Collections.EMPTY_LIST, 
				sortMoves(blackPawn1.validMoves()));
		
		assertEquals(
				Arrays.asList(
					new SimpleMove(whitePawn3, new Square('b', 3)),
					new SimpleMove(whitePawn3, new Square('b', 4))
				), 
				sortMoves(whitePawn3.validMoves()));
	}
	
	@Test
	public void gamePlay() {
		ChessBoard board = new ChessBoard(3, 6, 
				new Square('b', 1), new Square('b', 6));
		Pawn whitePawn1 = new Pawn(board, ChessPiece.Color.WHITE, 'a', 1);
		Pawn whitePawn2 = new Pawn(board, ChessPiece.Color.WHITE, 'a', 2);
		Pawn whitePawn3 = new Pawn(board, ChessPiece.Color.WHITE, 'b', 2);
		Pawn whitePawn4 = new Pawn(board, ChessPiece.Color.WHITE, 'c', 2);
		Pawn whitePawn5 = new Pawn(board, ChessPiece.Color.WHITE, 'c', 1);
		
		Pawn blackPawn1 = new Pawn(board, ChessPiece.Color.BLACK, 'a', 6);
		Pawn blackPawn2 = new Pawn(board, ChessPiece.Color.BLACK, 'a', 5);
		Pawn blackPawn3 = new Pawn(board, ChessPiece.Color.BLACK, 'b', 5);
		Pawn blackPawn4 = new Pawn(board, ChessPiece.Color.BLACK, 'c', 5);
		Pawn blackPawn5 = new Pawn(board, ChessPiece.Color.BLACK, 'c', 6);
		
		Move move = sortMoves(whitePawn3.validMoves()).get(1);
		move.executeOnBoard(board);
		
		String expected = 
				"   â”Śâ”€â”€â”€â”¬â”€â”€â”€â”¬â”€â”€â”€â”\n" +
				" 6 â”‚-P â”‚-K â”‚-P â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 5 â”‚-P â”‚-P â”‚-P â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 4 â”‚   â”‚+P â”‚   â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 3 â”‚   â”‚   â”‚   â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 2 â”‚+P â”‚   â”‚+P â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 1 â”‚+P â”‚+K â”‚+P â”‚\n" +
				"   â””â”€â”€â”€â”´â”€â”€â”€â”´â”€â”€â”€â”\n" +
				"     a   b   c \n" +
				"W+:\n" +
				"B-:";
		
		assertEquals(expected, board.toString());
		assertEquals(
				Arrays.asList(
					new SimpleMove(whitePawn3, new Square('a', 5)),
					new SimpleMove(whitePawn3, new Square('c', 5))
				), 
				sortMoves(whitePawn3.validMoves()));
		
		move = sortMoves(whitePawn3.validMoves()).get(0);
		move.executeOnBoard(board);		
		expected = 
				"   â”Śâ”€â”€â”€â”¬â”€â”€â”€â”¬â”€â”€â”€â”\n" +
				" 6 â”‚-P â”‚-K â”‚-P â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 5 â”‚+P â”‚-P â”‚-P â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 4 â”‚   â”‚   â”‚   â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 3 â”‚   â”‚   â”‚   â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 2 â”‚+P â”‚   â”‚+P â”‚\n" +
				"   â”śâ”€â”€â”€â”Ľâ”€â”€â”€â”Ľâ”€â”€â”€â”¤\n" +
				" 1 â”‚+P â”‚+K â”‚+P â”‚\n" +
				"   â””â”€â”€â”€â”´â”€â”€â”€â”´â”€â”€â”€â”\n" +
				"     a   b   c \n" +
				"W+:\n" +
				"B-: P";
		assertEquals(expected, board.toString());		
		try{ blackPawn2.threatens(); fail(); } catch(IllegalStateException e) {};
		try{ blackPawn2.validMoves(); fail(); } catch(IllegalStateException e) {};
		
		assertEquals(Collections.EMPTY_LIST, blackPawn1.validMoves());
		assertEquals(Collections.EMPTY_LIST, blackPawn3.validMoves());
		assertEquals(Collections.EMPTY_LIST, blackPawn4.validMoves());
		assertEquals(Collections.EMPTY_LIST, blackPawn5.validMoves());
		
		assertEquals(
				Arrays.asList(
					new SimpleMove(board.king(ChessPiece.Color.BLACK), new Square('a', 5))
				), 
				sortMoves(board.king(ChessPiece.Color.BLACK).validMoves()));
		assertTrue(board.king(ChessPiece.Color.BLACK).isInCheck());
		assertFalse(board.king(ChessPiece.Color.WHITE).isInCheck());
	}
}
