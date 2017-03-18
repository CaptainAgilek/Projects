package noobsofjava.flexichess;

public class Bishop extends ChessPiece{
    public Bishop(ChessBoard board, ChessPiece.Color color) {
        super(board, color);
    }
    public Bishop(ChessBoard board, ChessPiece.Color color,char column, int row) {
        super(board, color, column, row);
    }

    @Override
    public char letter() {
        return 'B'; 
    }
}