package codingbat.array1;

public class MaxTriple
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints of odd length, look at the first,
	 * last, and middle values in the array and return the largest.
	 * The array length will be a least 1.
	 *
	 * maxTriple({1, 2, 3}) → 3
	 * maxTriple({1, 5, 3}) → 5
	 * maxTriple({5, 2, 3}) → 5
	 */
	public int maxTriple(int[] nums)
	{
		int middle = nums[nums.length / 2];
		int first  = nums[0];
		int last   = nums[nums.length - 1];
		int max    = first >= middle ? first : middle;
		
		return max >= last ? max : last;
	}
}
