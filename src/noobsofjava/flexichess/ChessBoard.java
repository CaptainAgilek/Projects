package noobsofjava.flexichess;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ChessBoard 
{
  private int rows, columns;
  private ChessPiece[][] board; 
  private Stack<ChessPiece> capturedPiecesStack = new Stack<ChessPiece>();
  public ChessBoard(int columns, int rows)
  {
		board = new ChessPiece[rows][columns];
		
		this.rows = rows;
		this.columns = columns;
  }
  public int rows()
  {
		return rows;
  }
  public int columns()
  {
		return columns;
  }
  public void putPiece(char column, int row, ChessPiece piece)
  {
		if (this.isEmptyAt(column, row))
			throw new IllegalStateException();
		board[rows-row][column-97] = piece;
  }
  public ChessPiece pieceAt(char column, int row)
  {
		if (this.isEmptyAt(column, row))
			throw new IllegalStateException();
		return board[rows-row][column-97];
  }
  public ChessPiece emptySquare(char column, int row)
  {
        if (this.isEmptyAt(column, row))
	  throw new IllegalStateException();
        ChessPiece cleared = board[rows-row][column-97];
        board[rows-row][column-97].setOffBoard();
	board[rows-row][column-97] = null;
	return cleared;
  }
public boolean isEmptyAt(char column, int row)
{
  return (board[rows-row][column-97] == null) ? true : false;

}
public ChessPiece capturePieceAt(char column, int row)
{
    return capturedPiecesStack.push(emptySquare(column, row)); 
}
public void returnLastCapturedTo(char column, int row)
{
    board[column][row] =  capturedPiecesStack.pop();
}
public List<ChessPiece> capturedPieces()
{
    return new ArrayList<ChessPiece>(capturedPiecesStack);
}
public List<ChessPiece> capturedPieces(ChessPiece.Color color)
{
    List<ChessPiece> capturedColor = new ArrayList<ChessPiece>();
   for (int i = 0; i < capturedPiecesStack.size(); i++) {
      // if(capturedPiecesStack.)
    }
    return new ArrayList<ChessPiece>(capturedColor);
}
@Override
  public String toString()
  {
		ChessBoardAsString string = new ChessBoardAsString(this);
		return string.toString();
  }
}