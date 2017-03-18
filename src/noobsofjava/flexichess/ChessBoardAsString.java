/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noobsofjava.flexichess;

public class ChessBoardAsString {
	ChessBoard board;
  public ChessBoardAsString (ChessBoard board) 
	{
	  this.board = board;
	}
   @Override
	public String toString()
	{
		StringBuffer buffer = new StringBuffer(); // String pro předání
    int row = board.rows(); // řádky
    int col = board.columns();  // sloupce
    buffer.append("   ");
    buffer.append("┌"); // první řádek tabulky
    for (int j = 0; j < col; j++) {
      if (j != col - 1) {
        buffer.append("───┬");
      } 
			else {
        buffer.append("───┐\n");
      }
    }
    for (int i = 0; i < row; i++) { // začátek prostředku
      buffer.append(String.format("%2d ", row-i));
      for (int j = 0; j < col; j++) { // prostřední chlívky 
        if (j != col - 1) {
          buffer.append(!board.isEmptyAt((char)(j+97), row-i) ? String.format("│%s ", board.pieceAt((char)(j+97), row-i).symbol()) : "│   "); // podmínka zkouší zda na určeném místě je nula pokud ano nic nepíše, v opačném případě zapíše číslo
				}
				else {
          buffer.append(!board.isEmptyAt((char)(j+97), row-i) ? String.format("│%s │\n", board.pieceAt((char)(j+97), row-i).symbol()) : "│   │\n");
        }
      }
      if (i != row - 1) { // kontoluje zda je koneec
        buffer.append("   ├");
      } 
			else {
				buffer.append("   └");
      }
      for (int j = 0; j < col; j++) {
        if (i != row - 1) { // kontoluje za je konec
					if (j != col - 1) {
            buffer.append("───┼");
          } 
					else {
            buffer.append("───┤\n");
          }
        }
				else if (j != col - 1) {
          buffer.append("───┴");
        } 
				else {
          buffer.append("───┘\n");
        }

      }
    }
		buffer.append("     ");
		for (int i = 0; i < col; i++) { //čísla sloupců
      if (i == col - 1) {
        buffer.append(String.format("%c ", (char)('a'+i)));
      }
			else {
				buffer.append(String.format("%c   ", (char)('a'+i)));
      }
		}
             buffer.append("\nW+:"); 
             for(int i = 0; i < board.capturedPieces(ChessPiece.Color.WHITE).size();i++)
                 buffer.append(" "+board.capturedPieces(ChessPiece.Color.WHITE).get(i).letter());
             buffer.append("\nB-:"); 
             for(int i = 0; i < board.capturedPieces(ChessPiece.Color.BLACK).size();i++)
                 buffer.append(" "+board.capturedPieces(ChessPiece.Color.BLACK).get(i).letter());
    return buffer.toString();
	}
}