package noobsofjava.flexichess;
public class King extends ChessPiece{
    public King(ChessBoard board, ChessPiece.Color color) {
        super(board, color);
    }
    public King(ChessBoard board, ChessPiece.Color color,char column, int row) {
        super(board, color, column, row);
    }

    @Override
    public char letter() {
        return 'K'; 
    }
}