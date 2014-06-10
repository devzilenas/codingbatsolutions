package codingbat.warmup2;

public class CountXX
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Count the number of "xx" in the given string.
	 * We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	 *
	 * countXX("abcxx") → 1
	 * countXX("xxx") → 2
	 * countXX("xxxx") → 3
	 */
	int countXX(String str)
	{
		int count = 0 ;
		char prev ;
		char curr ;
		if (1 < str.length()) 
		{
			prev = str.charAt(0);
			for (int i = 1; i < str.length(); i++) 
			{
				curr = str.charAt(i);
				if ('x' == curr && 'x' == prev)
				{
					count++;
				}
				prev = curr;
			}
		}
		return count;
	}
}
