package codingbat.logic1;

public class SortaSum
{
	public static void main(String[] args) 
	{ 
	}

	/**
	 * Given 2 ints, a and b, return their sum.
	 * However, sums in the range 10..19 inclusive, 
	 * are forbidden, so in that case just return 20.
	 *
	 * sortaSum(3, 4) → 7
	 * sortaSum(9, 4) → 20
	 * sortaSum(10, 11) → 21
	 */
	public int sortaSum(int a, int b)
	{
		int sum = a+b;
		return 10 <= sum && 19 >= sum ? 20 : sum;
	}
} 
