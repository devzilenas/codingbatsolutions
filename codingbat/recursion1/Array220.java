package codingbat.recursion1;

public class Array220
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, compute recursively if the array 
	 * contains somewhere a value followed in the array by that
	 * value times 10. We'll use the convention of considering
	 * only the part of the array that begins at the given index.
	 * In this way, a recursive call can pass index+1 to move down
	 * the array. The initial call will pass in index as 0.
	 *
	 * array220({1, 2, 20}, 0) → true
	 * array220({3, 30}, 0) → true
	 * array220({3}, 0) → false
	 */
	public boolean array220(int[] nums, int index)
	{
		boolean c = false;
		if (index + 2 <= nums.length)
		{
			if (nums[index+1] == 10*nums[index])
			{            
				c = true;
			}
			else
			{
				c = false;
			}
			return c || array220(nums, index+1);
		}
		else
		{
			return false;
		}
	}
}
