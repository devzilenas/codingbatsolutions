package codingbat.warmup2;

public class StringYak
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Suppose the string "yak" is unlucky.
	 * Given a string, return a version where all the "yak" are removed,
	 * but the "a" can be any char. The "yak" strings will not overlap.
	 *
	 * stringYak("yakpak") → "pak"
	 * stringYak("pakyak") → "pak"
	 * stringYak("yak123ya") → "123ya"
	 */
	public String stringYak(String str)
	{
	   String ret = "";
	   for (int i = 0; i < str.length();)
	   {
		   if ('y' == str.charAt(i) && i+2 < str.length() && 'k' == str.charAt(i+2))
		   {
			   i = i+3;
		   }
		   else
		   {
			   ret = ret + str.charAt(i);
			   i++;
		   }
	   }     
	   return ret;
	}
}
