package codingbat.recursion1;

public class CountX
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, compute recursively (no loops)
	 * the number of lowercase 'x' chars in the string.
	 *
	 * countX("xxhixx") → 4
	 * countX("xhixhix") → 3
	 * countX("hi") → 0
	 */
	public int countX(String str)
	{
		int h = 0;
		if (0 == str.length())
		{
			return 0;
		}
		else
		{
			if ('x' == str.charAt(0))
			{
				h = 1;
			}
			else
			{
				h = 0;
			}
		}
		return h + countX(str.substring(1));  
	}
}
