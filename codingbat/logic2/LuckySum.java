package codingbat.logic2;

public class LuckySum
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given 3 int values, a b c, return their sum.
	 * However, if one of the values is 13 then it does not count
	 * towards the sum and values to its right do not count.
	 * So for example, if b is 13, then both b and c do not count.  
	 * luckySum(1, 2, 3) → 6
	 * luckySum(1, 2, 13) → 3
	 * luckySum(1, 13, 3) → 1
	 */
	public int luckySum(int a, int b, int c)
	{
		int incla = a == 13 ? 0 : a;
		int inclb = a == 13 || b == 13 ? 0 : b;
		int inclc = a == 13 || b == 13 || c == 13 ? 0 : c;
		
		return incla + inclb + inclc;  
	}
}
