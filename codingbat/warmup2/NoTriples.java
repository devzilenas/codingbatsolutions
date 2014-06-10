package codingbat.warmup2;

public class NoTriples
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of ints, we'll say that a triple is a value
	 * appearing 3 times in a row in the array.
	 * Return true if the array does not contain any triples.
	 *
	 * noTriples({1, 1, 2, 2, 1}) → true
	 * noTriples({1, 1, 2, 2, 2, 1}) → false
	 * noTriples({1, 1, 1, 2, 2, 2, 1}) → false
	 */
	public boolean noTriples(int[] nums)
	{
		boolean contains = false;
		
		for (int i = 0; i + 2 < nums.length && !contains; i++) 
		{
			if (nums[i] == nums[i+1] && nums[i] == nums[i+2])
			{
				contains = true;
			}
		}  
		return !contains;
	}
}
