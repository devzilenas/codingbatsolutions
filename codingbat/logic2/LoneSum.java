package codingbat.logic2;

public class LoneSum
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given 3 int values, a b c, return their sum.
	 * However, if one of the values is the same as another
	 * of the values, it does not count towards the sum.
	 *
	 * loneSum(1, 2, 3) → 6
	 * loneSum(3, 2, 3) → 2
	 * loneSum(3, 3, 3) → 0
	 */
	public int loneSum(int a, int b, int c)
	{
		int incla = a == b || a == c ? 0 : a;
		int inclb = b == a || b == c ? 0 : b;
		int inclc = c == a || c == b ? 0 : c;
		
		return incla + inclb + inclc;
	}
}
