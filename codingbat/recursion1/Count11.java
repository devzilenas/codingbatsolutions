package codingbat.recursion1;

public class Count11
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, compute recursively (no loops) the number
	 * of "11" substrings in the string. 
	 * The "11" substrings should not overlap.
	 *
	 * count11("11abc11") → 2
	 * count11("abc11x11x11") → 3
	 * count11("111") → 1
	 */
	public int count11(String str)
	{
		int count = 0;
		String tmp = "";
		if (2 > str.length())
		{
			return 0;
		}
		else
		{
			if (str.startsWith("11"))
			{
				count = 1;
				tmp = str.substring(2);
			}
			else
			{
				count = 0;
				tmp = str.substring(1);
			}
			return count + count11(tmp);
		}
	}
}
