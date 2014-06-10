package codingbat.string2;

public class StarOut
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Return a version of the given string,
	 * where for every star (*) in the string the star
	 * and the chars immediately to its left and right are gone.
	 * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
	 *
	 * starOut("ab*cd") → "ad"
	 * starOut("ab**cd") → "ad"
	 * starOut("sm*eilly") → "silly"
	 */
	public String starOut(String str)
	{
		String ret = "";
		for (int i = 0; i < str.length(); i++)
		{        
			if (!( '*' == str.charAt(i) 
			|| i + 1 < str.length() && '*' == str.charAt(i+1)
			|| i > 0 && '*' == str.charAt(i-1) ))
			{
				ret = ret + str.charAt(i);
			}        
		}
		return ret;
	}
}
