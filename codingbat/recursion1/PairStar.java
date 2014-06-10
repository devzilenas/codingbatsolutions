package codingbat.recursion1;

public class PairStar
{
	public static void main(String[] args) 
	{
	}

	/** 
	 * Given a string, compute recursively a new string where
	 * identical chars that are adjacent in the original string
	 * are separated from each other by a "*".
	 *
	 * pairStar("hello") → "hel*lo"
	 * pairStar("xxyy") → "x*xy*y"
	 * pairStar("aaaa") → "a*a*a*a"
	 */
	public String pairStar(String str)
	{
		if (0 == str.length())
		{
			return "";
		}
		else if (1 == str.length())
		{
			return str.substring(0,1);
		}    
		else
		{
			if (2 <= str.length() && str.charAt(0) == str.charAt(1))
			{
				return str.charAt(0) + "*" + pairStar(str.substring(1));
			}
			else
			{
				return str.charAt(0) + pairStar(str.substring(1));
			}
		}  
	}
}
