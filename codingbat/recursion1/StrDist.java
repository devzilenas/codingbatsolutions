package codingbat.recursion1;

public class StrDist
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string and a non-empty substring sub,
	 * compute recursively the largest substring which
	 * starts and ends with sub and return its length.
	 *
	 * strDist("catcowcat", "cat") → 9
	 * strDist("catcowcat", "cow") → 3
	 * strDist("cccatcowcatxx", "cat") → 9
	 *
	 */
	public int strDist(String str, String sub) 
	{
		if (0 == str.length())
		{
			return 0;
		}
		else if (!str.startsWith(sub))
		{
			//chop from left
			return strDist(str.substring(1), sub);    
		}
		else if (!str.endsWith(sub))
		{
			//chop from right
			return strDist(str.substring(0, str.length() - 1), sub);
		}
		else if (str.startsWith(sub) && str.endsWith(sub))
		{
			//got a substring subXXXsub
			return str.length();
		}
		return 0;
	}
}
