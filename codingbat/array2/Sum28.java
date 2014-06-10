package codingbat.array2;

public class Sum28
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
	 *
	 * sum28({2, 3, 2, 2, 4, 2}) → true
	 * sum28({2, 3, 2, 2, 4, 2, 2}) → false
	 * sum28({1, 2, 3, 4}) → false
	 */
	public boolean sum28(int[] nums) 
	{
		int sum = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if (2 == nums[i])
			{
				sum = sum + 2;
			}
			if (sum > 8) 
			{
				break;
			}
		}      
		
		return 8 == sum;
	}
}
