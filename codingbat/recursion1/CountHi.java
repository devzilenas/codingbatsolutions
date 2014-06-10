package codingbat.recursion1;

public class CountHi
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, compute recursively (no loops) 
	 * the number of times lowercase "hi" appears in the string. 
	 *
	 * countHi("xxhixx") → 1
	 * countHi("xhixhix") → 2
	 * countHi("hi") → 1
	 */
	public int countHi(String str)
	{
		int a = 0;
		String tmp = "";
		if (0 == str.length())
		{
			return 0;
		}
		else
		{
			if (str.startsWith("hi"))
			{
				a = 1;
				tmp = str.substring("hi".length());
			}
			else 
			{
				tmp = str.substring(1);
				a = 0;
			}
		}
		return a + countHi(tmp);  
	}
}
