package codingbat.warmup2;

public class Array123
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints,
	 * return true if .. 1, 2, 3, .. appears in the array somewhere.
	 *
	 * array123({1, 1, 2, 3, 1}) → true
	 * array123({1, 1, 2, 4, 1}) → false
	 * array123({1, 1, 2, 1, 2, 3}) → true
	 */
	public boolean array123(int[] nums)
	{
		boolean a = false;
		if (3 <= nums.length)
		{
			for (int i = 0; i < nums.length && i+1 < nums.length && i+2 < nums.length && !a; i++)
			{
				a = nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3;
			}
		}
		return a;
	}
}
