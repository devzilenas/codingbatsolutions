package codingbat.warmup1;

public class DelDel
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, if the string "del" appears starting at index 1, 
	 * return a string where that "del" has been deleted.
	 * Otherwise, return the string unchanged.
	 *
	 * delDel("adelbc") → "abc"
	 * delDel("adelHello") → "aHello"
	 * delDel("adedbc") → "adedbc"
	 */
	public String delDel(String str)
	{
		String ret = str;
		if (1 == str.indexOf("del")) 
		{
			ret = str.charAt(0) + str.substring(4);
		}
		return ret;
	}
}
