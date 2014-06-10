package codingbat.string2;

public class XYZMiddle
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, does "xyz" appear in the middle
	 * of the string? To define middle,
	 * we'll say that the number of chars to the left and right
	 * of the "xyz" must differ by at most one.
	 * This problem is harder than it looks.
	 *
	 * xyzMiddle("AAxyzBB") → true
	 * xyzMiddle("AxyzBB") → true
	 * xyzMiddle("AxyzBBB") → false
	 */
	public boolean xyzMiddle(String str) 
	{
		int middle = str.length() / 2;
		int left  = 0;
		int right = 0;
		boolean ret = false;
		
		if ( 0 < str.length() ) {
		if ('z' == str.charAt(middle)
		 && middle > 1
		 && "xyz".equals(str.substring(middle - 2, middle + 1)))
		{          
			ret = Math.abs(str.substring(0, middle - 2).length() - str.substring(middle+1).length()) <= 1;
		}
		else if ('y' == str.charAt(middle)
		&& middle > 0
		&& middle + 1 <= str.length() - 1
		&& "xyz".equals(str.substring(middle - 1, middle + 2)))
		{
			ret = Math.abs(str.substring(0, middle - 1).length() - str.substring(middle + 2).length()) <= 1;
		}
		else if ('x' == str.charAt(middle)
		&& middle + 2 <= str.length() - 1
		&& "xyz".equals(str.substring(middle, middle + 3)))
		{
			ret = Math.abs(str.substring(0, middle).length() - str.substring(middle + 3).length()) <= 1;
		}
		}
			
		return ret;
	}
}
