package codingbat.recursion1;

public class StringClean
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return recursively a "cleaned" string 
	 * where adjacent chars that are the same have been reduced
	 * to a single char. So "yyzzza" yields "yza".
	 *
	 * stringClean("yyzzza") → "yza"
	 * stringClean("abbbcdd") → "abcd"
	 * stringClean("Hello") → "Helo"
	 */
	public String stringClean(String str)
	{
		if (0 == str.length())
		{
			return "";
		}  
		else
		{
			if (1 < str.length() && str.charAt(0) == str.charAt(1))
			{
				return stringClean(str.substring(1));
			}
			else
			{
				return str.charAt(0) + stringClean(str.substring(1));
			}
		}
	}
}
