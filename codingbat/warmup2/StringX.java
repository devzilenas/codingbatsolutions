package codingbat.warmup2;

public class StringX
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return a version where all the "x" 
	 * have been removed. 
	 * Except an "x" at the very start or end should not be removed.
	 *
	 * stringX("xxHxix") → "xHix"
	 * stringX("abxxxcd") → "abcd"
	 * stringX("xabxxxcdx") → "xabcdx"
	 */
	public String stringX(String str)
	{
		String ret = "";
		for (int i = 0; i < str.length(); i++)
		{
			if ('x' != str.charAt(i) || 0 == i || str.length() - 1 == i )
			{ 
				ret = ret + str.charAt(i);
			}
		}
		return ret;
	}
}
