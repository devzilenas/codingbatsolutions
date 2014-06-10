package codingbat.recursion1;

public class CountAbc
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Count recursively the total number of "abc" and "aba"
	 * substrings that appear in the given string.
	 *
	 * countAbc("abc") → 1
	 * countAbc("abcxxabc") → 2
	 * countAbc("abaxxaba") → 2
	 */
	public int countAbc(String str)
	{
		String tmp = "";
		int    count  = 0;
		if (3 > str.length())
		{
			return 0;
		}
		else
		{
			if (str.startsWith("abc") ||  str.startsWith("aba"))
			{
				count = 1;
				tmp   = str.substring(2);
			}
			else
			{
				count = 0;
				tmp   = str.substring(1);
			}
			return count + countAbc(tmp);  
		}
	} 
}
