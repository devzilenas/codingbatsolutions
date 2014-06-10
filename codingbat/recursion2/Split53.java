package codingbat.recursion2;

public class Split53
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, is it possible to divide 
	 * the ints into two groups, so that the sum of the two groups
	 * is the same, with these constraints: all the values
	 * that are multiple of 5 must be in one group, 
	 * and all the values that are a multiple of 3 
	 * (and not a multiple of 5) must be in the other. 
	 * (No loops needed.)
	 *
	 * split53({1,1}) → true
	 * split53({1, 1, 1}) → false
	 * split53({2, 4, 2}) → true
	 */

	// g= -1 if first group ,
	//     0 if not known   ,
	//     1 if second group.
	public boolean take(int start, int[] nums, int sum1, int sum2, int g5, int g3)
	{
		if (start >= nums.length)
		{
			return sum1 == sum2;
		}
			
		if (0 == nums[start] % 5)    
		{
			if (0 == g5)
			{
				if (0 != g3)
				{
					g5 = -1 * g3;
				}
				else
				{
					g5 = -1;
					g3 =  1;
				}           
			}        
		 
			if (-1 == g5)
			{
				if (take(start+1, nums, sum1+nums[start], sum2, g5, g3))
				{
					return true;
				}
			}
			else if (1 == g5)
			{
				if (take(start+1, nums, sum1, sum2 + nums[start], g5, g3))
				{
					return true;
				}          
			}
		} 
		else if (0 == nums[start] % 3)
		{
			if (0 == g3)
			{
				if (0 != g5)
				{
					g3 = -1 * g5;
				}
				else
				{
					g3 = -1;
					g5 =  1;          
				}           
			}
			
			if (-1 == g3)
			{
				if (take(start+1, nums, sum1+nums[start], sum2, g5, g3))
				{
					return true;
				}
			}
			else if (1 == g3)
			{
				if (take(start+1, nums, sum1, sum2 + nums[start], g5, g3))
				{
					return true;
				}        
			}
		}
		else
		{
		
			if (take(start+1, nums, sum1 + nums[start], sum2, g5, g3))
			{
				return true;
			}
		
			if (take(start+1, nums, sum1, sum2 + nums[start], g5, g3))
			{
				return true;
			}
		}
		
		return false;
	}

	public boolean split53(int[] nums) 
	{
		return take(0, nums, 0, 0, 0, 0);
	}
}
