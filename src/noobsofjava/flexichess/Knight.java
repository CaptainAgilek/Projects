package noobsofjava.flexichess;
public class Knight extends ChessPiece{
    public Knight(ChessBoard board, ChessPiece.Color color) {
        super(board, color);
    }
    public Knight(ChessBoard board, ChessPiece.Color color,char column, int row) {
        super(board, color, column, row);
    }

    @Override
    public char letter() {
        return 'S'; 
    }
}
