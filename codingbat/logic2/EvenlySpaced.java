package codingbat.logic2;

public class EvenlySpaced
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given three ints, a b c, one of them is small, 
	 * one is medium and one is large.
	 * Return true if the three values are evenly spaced,
	 * so the difference between small and medium is the same 
	 * as the difference between medium and large.
	 *
	 * evenlySpaced(2, 4, 6) → true
	 * evenlySpaced(4, 6, 2) → true
	 * evenlySpaced(4, 6, 3) → false
	 */
	public int min(int a, int b) 
	{
		return a <= b ? a : b;
	}
	public int max(int a, int b)
	{
		return a >= b ? a : b;
	}
	public boolean evenlySpaced(int a, int b, int c)
	{
		int small  = min(min(a,b), c);
		int large  = max(max(a,b), c);		
		int medium = max(min(a,b), min(max(a,b),c));
		return medium - small == large - medium;
	}
}
