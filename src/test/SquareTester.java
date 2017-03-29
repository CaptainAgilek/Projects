import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

import noobsofjava.flexichess.ChessBoard;
import noobsofjava.flexichess.ChessPiece;
import noobsofjava.flexichess.SimpleMove;
import noobsofjava.flexichess.Pawn;
import noobsofjava.flexichess.Square;

public class SquareTester {

	@Test
	public void stepping() {
		Square square = new Square("c4");
		assertEquals(new Square("d5"), square.step(1, 1));
		assertEquals(new Square("d4"), square.step(1, 0));
		assertEquals(new Square("d3"), square.step(1, -1));
		assertEquals(new Square("c5"), square.step(0, 1));
		assertEquals(new Square("c4"), square.step(0, 0));
		assertEquals(new Square("c3"), square.step(0, -1));
		assertEquals(new Square("b5"), square.step(-1, 1));
		assertEquals(new Square("b4"), square.step(-1, 0));
		assertEquals(new Square("b3"), square.step(-1, -1));
		
		assertEquals(new Square("f2"), square.step(3, -2));
		assertEquals(new Square("a7"), square.step(-2, 3));
	}
}
