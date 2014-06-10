package codingbat.string2;

public class RepeatEnd
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string and an int N, return a string
	 * made of N repetitions of the last N characters 
	 * of the string. You may assume that N is between 0
	 * and the length of the string, inclusive.
	 *
	 * repeatEnd("Hello", 3) → "llollollo"
	 * repeatEnd("Hello", 2) → "lolo"
	 * repeatEnd("Hello", 1) → "o"
	 */
	public String repeatEnd(String str, int n)
	{
		String rep = str.substring(str.length() - n); 
		String ret = "";
		for (int i = 0; i < n ; i++)
		{
			ret = ret + rep;
		}
		
		return ret;
	}
}
