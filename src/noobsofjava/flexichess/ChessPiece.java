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
    private Char letter;
    private enum Color{
        white,black
    }
    private Color color;
    public ChessPiece( Char letter, Color color)
    {
        this.letter = letter;
        this.color = color;
    }
    public Char letter()
    {
        return letter;
    }
    public Color color()
    {
        return color;
    }
}
