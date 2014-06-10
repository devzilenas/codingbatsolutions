package codingbat.array3;

public class CountClumps
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Say that a "clump" in an array is a series of 2 
	 * or more adjacent elements of the same value.
	 * Return the number of clumps in the given array.
	 *
	 * countClumps({1, 2, 2, 3, 4, 4}) → 2
	 * countClumps({1, 1, 2, 1, 1}) → 2
	 * countClumps({1, 1, 1, 1, 1}) → 1
	 */
	public int countClumps(int[] nums) 
	{ 
		int clumps = 0;
		int cl     = 0;
		
		for (int i = 0; i < nums.length; i++)
		{
			if (i > 0 && nums[i] == nums[i-1])
			{
				cl = nums[i];
				clumps++;
				while (i < nums.length - 1 && cl == nums[i+1])
				{
					i++;
				}
			}
		}
		
		return clumps;
	}
}
