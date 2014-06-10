package codingbat.string3;

public class EqualIsNot
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return true if the number of appearances 
	 * of "is" anywhere in the string is equal to the number
	 * of appearances of "not" anywhere
	 * in the string (case sensitive).
	 *
	 * equalIsNot("This is not") → false
	 * equalIsNot("This is notnot") → true
	 * equalIsNot("noisxxnotyynotxisi") → true
	 */
	public boolean equalIsNot(String str)
	{
		int countis  = 0;
		int countnot = 0;
		final String is    = "is";
		final String not   = "not";
		int i = 0;

		while (-1 != str.substring(i).indexOf(is))
		{
			i += str.substring(i).indexOf(is) + is.length();
			countis++;
		}
		
		i = 0;
		while (-1 != str.substring(i).indexOf(not)) 
		{ 
		   i += str.substring(i).indexOf(not) + not.length();
		   countnot++;
		}
		
		return countis == countnot;  
	}
}
