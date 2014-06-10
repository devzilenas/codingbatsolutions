package codingbat.recursion1;

public class Count7
{
	public static void main(String[] args) 
	{
	}

	/** 
	 * Given a non-negative int n, return the count
	 * of the occurrences of 7 as a digit, 
	 * so for example 717 yields 2. (no loops).
	 * Note that mod (%) by 10 yields the rightmost digit
	 * (126 % 10 is 6), while divide (/) by 10 removes 
	 * the rightmost digit (126 / 10 is 12).
	 *
	 * count7(717) → 2
	 * count7(7) → 1
	 * count7(123) → 03
	 */
	public int count7(int n) 
	{
		int c = 0;
		if (7 > n)
		{
			return 0;
		}
		else
		{
			if ( 7 == n % 10)
			{
				c = 1;
			}
			else
			{
				c = 0;
			}
		}
		return c + count7(n / 10);  
	}
}
