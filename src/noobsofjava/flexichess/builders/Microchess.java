/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noobsofjava.flexichess.builders;

import noobsofjava.flexichess.Bishop;
import noobsofjava.flexichess.ChessBoard;
import noobsofjava.flexichess.ChessPiece;
import noobsofjava.flexichess.King;
import noobsofjava.flexichess.Knight;
import noobsofjava.flexichess.Pawn;
import noobsofjava.flexichess.Rook;

public class Microchess implements ChessGameBuilder {
    
     @Override
    public ChessBoard board() {
        ChessBoard board = new ChessBoard(4, 5);
		
		new Rook(board, ChessPiece.Color.WHITE, 'a', 1);
		new Bishop(board, ChessPiece.Color.WHITE, 'b', 1);
		new Knight(board, ChessPiece.Color.WHITE, 'c', 1);
                new King(board, ChessPiece.Color.WHITE, 'd', 1);
		
		new Pawn(board, ChessPiece.Color.WHITE, 'd', 2);
		
		
		new Pawn(board, ChessPiece.Color.BLACK, 'a', 4);
		
		
		new King(board, ChessPiece.Color.BLACK, 'a', 5);
		new Knight(board, ChessPiece.Color.BLACK, 'b', 5);
		new Bishop(board, ChessPiece.Color.BLACK, 'c', 5);
                new Rook(board, ChessPiece.Color.BLACK, 'd', 5);
		
		return board;
    }
}
