package codingbat.logic1;

public class MaxMod5
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given two int values, return whichever value is larger.
	 * However if the two values have 
	 * the same remainder when divided by 5,
	 * then the return the smaller value.
	 * However, in all cases, if the two values are the same,
	 * return 0. Note: the % "mod" operator computes the remainder,
	 * e.g. 7 % 5 is 2.
	 *
	 * maxMod5(2, 3) → 3
	 * maxMod5(6, 2) → 6
	 * maxMod5(3, 2) → 3
	 */
	public int maxMod5(int a, int b)
	{
		int ret = 0;
		if (a == b)
		{
			ret = 0;
		}
		else if (a % 5 == b % 5)
		{
			ret = a <= b ? a : b;
		}
		else
		{
			ret = a <= b ? b : a;
		}    
		return ret;
	}
}
