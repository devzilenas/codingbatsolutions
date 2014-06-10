package codingbat.recursion1;

public class EndX
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, compute recursively a new string where
	 * all the lowercase 'x' chars have been moved
	 * to the end of the string.
	 *
	 * endX("xxre") → "rexx"
	 * endX("xxhixx") → "hixxxx"
	 * endX("xhixhix") → "hihixxx"
	 */
	public String endX(String str)
	{
		if (0 == str.length())
		{
			return "";
		}
		else
		{
			if ('x' == str.charAt(0))
			{
				return endX(str.substring(1)) + 'x';
			}
			else
			{
				return str.charAt(0) + endX(str.substring(1));
			}
		}   
	}
}

