package codingbat.warmup2;

public class ArrayFront9
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, return true if one 
	 * of the first 4 elements in the array is a 9.
	 * The array length may be less than 4.
	 *
	 * arrayFront9({1, 2, 9, 3, 4}) → true
	 * arrayFront9({1, 2, 3, 4, 9}) → false
	 * arrayFront9({1, 2, 3, 4, 5}) → false
	 */
	public boolean arrayFront9(int[] nums)
	{
		boolean f4 = false;
			for (int i = 0; i < nums.length && i < 4 ; i++)
			{
				if (9 == nums[i])
				{
					f4 = true;
					break;
				}
			}  
		
		return f4;
	}
}
