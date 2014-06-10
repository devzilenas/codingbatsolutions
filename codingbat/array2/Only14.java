package codingbat.array2;

public class Only14
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, return true if every element is a 1 or a 4.
	 * only14({1, 4, 1, 4}) → true
	 * only14({1, 4, 2, 4}) → false
	 * only14({1, 1}) → true
	 */
	public boolean only14(int[] nums)
	{
		boolean o14 = true;
		
		for (int i = 0; i < nums.length ; i++)
		{
			if (1 != nums[i] && 4 != nums[i])
			{
				o14 = false;
				break;
			}
		}
		
		return o14;
	}
}
