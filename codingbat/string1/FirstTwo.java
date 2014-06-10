package codingbat.string1;

public class FirstTwo
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return the string made of its first two chars,
	 * so the String "Hello" yields "He".
	 * If the string is shorter than length 2,
	 * return whatever there is, so "X" yields "X",
	 * and the empty string "" yields the empty string "".
	 * Note that str.length() returns the length of a string.
	 *
	 * firstTwo("Hello") → "He"
	 * firstTwo("abcdefg") → "ab"
	 * firstTwo("ab") → "ab"
	 */
	public String firstTwo(String str)
	{
		String ret = "";
		
		if (2 <= str.length()) 
		{
			ret = str.substring(0,2);
		}  
		else
		{
			ret = str;
		}
		
		return ret;
	}
}
