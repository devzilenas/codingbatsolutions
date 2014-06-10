package codingbat.array2;

public class Has77
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, return true if the array contains 
	 * two 7's next to each other, or there are two 7's
	 * separated by one element, such as with {7, 1, 7}.
	 *
	 * has77({1, 7, 7}) → true
	 * has77({1, 7, 1, 7}) → true
	 * has77({1, 7, 1, 1, 7}) → false
	 */
	public boolean has77(int[] nums) 
	{
		boolean has77 = false;
		
		for (int i = 0; !has77 && i <= nums.length - 2; i++)
		{
			if (7 == nums[i]) 
			{
				if (i+1 < nums.length && 7 == nums[i+1]
				|| i+2 < nums.length && 7 == nums[i+2])
				{
					has77 = true;
				}
			}
		}
		return has77;
	}
}
