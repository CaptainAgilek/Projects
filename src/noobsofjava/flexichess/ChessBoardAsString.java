/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noobsofjava.flexichess;

/**
 *
 * @author Uzivatel
 */
public class ChessBoardAsString {
    private int rows, columns;
    private ChessBoard board;
    public ChessBoardAsString( ChessBoard board )
    {
        rows = board.rows();
        columns = board.columns();
        this.board = board;
    }  
    public String get()
    {
        StringBuffer boardBuffer = new StringBuffer();
		if (rows == 0)
			return boardBuffer.toString();
		boardBuffer.append(" ");
    for (int i=0; i<columns; i++)
	  boardBuffer.append("   " + i);
    boardBuffer.append(" " + "\n");
    for (int i=0; i < rows*2+1; i++)
		{
			if (i == 0)
			{
				boardBuffer.append("  ");
				for(int j=0; j< columns*4+1; j++)
				{
					if (j == 0)
						boardBuffer.append("\u250C");
					else if (j == columns*4)
						boardBuffer.append("\u2510" + "\n");
					else if (j % 4 == 0 )
						boardBuffer.append("\u252C"); 
					else 
						boardBuffer.append("\u2500");
				}
			}
			else if (i == rows*2)
			{
				boardBuffer.append("  ");
			  for(int j=0; j< columns*4+1; j++)
			  {
					if (j == 0)
						boardBuffer.append("\u2514");
					else if (j == columns*4)
						boardBuffer.append("\u2518");
					else if (j % 4 == 0 )
						boardBuffer.append("\u2534"); 
					else 
						boardBuffer.append("\u2500");
				}
			}
			else if (i % 2 == 1)
			{
				boardBuffer.append((i/2) + " ");
				for(int j=0; j< columns*4+1; j++)
				{
					if (j == columns*4)
						boardBuffer.append("\u2502" + "\n");
					else if (j % 4 == 0)
						boardBuffer.append("\u2502");
					else
		    	{ 
		   			if ((j-2) % 4 != 0)
				 			boardBuffer.append(" ");
		        else
		        {
		        	if (board.squareAt(i/2,(j-2)/4).isEmpty())
		        		boardBuffer.append(" ");
		        	else
		          	boardBuffer.append(board.squareAt(i/2, (j-2)/4).piece());
		      	}
					}
		  	}
			}
			else
			{
				boardBuffer.append("  ");
				for(int j=0; j< columns*4+1; j++)
				{
					if (j == 0)
						boardBuffer.append("\u251C");
			 		else if (j == columns*4)
				 		boardBuffer.append("\u2524" + "\n");
			 		else if (j % 4 == 0 )
					 	boardBuffer.append("\u253C"); 
			 		else 
				 		boardBuffer.append("\u2500");
				}
			}
		}
    return boardBuffer.toString();
    }
    
}
