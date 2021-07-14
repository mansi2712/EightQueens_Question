public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		

		return cellId%8;
//		return 0;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		
		return cellId/8;
//		return 0;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................

		*/
		if(placedQueens[row][col]==true){
			return false;
		}
		else
		{
			//if already in row or column
			for(int i=0;i<8;i++)
			{
				if(placedQueens[row][i] || placedQueens[i][col])
					return false;
			}
			//in diagnols
			for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
			{
				if(placedQueens[i][j])
					return false;
			}
			for(int i=row-1,j=col+1;i>=0 && j<8;i--,j++)
			{
				if(placedQueens[i][j])
					return false;
			}
			for(int i=row+1,j=col-1;i<8 && j>=0;i++,j--)
			{
				if(placedQueens[i][j])
					return false;
			}
			for(int i=row+1,j=col+1;i<8 && j<8;i++,j++)
			{
				if(placedQueens[i][j])
					return false;
			}
			
		}
		//if false not returned from any condition
		placedQueens[row][col]=true;
		numQueens++;
		return isValid;
	}
}














