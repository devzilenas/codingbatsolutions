package codingbat.string2;

public class XYZThere
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Return true if the given string contains an appearance
	 * of "xyz" where the xyz is not directly preceeded 
	 * by a period (.). So "xxyz" counts but "x.xyz" does not.
	 *
	 * xyzThere("abcxyz") → true
	 * xyzThere("abc.xyz") → false
	 * xyzThere("xyz.abc") → true
	 */
	public boolean xyzThere(String str) 
	{
		boolean contains = false;
		for (int i = 0; !contains && i < str.length() - "xyz".length() + 1; i++)
		{
			if ("xyz".equals(str.substring(i, i + "xyz".length())) && (i > 0 && '.' != str.charAt(i-1) || i == 0) ) 
			{
				contains = true;
			}
		}  
		return contains;
	}
}
