package codingbat.warmup2;

public class StringSplosion
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a non-empty string like "Code" return a string 
	 * like "CCoCodCode".
	 *
	 * stringSplosion("Code") → "CCoCodCode"
	 * stringSplosion("abc") → "aababc"
	 * stringSplosion("ab") → "aab"
	 */
	public String stringSplosion(String str)
	{
		String ret = "";

		for (int i = 0; i < str.length(); i++) 
		{
			ret += str.substring(0, i+1);
		}  
		
		return ret;
	}
}
