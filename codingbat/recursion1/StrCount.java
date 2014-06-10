package codingbat.recursion1;

public class StrCount
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string and a non-empty substring sub,
	 * compute recursively the number of times that sub 
	 * appears in the string, without the sub strings overlapping.
	 *
	 * strCount("catcowcat", "cat") → 2
	 * strCount("catcowcat", "cow") → 1
	 * strCount("catcowcat", "dog") → 0
	 */
	public int strCount(String str, String sub)
	{ 
		if (0 == str.length() || sub.length() > str.length())
		{
			return 0;
		}
		else
		{
			if (str.startsWith(sub))
			{
				return 1 + strCount(str.substring(sub.length()), sub);
			}
			else
			{
				return strCount(str.substring(1), sub);
			}
		}  
	} 
}
