package codingbat.array2;

public class More14
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, return true if the number of 1's is greater than the number of 4's.
	 *
	 * more14({1, 4, 1}) → true
	 * more14({1, 4, 1, 4}) → false
	 * more14({1, 1}) → true
	 */
	public boolean more14(int[] nums)
	{
		int num1 = 0;
		int num4 = 0;
		
		for (int i = 0; i < nums.length; i++)
		{
			if (1 == nums[i])
			{
				num1++;
			}
			else if (4 == nums[i])
			{
				num4++;
			}
		}  
		
		return num1 > num4;
	}
}
