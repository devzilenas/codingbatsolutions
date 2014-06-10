package codingbat.recursion1;

public class CountPairs
{
	public static void main(String[] args) 
	{
	}

	/**
	 * We'll say that a "pair" in a string is two instances of a char
	 * separated by a char. 
	 * So "AxA" the A's make a pair. Pair's can overlap,
	 * so "AxAxA" contains 3 pairs -- 2 for A and 1 for x.
	 * Recursively compute the number of pairs in the given string.
	 *
	 * countPairs("axa") → 1
	 * countPairs("axax") → 2
	 * countPairs("axbx") → 1
	 */
	public int countPairs(String str)
	{
		int pair = 0;
		if (0 == str.length())
		{
			return 0;
		}
		else
		{
			if (3 <= str.length() && str.charAt(0) == str.charAt(2))
			{
				pair = 1;
			}
			else
			{
				pair = 0;
			}
			return pair + countPairs(str.substring(1));
		}
	}
}
