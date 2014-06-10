package codingbat.string3;

public class MaxBlock
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return the length
	 * of the largest "block" in the string.
	 * A block is a run of adjacent chars that are the same.
	 *
	 * maxBlock("hoopla") → 2
	 * maxBlock("abbCCCddBBBxx") → 3
	 * maxBlock("") → 0
	 */
	public int maxBlock(String str)
	{
		int count    = str.length() > 0 ? 1 : 0;
		int maxcount = count;

		for (int i = 0; i < str.length() - 1; i++) 
		{                
			if (str.charAt(i) != str.charAt(i+1))
			{
				if (maxcount < count)
				{
					maxcount = count;
				}
				count    = 1;
			}
			else if (str.charAt(i) == str.charAt(i+1))
			{
				count++;         
			}                        
		}
		if (maxcount < count)
		{
		   maxcount = count;
		}
		return maxcount;
	}
}
