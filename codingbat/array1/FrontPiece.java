package codingbat.array1;

public class FrontPiece
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an int array of any length,
	 * return a new array of its first 2 elements.
	 * If the array is smaller than length 2,
	 * use whatever elements are present.
	 *
	 * frontPiece({1, 2, 3}) → {1, 2}
	 * frontPiece({1, 2}) → {1, 2}
	 * frontPiece({1}) → {1}
	*/
	public int[] frontPiece(int[] nums)
	{ 
		int[] n = new int[2];
		if (2 <= nums.length) 
		{
			n[0] = nums[0];
			n[1] = nums[1];     
		}  
		return 1 >= nums.length ? nums : n;
	}
}
