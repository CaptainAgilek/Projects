import noobsofjava.flexichess.ChessBoard;
import noobsofjava.flexichess.Square;

public abstract class ChessPiece {
    public enum Color {white, black};
    public Color color;
    private char letter;
    private Square onSquare;
    private ChessBoard board;


    protected ChessPiece(ChessBoard board, ChessPiece.Color color)
    {
        this.board = board;
        this.color = color;
        onSquare = null;
    }
    protected ChessPiece(ChessBoard board, ChessPiece.Color color, char column, int row)
    {
        this.board = board; 
        setPosition(column,row);
    }
     public ChessPiece.Color color()
    {
        return this.color;
    }
    public ChessBoard board()
    {
        return board;
    }
    public String symbol()
    {
        return  (color == Color.white) ? "+" + letter : "-" + letter;
    }
    public Square position()
    {
		if (isOffBoard())
			throw new IllegalStateException();
		return onSquare;
    }
    public void setPosition(Square square)
    {
		if (square == null)
			throw new NullPointerException();
		onSquare = square;		
    }
    public void setPosition(char column, int row)
    {
		onSquare = new Square(column,row);		
    }
    public boolean isOffBoard()
    {
	return onSquare == null;
    }
    public void setOffBoard()
    {
	onSquare = null;
    }
    @Override
    public String toString()
    {
	return symbol();
    }
      public abstract char letter();
      
    
}