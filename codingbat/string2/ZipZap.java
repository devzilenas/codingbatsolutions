package codingbat.string2;

public class ZipZap
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Look for patterns like "zip" and "zap" 
	 * in the string -- length-3, starting with 'z' and
	 * ending with 'p'.
	 * Return a string where for all such words,
	 * the middle letter is gone, so "zipXzap" yields "zpXzp".
	 *
	 * zipZap("zipXzap") → "zpXzp"
	 * zipZap("zopzop") → "zpzp"
	 * zipZap("zzzopzop") → "zzzpzp"
	 */
	public String zipZap(String str)
	{
		String ret = "";
		for (int i = 0; i < str.length(); i++)
		{
			if ( ! ( i > 0 && 'z' == str.charAt(i - 1) && i+1 < str.length() && 'p' == str.charAt(i+1) ))
			{
				ret = ret + str.charAt(i);
			}
		}
		
		return ret;
	}
}
