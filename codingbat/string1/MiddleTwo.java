package codingbat.string1;

public class MiddleTwo
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string of even length, 
	 * return a string made of the middle two chars,
	 * so the string "string" yields "ri".
	 * The string length will be at least 2.
	 *
	 * middleTwo("string") → "ri"
	 * middleTwo("code") → "od"
	 * middleTwo("Practice") → "ct"
	 */
	public String middleTwo(String str)
	{
		String ret = "";
		int middle = 0;
		if (3 <= str.length())
		{
			middle = str.length() / 2;
			ret = str.substring(middle - 1, middle + 1);
		}
		else
		{
			ret = str;
		}
		
		return ret;
	}
}
