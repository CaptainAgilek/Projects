package noobsofjava.flexichess;

/**
 *
 * @author honza
 */
public class Square {
	public final char column;
	public final int row;
	private ChessPiece pieceOn;
	public Square (char column, int row)
	{
		this.column = column;
		this.row = row;
	}
	public Square(String str)
	{
	  this.column = str.charAt(0);
	  this.row = Integer.parseInt(str.substring(1));
	}
  @Override
  public int hashCode() {
	int hash = 7;
	hash = 11 * hash + this.column;
	hash = 11 * hash + this.row;
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
	final Square other = (Square) obj;
	if (this.column != other.column) {
	  return false;
	}
	if (this.row != other.row) {
	  return false;
	}
	return true;
  }
        @Override
  public String toString()
  {
	return String.format("%c%d", row, column);
  }
}