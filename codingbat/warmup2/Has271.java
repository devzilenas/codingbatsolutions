package codingbat.warmup2;

public class Has271
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, return true if
	 * it contains a 2, 7, 1 pattern -- a value,
	 * followed by the value plus 5, followed by the value minus 1.
	 * Additionally the 271 counts even if the "1" differs
	 * by 2 or less from the correct value.
	 *
	 * has271({1, 2, 7, 1}) → true
	 * has271({1, 2, 8, 1}) → false
	 * has271({2, 7, 1}) → true
	 */
	public boolean has271(int[] nums)
	{
		boolean contains = false;
		
		int value = 0;
		for (int i = 0 ; nums.length > i+2; i++)
		{
			value = nums[i];
			if (value + 5 == nums[i+1] && Math.abs(value - 1 - nums[i+2]) <= 2 ) 
			{
				contains = true;
			}
		}  
		return contains;
	}
}
