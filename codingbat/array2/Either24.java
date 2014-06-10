package codingbat.array2;

public class Either24
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, return true if the array
	 * contains a 2 next to a 2 or a 4 next to a 4, but not both. 
	 *
	 * either24({1, 2, 2}) → true
	 * either24({4, 4, 1}) → true
	 * either24({4, 4, 1, 2, 2}) → false
	 */
	public boolean either24(int[] nums) 
	{
		boolean h22 = false;
		boolean h44 = false;
		
		for (int i = 0; i < nums.length - 1; i++)
		{
			if (2 == nums[i] && 2 == nums[i+1])
			{
				h22 = true;
			}
			if (4 == nums[i] && 4 == nums[i+1])
			{
				h44 = true;
			}       
			
		}  
		
		return h22 ^ h44;
	}
}
