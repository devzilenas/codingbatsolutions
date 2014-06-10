package codingbat.logic1;

public class BlueTicket
{
	public static void main(String[] args) 
	{
	}

	/**
	 * You have a blue lottery ticket, with ints a, b, and c on it.
	 * This makes three pairs, which we'll call ab, bc, and ac.
	 * Consider the sum of the numbers in each pair.
	 * If any pair sums to exactly 10, the result is 10.
	 * Otherwise if the ab sum is exactly 10 more 
	 * than either bc or ac sums, the result is 5.
	 * Otherwise the result is 0.
	 *
	 * blueTicket(9, 1, 0) → 10
	 * blueTicket(9, 2, 0) → 0
	 * blueTicket(6, 1, 4) → 10
	 */
	public int blueTicket(int a, int b, int c) 
	{
		int sumab = a + b;
		int sumbc = b + c;
		int sumac = a + c;
		int result = 0;
		
		if (10 == sumab || 10 == sumbc || 10 == sumac)
		{
			result = 10;
		}  
		else if (10 <= sumab - sumbc || 10 <= sumab - sumac)
		{
			result = 5;
		}
		else 
		{
			result = 0;
		}
		return result;
	}
}
