package codingbat.string1;

public class FirstHalf
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string of even length, return the first half.
	 * So the string "WooHoo" yields "Woo".
	 *
	 * firstHalf("WooHoo") → "Woo"
	 * firstHalf("HelloThere") → "Hello"
	 * firstHalf("abcdef") → "abc"
	 */
	public String firstHalf(String str)
	{
		String ret = "";
		if (0 < str.length())
		{
			ret = str.substring(0, str.length() / 2);
		}  
		return ret;
	}
}
