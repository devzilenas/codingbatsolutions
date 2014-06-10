package codingbat.array1;

public class Unlucky1
{
	public static void main(String[] args) 
	{
	}

	/**
	 * We'll say that a 1 immediately followed by a 3 
	 * in an array is an "unlucky" 1.
	 * Return true if the given array contains
	 * an unlucky 1 in the first 2 or last 2 positions
	 * in the array.
	 *
	 * unlucky1({1, 3, 4, 5}) → true
	 * unlucky1({2, 1, 3, 4, 5}) → true
	 * unlucky1({1, 1, 1}) → false
	 */
	public boolean unlucky(int[] nums, int index)
	{
		return index + 1 < nums.length && 1 == nums[index] && 3 == nums[index+1];
	}
	public boolean unlucky1(int[] nums)
	{
		boolean unl = false;
		
		if (2 == nums.length)
		{
			unl = unlucky(nums, 0) || unlucky(nums,1);
		}
		if (3 == nums.length) 
		{
			unl = unlucky(nums, 0) || unlucky(nums, 1) || unlucky(nums, 1) || unlucky(nums,2) ;
		}
		else if (4 <= nums.length) 
		{
			unl = unlucky(nums, 0) || unlucky(nums, 1) || unlucky(nums, nums.length-2) || unlucky(nums, nums.length - 1);
		}
		
		return unl;
	}
}
