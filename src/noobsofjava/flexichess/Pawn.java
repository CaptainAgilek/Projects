package noobsofjava.flexichess;
public class Pawn extends ChessPiece{
    public Pawn(ChessBoard board, ChessPiece.Color color) {
        super(board, color);
    }
    public Pawn(ChessBoard board, ChessPiece.Color color,char column, int row) {
        super(board, color, column, row);
    }

    @Override
    public char letter() {
        return 'P'; 
    }
}