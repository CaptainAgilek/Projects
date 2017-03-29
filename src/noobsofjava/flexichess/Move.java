/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noobsofjava.flexichess;

/**
 *
 * @author sedlam39
 */
public interface Move {
    public void executeOnBoard(ChessBoard board);
    public void revertOnBoard(ChessBoard board);
    public String notation();
}
