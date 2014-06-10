package codingbat.array2;

public class Has12
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, return true if there is a 1 
	 * in the array with a 2 somewhere later in the array.
	 *
	 * has12({1, 3, 2}) → true
	 * has12({3, 1, 2}) → true
	 * has12({3, 1, 4, 5, 2}) → true
	 */
	public boolean has12(int[] nums) 
	{
		boolean h1 = false;
		boolean h12 = false;
		
		for (int i = 0; i < nums.length; i++)
		{
			if (1 == nums[i])
			{
				h1 = true;
			}
			
			if (h1 && 2 == nums[i])
			{
				h12 = true;
				break;
			}
		}  
		return h12;
	}
}
