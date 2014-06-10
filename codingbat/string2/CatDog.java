package codingbat.string2;

public class CatDog
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Return true if the string "cat" and "dog"
	 * appear the same number of times in the given string.
	 *
	 * catDog("catdog") → true
	 * catDog("catcat") → false
	 * catDog("1cat1cadodog") → true
	 */
	public int countStr(String str, String toC) 
	{
		int count = 0;
		for (int i = 0; i < str.length() - toC.length() + 1; i++) 
		{
			if (toC.equals(str.substring(i,i+toC.length())))
			{
				count++;
			}
		}  
		return count;
	}

	public boolean catDog(String str)
	{
		return countStr(str, "cat") == countStr(str,"dog");
	}
}
