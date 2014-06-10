package codingbat.string2;

public class MixString
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given two strings, A and B, create a bigger string
	 * made of the first char of A, the first char of B,
	 * the second char of A, the second char of B, and so on.
	 * Any leftover chars go at the end of the result.
	 *
	 * mixString("abc", "xyz") → "axbycz"
	 * mixString("Hi", "There") → "HTihere"
	 * mixString("xxxx", "There") → "xTxhxexre"
	 */
	public String mixString(String a, String b)
	{
		String ret = "";
		for (int i = 0; i < a.length() && i < b.length(); i++)
		{
			ret = ret + "" + a.charAt(i) + b.charAt(i);
		}
		
		if (a.length() < b.length())
		{
			ret = ret + b.substring(a.length());
		}
		else if (a.length() > b.length())
		{
			ret = ret + a.substring(b.length());
		}
		
		return ret;
	}
}
