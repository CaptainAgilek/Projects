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
    private final String letter;
    public ChessPiece( String letter )
    {
        this.letter = letter;
    }
    public String letter()
    {
        return letter;
    }
}
