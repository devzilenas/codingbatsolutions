package codingbat.recursion1;

public class CountHi2
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, compute recursively the number of times 
	 * lowercase "hi" appears in the string, however 
	 * do not count "hi" that have an 'x' immedately before them.
	 *
	 * countHi2("ahixhi") → 1
	 * countHi2("ahibhi") → 2
	 * countHi2("xhixhi") → 0
	 */
	public int countHi2(String str) 
	{
		int    count = 0;
		String tmp   = "";
		if (2 > str.length())
		{
			return 0;
		}
		else
		{
			if (str.substring(0,2).startsWith("hi"))
			{
				count = 1;
				tmp   = str.substring(2);
			}
			else if (3 <= str.length()
			  && str.substring(1,3).startsWith("hi"))
			{ 
				if ('x' != str.charAt(0))
				{
					count = 1;
					tmp   = str.substring(3);  
				}
				else
				{
					count = 0;
					tmp   = str.substring(3);
				}
			}
			else
			{
				count = 0;
				tmp = str.substring(1);
			}
			return count + countHi2(tmp);
		}
	}
}
