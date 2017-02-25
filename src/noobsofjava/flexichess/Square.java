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
    private int row, column;
    public Square( int x, int y )
    {
        row = x;
        column = y;
    }
    public void setPiece( ChessPiece piece )
    {
        this.piece = piece;
    }
    public ChessPiece piece()
    {
        return piece;
    }
    public int row()
    {
        return row;
    }
    public int column()
    {
        return column;
    }
    public Boolean isEmpty()
    {
        return ( piece == null );
    }
    public void Clear()
    {
        piece = null;
    }
}
