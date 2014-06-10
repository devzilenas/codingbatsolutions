package codingbat.warmup2;

public class Last2
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return the count of the number of times
	 * that a substring length 2 appears in the string
	 * and also as the last 2 chars of the string,
	 * so "hixxxhi" yields 1 (we won't count the end substring).
	 *
	 * last2("hixxhi") → 1
	 * last2("xaxxaxaxx") → 1
	 * last2("axxxaaxx") → 2
	 */
	public int last2(String str) 
	{
		int count = 0;
		if (str.length() >= 2)
		{
			String sub = str.substring(str.length() - 2, str.length());
			String tmp = str.substring(0, str.length() - 1);        
			while (0 < tmp.length())
			{
				if (tmp.startsWith(sub))
				{
					count++;
				}
				tmp = tmp.substring(1);
			}
		}
		return count;
	}
}	
