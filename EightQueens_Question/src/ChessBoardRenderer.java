public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		if((square/8)%2!=0)
		{
			if(square%2==0)
				return true;
		}
		else if((square/8)%2==0)
		{
			if(square%2!=0)
				return true;
		}
		System.out.println(square);
		return false;
	}
}
