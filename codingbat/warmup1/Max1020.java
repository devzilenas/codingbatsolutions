package codingbat.warmup1;

public class Max1020
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given 2 positive int values,
	 * return the larger value that is in the range 10..20 inclusive,
	 * or return 0 if neither is in that range.
	 *
	 * max1020(11, 19) → 19
	 * max1020(19, 11) → 19
	 * max1020(11, 9) → 11
	 */
	public boolean in(int a, int l, int r)
	{
		return a >= l && a <= r;
	}
	public int max(int a, int b) 
	{
		return a >= b ? a : b;
	}
	public int max1020(int a, int b)
	{
		int v1 = in(a, 10, 20) ? a : 0;
		int v2 = in(b, 10, 20) ? b : 0;
		
		return max(v1,v2);
	}
}
