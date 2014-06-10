package codingbat.array1;

public class Double23
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an int array, return true if the array 
	 * contains 2 twice, or 3 twice.
	 * The array will be length 0, 1, or 2.
	 *
	 * double23({2, 2}) → true
	 * double23({3, 3}) → true
	 * double23({2, 3}) → false
	 */
	public boolean double23(int[] nums)
	{
		int c2 = ( (1 <= nums.length && 2 == nums[0]) ? 1 : 0)
		 + ((2 <= nums.length && 2 == nums[1]) ? 1 : 0)
		  + ((3 <= nums.length && 2 == nums[2]) ? 1 : 0);
		  
		int c3 = (1 <= nums.length && 3 == nums[0] ? 1 : 0)
		 + (2 <= nums.length && 3 == nums[1] ? 1 : 0)
		  + (3 <= nums.length && 3 == nums[2] ? 1 : 0);
		return c2 == 2 || c3 == 2;
	}
}
