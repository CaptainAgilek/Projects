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
import noobsofjava.flexichess.Queen;
import noobsofjava.flexichess.Rook;
import noobsofjava.flexichess.Square;

public class Regularchess implements ChessGameBuilder {

    @Override
    public ChessBoard board() {
        ChessBoard board = new ChessBoard(8, 8,new Square('e',1),new Square('e',8));
	
		new Rook(board, ChessPiece.Color.WHITE, 'a', 1);
		new Knight(board, ChessPiece.Color.WHITE, 'b', 1);
		new Bishop(board, ChessPiece.Color.WHITE, 'c', 1);
                new Queen(board, ChessPiece.Color.WHITE, 'd', 1);
                new Bishop(board, ChessPiece.Color.WHITE, 'f', 1);
                new Knight(board, ChessPiece.Color.WHITE, 'g', 1);
                new Rook(board, ChessPiece.Color.WHITE, 'h', 1);
		
		new Pawn(board, ChessPiece.Color.WHITE, 'a', 2);
		new Pawn(board, ChessPiece.Color.WHITE, 'b', 2);
		new Pawn(board, ChessPiece.Color.WHITE, 'c', 2);
                new Pawn(board, ChessPiece.Color.WHITE, 'd', 2);
		new Pawn(board, ChessPiece.Color.WHITE, 'e', 2);
		new Pawn(board, ChessPiece.Color.WHITE, 'f', 2);
                new Pawn(board, ChessPiece.Color.WHITE, 'g', 2);
		new Pawn(board, ChessPiece.Color.WHITE, 'h', 2);
		
		
		new Pawn(board, ChessPiece.Color.BLACK, 'a', 7);
		new Pawn(board, ChessPiece.Color.BLACK, 'b', 7);
		new Pawn(board, ChessPiece.Color.BLACK, 'c', 7);         
		new Pawn(board, ChessPiece.Color.BLACK, 'd', 7);
		new Pawn(board, ChessPiece.Color.BLACK, 'e', 7);
		new Pawn(board, ChessPiece.Color.BLACK, 'f', 7);       
		new Pawn(board, ChessPiece.Color.BLACK, 'g', 7);
		new Pawn(board, ChessPiece.Color.BLACK, 'h', 7);
                
		
		new Rook(board, ChessPiece.Color.BLACK, 'a', 8);
		new Knight(board, ChessPiece.Color.BLACK, 'b', 8);
		new Bishop(board, ChessPiece.Color.BLACK, 'c', 8);
                new Queen(board, ChessPiece.Color.BLACK, 'd', 8);
                new Bishop(board, ChessPiece.Color.BLACK, 'f', 8);
                new Knight(board, ChessPiece.Color.BLACK, 'g', 8);
                new Rook(board, ChessPiece.Color.BLACK, 'h', 8);
                
		return board;
    }
    
}
