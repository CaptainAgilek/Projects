
package noobsofjava.flexichess.builders;
import noobsofjava.flexichess.ChessBoard;
import noobsofjava.flexichess.ChessPiece;
import noobsofjava.flexichess.Bishop;
import noobsofjava.flexichess.King;
import noobsofjava.flexichess.Knight;
import noobsofjava.flexichess.Pawn;
import noobsofjava.flexichess.Rook;
import noobsofjava.flexichess.Square;

public class Demichess implements ChessGameBuilder{

    @Override
    public ChessBoard board() {
        ChessBoard board = new ChessBoard(4, 8,new Square('a',1),new Square('a',8));
		new Bishop(board, ChessPiece.Color.WHITE, 'b', 1);
		new Knight(board, ChessPiece.Color.WHITE, 'c', 1);
		new Rook(board, ChessPiece.Color.WHITE, 'd', 1);
		
		new Pawn(board, ChessPiece.Color.WHITE, 'a', 2);
		new Pawn(board, ChessPiece.Color.WHITE, 'b', 2);
		new Pawn(board, ChessPiece.Color.WHITE, 'c', 2);
                new Pawn(board, ChessPiece.Color.WHITE, 'd', 2);
		
		new Pawn(board, ChessPiece.Color.BLACK, 'a', 7);
		new Pawn(board, ChessPiece.Color.BLACK, 'b', 7);
		new Pawn(board, ChessPiece.Color.BLACK, 'c', 7);
                new Pawn(board, ChessPiece.Color.BLACK, 'd', 7);
		
		new Bishop(board, ChessPiece.Color.BLACK, 'b', 8);
		new Knight(board, ChessPiece.Color.BLACK, 'c', 8);
		new Rook(board, ChessPiece.Color.BLACK, 'd', 8);
		return board;
    }
    
}
