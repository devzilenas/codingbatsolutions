package codingbat.array3;

public class SeriesUp
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given n>=0, create an array 
	 * with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
	 * (spaces added to show the grouping). 
	 * Note that the length of the array will be 1 + 2 + 3 ... + n,
	 * which is known to sum to exactly n*(n + 1)/2.
	 *
	 * seriesUp(3) → {1, 1, 2, 1, 2, 3}
	 * seriesUp(4) → {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}
	 * seriesUp(2) → {1, 1, 2} 
	 */
	public int[] seriesUp(int n) 
	{
	   int i   = 1;
	   int e   = 0;
	   int l   = n*(n+1)/2;
	   int[] s = new int[l];
	   int sum = 0;
	   while (e < l)
	   {
		   sum = 0;
		   for (int j = 1; j <= i; j++)
		   {
			   sum  = sum + j;
			   s[e] = j; 
			   e++;
		   }
		   i++;
	   }
	   return s;
	}
}
