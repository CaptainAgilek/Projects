/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noobsofjava.flexichess;

import java.util.Objects;

/**
 *
 * @author sedlam39
 */
public class SimpleMove implements Move{
    private ChessPiece piece;
    private Square from,to;
    public SimpleMove(ChessPiece piece, Square to)
    {
        this.piece = piece;
        this.to = to;
    }
    public Square from()
    {
       return from; 
    }
    public Square to()
    {
       return to; 
    }
    public ChessPiece piece()
    {
        return piece;
    }
    @Override
    public void executeOnBoard(ChessBoard board) {
        if( isCapturing())
            board.capturePieceAt(to.column, to.row);
      
         piece.setPosition(to);
    }

    @Override
    public void revertOnBoard(ChessBoard board) {
        if(isCapturing())
            board.returnLastCapturedTo(to.column, to.row);
        
        piece.setPosition(from);
    }
    public boolean isCapturing()
    {
       if(!piece.board.isEmptyAt(to.column, to.row))
            return true;          
         return false;
    }
    @Override
    public String notation() {
        String res = piece.letter()+from.toString()+"-";
        if (isCapturing())
            res += 'x';
        res += to.toString();
        
        //PIECE_LETTER SQUARE_FROM '-' 'x'? SQUARE_TO
        return res;
    }
    @Override
    public String toString()
    {
      return notation();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.piece);
        hash = 53 * hash + Objects.hashCode(this.from);
        hash = 53 * hash + Objects.hashCode(this.to);
        hash = 53 * hash + (this.captured ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SimpleMove other = (SimpleMove) obj;
        if (this.captured != other.captured) {
            return false;
        }
        if (!Objects.equals(this.piece, other.piece)) {
            return false;
        }
        if (!Objects.equals(this.from, other.from)) {
            return false;
        }
        if (!Objects.equals(this.to, other.to)) {
            return false;
        }
        return true;
    }


    

}
