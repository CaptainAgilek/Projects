/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noobsofjava.flexichess;

/**
 *
 * @author Uzivatel
 */
public class ChessBoard {
    
    private int rows, columns;
    private Square[][] squares;
    public ChessBoard( int columns, int rows )
    {
        squares = new Square[columns][rows];
        this.rows = rows;
        this.columns = columns;
     }
    
    public int rows()
    {
        return rows;
    }
    public int columns()
    {
        return columns;
    }
    public ChessPiece pieceAt( char column, int row )
    {
        return squares[x][y];
    }
    public void putPiece( int x, int y, ChessPiece piece )
    {
        squares[x][y].setPiece(piece);
    }
    
   }

