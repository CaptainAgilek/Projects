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
public class Square {
    private ChessPiece piece;
    private int row;
    private char column;
    public Square( char column, int row )
    {
        this.row = row;
        this.column = column;
    }
    public void putPiece( ChessPiece piece )
    {
        this.piece = piece;
    }
    public ChessPiece piece()
    {
        return piece;
        //if null exception
    }
    public int row()
    {
        return row;
    }
    public char column()
    {
        return column;
    }
    public  boolean isEmpty()
    {
        return ( piece == null );
    }
    public ChessPiece Empty()
    {
        ChessPiece tmp = piece;
        piece.setOffBoard();
        piece = null;
        return tmp;
    }
}
