package codingbat.array3;

public class SquareUp
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given n>=0, create an array length n*n with the following 
	 * pattern, shown here for
	 * n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1}
	 * (spaces added to show the 3 groups).
	 *
	 * squareUp(3) → {0, 0, 1, 0, 2, 1, 3, 2, 1}
	 * squareUp(2) → {0, 1, 2, 1}
	 * squareUp(4) → {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}
	 */
	public int[] squareUp(int n)
	{
		int[] sq = new int[n*n];
		
		
		for (int j = 1; j <= n; j++)
		{
			for (int m = j*n - j; m < n*n; m += n)
			{
				sq[m] = j;
			}
		}

		return sq;
	}
}	
