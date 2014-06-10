package codingbat.array2;

public class No14
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, return true if it contains no 1's or it contains no 4's.
	 *
	 * no14({1, 2, 3}) → true
	 * no14({1, 2, 3, 4}) → false
	 * no14({2, 3, 4}) → true
	 */
	public boolean no14(int[] nums) 
	{
		boolean h1 = false;
		boolean h4 = false;
		
		for (int i = 0; i < nums.length ; i++)
		{
			if (1 == nums[i])
			{
				h1 = true;
			}
			else if (4 == nums[i])
			{
				h4 = true;
			}
		}
		
		return !h1 || !h4;  
	}
}
