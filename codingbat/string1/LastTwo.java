package codingbat.string1;

public class LastTwo
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string of any length, return a new string 
	 * where the last 2 chars, if present, are swapped, 
	 * so "coding" yields "codign".
	 *
	 * lastTwo("coding") → "codign"
	 * lastTwo("cat") → "cta"
	 * lastTwo("ab") → "ba" 
	 */
	public String lastTwo(String str)
	{
		String sw = "";
		if (2 <= str.length())
		{
			sw = str.substring(0, str.length() - 2)
			+ str.substring(str.length() - 1) 
			+ str.substring(str.length() - 2, str.length() - 1);       
		}
		else
		{
			sw = str;
		}
		return sw;
	}
}
