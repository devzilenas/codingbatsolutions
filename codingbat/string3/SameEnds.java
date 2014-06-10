package codingbat.string3;

public class SameEnds
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return the longest substring 
	 * that appears at both the beginning and end of the string
	 * without overlapping. For example, sameEnds("abXab") is "ab".  
	 * sameEnds("abXYab") → "ab"
	 * sameEnds("xx") → "x"
	 * sameEnds("xxx") → "x"
	 */
	public String sameEnds(String str) 
	{
		String sub = "";
		String tmp = "";
		for (int i = 1; i <= str.length() / 2; i++)
		{   
			tmp = str.substring(0, i);
			
			if (str.substring(str.length() - tmp.length()).startsWith(tmp))
			{
				sub = tmp;
			}
		}  
		
		return sub;
	}
}
