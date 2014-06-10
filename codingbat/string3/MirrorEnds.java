package codingbat.string3;

public class MirrorEnds
{
	public static void main(String[] args) 
	{ 
	}

	/**
	 * Given a string, look for a mirror image (backwards) 
	 * string at both the beginning and end of the given string.
	 * In other words, zero or more characters 
	 * at the very begining of the given string,
	 * and at the very end of the string 
	 * in reverse order (possibly overlapping).
	 * For example, the string "abXYZba" has the mirror end "ab".
	 *
	 * mirrorEnds("abXYZba") → "ab"
	 * mirrorEnds("abca") → "a"
	 * mirrorEnds("aba") → "aba"
	 */
	public String mirrorEnds(String string)
	{
		String ret = "";
		String rev = "";
		int i = 0;
		
		for (i = string.length() - 1; i >= 0; i--)
		{
			rev += string.charAt(i);
		}
		
		for (i = 0; i < string.length(); i++)
		{
			if (string.charAt(i) == rev.charAt(i))
			{
				ret = ret + string.charAt(i);
			}
			else
			{
				break;
			}
		}
		
		return ret;
	}
}
