package codingbat.array3;

public class Fix34
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Return an array that contains exactly the same numbers
	 * as the given array, but rearranged so that every 3
	 * is immediately followed by a 4. Do not move the 3's, 
	 * but every other number may move. 
	 * The array contains the same number of 3's and 4's,
	 * every 3 has a number after it that is not a 3 or 4,
	 * and a 3 appears in the array before any 4.
	 *
	 * fix34({1, 3, 1, 4}) → {1, 3, 4, 1}
	 * fix34({1, 3, 1, 4, 4, 3, 1}) → {1, 3, 4, 1, 1, 3, 4}
	 * fix34({3, 2, 2, 4}) → {3, 4, 2, 2}
	 */
	public int[] fix34(int[] nums)
	{
		int tmp = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if (3 == nums[i] && i + 1 < nums.length && 4 != nums[i+1])
			{
				for (int j = 0; j < nums.length; j++)
				{
					if (4 == nums[j] && j - 1 > 0 && 3 != nums[j-1])
					{
						tmp       = nums[i+1];
						nums[i+1] = nums[j];
						nums[j]   = tmp;
						break;
					}             
				}
			}
		}
		return nums;
	}
}
