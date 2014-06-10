package codingbat.array3;

public class CanBalance
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a non-empty array, return true if there
	 * is a place to split the array so that the sum of the numbers
	 * on one side is equal to the sum of the numbers 
	 * on the other side.  
	 *
	 * canBalance({1, 1, 1, 2, 1}) → true
	 * canBalance({2, 1, 1, 2, 1}) → false
	 * canBalance({10, 10}) → true
	 */
	public boolean canBalance(int[] nums)
	{
		int l = 0;
		int r = 0;
		boolean can = false;
		for (int m = 1; m <= nums.length - 1; m++)
		{
			l = 0;
			r = 0;
			for (int j = 0; j < nums.length; j++)
			{
				if (j < m)
				{
					l += nums[j];
					
				}
				else
				{
					r += nums[j];
				}       
			}
			if (l == r)
			{
				can = true;
				break;
			}
		}  
		return can;
	}
}
