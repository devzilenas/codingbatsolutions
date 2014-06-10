package codingbat.string1;

public class Without2
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, if a length 2 substring appears
	 * at both its beginning and end, 
	 * return a string without the substring at the beginning,
	 * so "HelloHe" yields "lloHe". 
	 * The substring may overlap with itself, 
	 * so "Hi" yields "". Otherwise, 
	 * return the original string unchanged.
	 *
	 * without2("HelloHe") → "lloHe"
	 * without2("HelloHi") → "HelloHi"
	 * without2("Hi") → ""
	 */
	public String without2(String str)
	{
		String sub = "";
		String ret = "";
		
		if (2 <= str.length()) 
		{
			sub = str.substring(0,2);
		  
			if (sub.equals(str.substring(str.length() - 2)))
			{
				ret = str.substring(2);
			}
			else
			{
				ret = str;
			}
		} 
		else
		{
			ret = str;
		}
		return ret;
	}
}
