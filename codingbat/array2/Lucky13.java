package codingbat.array2;

public class Lucky13
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, return true if the array contains no 1's and no 3's.
	 *
	 * lucky13({0, 2, 4}) → true
	 * lucky13({1, 2, 3}) → false
	 * lucky13({1, 2, 4}) → false
	 */
	public boolean lucky13(int[] nums) 
	{
		boolean got = false;
		for (int i = 0; i  < nums.length; i++) 
		{
			if (1 == nums[i] || 3 == nums[i])
			{
				got = true;
				break;
			}
		}
		
		return !got;  
	}
}
