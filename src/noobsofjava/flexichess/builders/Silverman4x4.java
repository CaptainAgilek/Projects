/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noobsofjava.flexichess.builders;

import noobsofjava.flexichess.ChessBoard;
import noobsofjava.flexichess.ChessPiece;
import noobsofjava.flexichess.King;
import noobsofjava.flexichess.Pawn;
import noobsofjava.flexichess.Queen;
import noobsofjava.flexichess.Rook;

/**
 *
 * @author Uzivatel
 */
public class Silverman4x4 implements ChessGameBuilder{

    @Override
    public ChessBoard board() {
        ChessBoard board = new ChessBoard(4, 4);
		
		new Rook(board, ChessPiece.Color.WHITE, 'a', 1);
		new Queen(board, ChessPiece.Color.WHITE, 'b', 1);
		new King(board, ChessPiece.Color.WHITE, 'c', 1);
                new Rook(board, ChessPiece.Color.WHITE, 'd', 1);
		
		new Pawn(board, ChessPiece.Color.WHITE, 'a', 2);
		new Pawn(board, ChessPiece.Color.WHITE, 'b', 2);
		new Pawn(board, ChessPiece.Color.WHITE, 'c', 2);
                new Pawn(board, ChessPiece.Color.WHITE, 'd', 2);
		
		new Pawn(board, ChessPiece.Color.BLACK, 'a', 3);
		new Pawn(board, ChessPiece.Color.BLACK, 'b', 3);
		new Pawn(board, ChessPiece.Color.BLACK, 'c', 3);
                new Pawn(board, ChessPiece.Color.BLACK, 'd', 3);
		
		new Rook(board, ChessPiece.Color.BLACK, 'a', 4);
		new Queen(board, ChessPiece.Color.BLACK, 'b', 4);
		new King(board, ChessPiece.Color.BLACK, 'c', 4);
                new Rook(board, ChessPiece.Color.BLACK, 'd', 4);
		
		return board;
    }
    
}
