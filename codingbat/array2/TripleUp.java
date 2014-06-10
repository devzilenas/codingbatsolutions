package codingbat.array2;

public class TripleUp
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Return true if the array contains, somewhere, 
	 * three increasing adjacent numbers 
	 * like .... 4, 5, 6, ... or 23, 24, 25.
	 *
	 * tripleUp({1, 4, 5, 6, 2}) → true
	 * tripleUp({1, 2, 3}) → true
	 * tripleUp({1, 2, 4}) → false
	 */
	public boolean tripleUp(int[] nums)
	{
		boolean triple = false;
		for (int i = 0; !triple && i < nums.length - 2; i++) 
		{
			if (nums[i] < nums[i+1] && nums[i+1] < nums[i+2] && 1 == nums[i+1] - nums[i] && 2 == nums[i+2] - nums[i])
			{
				triple = true;
				break;
			}
		}  
		
		return triple;
	} 
}
