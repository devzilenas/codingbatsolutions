package codingbat.array2;

public class TwoTwo
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, return true if every 2 that
	 * appears in the array is next to another 2.
	 *
	 * twoTwo({4, 2, 2, 3}) → true
	 * twoTwo({2, 2, 4}) → true
	 * twoTwo({2, 2, 4, 2}) → false
	 */
	public boolean twoTwo(int[] nums) 
	{
		boolean twoTwo = true;
		for (int i = 0; i < nums.length; i++)
		{   
			if (2 == nums[i])
			{
				if (i > 0 && 2 == nums[i - 1] || nums.length > i+1 && 2 == nums[i+1])
				{   
					twoTwo = true;   
					i++;                
				} 
				else
				{
					twoTwo = false;
					break;
				}          
			}
		}  
		
		return twoTwo;
	}
}
