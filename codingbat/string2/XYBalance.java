package codingbat.string2;

public class XYBalance
{
	public static void main(String[] args) 
	{
	}

	/**
	 * We'll say that a String is xy-balanced 
	 * if for all the 'x' chars in the string,
	 * there exists a 'y' char somewhere later in the string.
	 * So "xxy" is balanced, but "xyx" is not.
	 * One 'y' can balance multiple 'x's.
	 * Return true if the given string is xy-balanced.
	 *
	 * xyBalance("aaxbby") → true
	 * xyBalance("aaxbb") → false
	 * xyBalance("yaaxbb") → false
	 */
	public boolean noY(String str) 
	{
		return -1 == str.indexOf("y");
	}

	public boolean xyBalance(String str)
	{
	   
		for (int i = 0; i < str.length(); i++)
		{
			if ('x' == str.charAt(i) &&( i+1 == str.length() || noY(str.substring(i+1))))
			{
				return false;
			}
		}  
		return true;
	}
}
