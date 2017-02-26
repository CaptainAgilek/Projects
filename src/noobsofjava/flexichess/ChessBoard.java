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
    public ChessBoard( int rows, int columns )
    {
        squares = new Square[rows][columns];
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
    public Square squareAt( int x, int y )
    {
        return squares[x][y];
    }
    public void putPiece( int x, int y, ChessPiece piece )
    {
        squares[x][y].setPiece(piece);
    }
    
   }

