package noobsofjava.flexichess;
public class Queen extends ChessPiece{
    public Queen(ChessBoard board, ChessPiece.Color color) {
        super(board, color);
    }
    public Queen(ChessBoard board, ChessPiece.Color color,char column, int row) {
        super(board, color, column, row);
    }

    @Override
    public char letter() {
        return 'Q'; 
    }
}