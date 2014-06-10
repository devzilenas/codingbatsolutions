package codingbat.string1;

public class AtFirst
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return a string length 2 made of its first 2 chars.
	 * If the string length is less than 2, 
	 * use '@' for the missing chars.
	 *
	 * atFirst("hello") → "he"
	 * atFirst("hi") → "hi"
	 * atFirst("h") → "h@"
	 */
	public String atFirst(String str)
	{
		String ret = "";
		if (2 < str.length()) 
		{
			ret = str.substring(0,2);
		} 
		else
		{
			if (0 == str.length())
			{
				ret = "@@";
			}
			if (1 == str.length())
			{
				ret = str + "@";
			}
			else if (2 == str.length())
			{
				ret = str;
			}        
		}
		return ret;
	}
}
