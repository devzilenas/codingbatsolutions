package codingbat.string2;

public class SameStarChar
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Returns true if for every '*' (star) in the string,
	 * if there are chars both immediately before and after
	 * the star, they are the same.
	 *
	 * sameStarChar("xy*yzz") → true
	 * sameStarChar("xy*zzz") → false
	 * sameStarChar("*xa*az") → true
	 */
	public boolean sameStarChar(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			if ('*' == str.charAt(i))
			{
				if (i > 0 && i < str.length() - 1
				 && str.charAt(i-1) != str.charAt(i+1))
				{
					return false;
				}            
			}
		}
		return true;
	}
}
