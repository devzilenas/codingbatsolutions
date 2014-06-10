package codingbat.recursion1;

public class StrCopies
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string and a non-empty substring sub,
	 * compute recursively if at least n copies of sub appear
	 * in the string somewhere, possibly with overlapping.
	 * N will be non-negative.
	 *
	 * strCopies("catcowcat", "cat", 2) → true
	 * strCopies("catcowcat", "cow", 2) → false
	 * strCopies("catcowcat", "cow", 1) → true
	 */
	public boolean strCopies(String str, String sub, int n)
	{
		if (n <= 0)
		{
			return true;
		}
		else if ((0 == str.length() || sub.length() > str.length()) && n > 0)
		{
			return false;
		}
		else
		{
			if (str.startsWith(sub))
			{
				return strCopies(str.substring(1), sub, n - 1);
			}
			else
			{
				return strCopies(str.substring(1), sub, n);
			}
		}  
	}
}	
