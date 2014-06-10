package codingbat.string2;

public class WordEnds
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string and a non-empty word string,
	 * return a string made of each char just before
	 * and just after every appearance of the word in the string.
	 * Ignore cases where there is no char before or
	 * after the word, and a char may be included twice
	 * if it is between two words.
	 *
	 * wordEnds("abcXY123XYijk", "XY") → "c13i"
	 * wordEnds("XY123XY", "XY") → "13"
	 * wordEnds("XY1XY", "XY") → "11"
	 */
	public String wordEnds(String str, String word)
	{
		String ret = "";
		for (int i = 0; i < str.length(); )
		{
			if (0 == i && str.startsWith(word))
			{
				i = i + word.length();
				if (i < str.length())
				{
					ret = ret + str.charAt(i);
				}
			}
			else if (0 < i && str.substring(i).startsWith(word)) 
			{
				ret = ret + str.charAt(i - 1);            
				i   = i   + word.length();
				if (i < str.length()) 
				{
					ret = ret + str.charAt(i);
				}
			}
			else
			{
				i++;
			}
			
		}
		
		return ret;
	}
}
