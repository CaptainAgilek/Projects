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
public class ChessPiece {
    private char letter;
    private Square square;
    private enum Color{
        white,black
    }
    private Color color;
    public ChessPiece( char letter, ChessPiece.Color color)
    {
        this.letter = letter;
        this.color = color;
    }
    public char letter()
    {
        return letter;
    }
    public ChessPiece.Color color()
    {
        return color;
    }
    public String symbol()
    {
        if(color == Color.black) 
        {
         return "+" + letter;  
        } 
        else return "-" + letter;
    }
    public void setSquare(Square square)
    {
        this.square = square;
    }
    public Square square()
    {
        return square;
    }
    public void setOffBoard()
    {
        square = null;
    }
     public boolean isOffBoard()
    {
        return (square = null);
    }
    
}
