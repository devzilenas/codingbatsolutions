package codingbat.warmup1;

public class FrontBack
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return a new string where
	 * the first and last chars have been exchanged.
	 *
	 * frontBack("code") → "eodc"
	 * frontBack("a") → "a"
	 * frontBack("ab") → "ba"
	 */
	public String frontBack(String str)
	{
		String ret = "";
		if (str.length() > 1)
		{
			char first = str.charAt(0);
			char last  = str.charAt(str.length() - 1 );
			ret = last + str.substring(1, str.length() - 1) + first;
		} 
		else
		{
			ret = str; 
		}
		return ret;
	}
}
