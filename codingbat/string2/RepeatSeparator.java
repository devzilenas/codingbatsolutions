package codingbat.string2;

public class RepeatSeparator
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given two strings, word and a separator,
	 * return a big string made of count occurences of the word,
	 * separated by the separator string.
	 *
	 * repeatSeparator("Word", "X", 3) → "WordXWordXWord"
	 * repeatSeparator("This", "And", 2) → "ThisAndThis"
	 * repeatSeparator("This", "And", 1) → "This"
	 */
	public String repeatSeparator(String word, String sep, int count) 
	{
		String ret = "";
		for (int i = 0; i < count; i++)
		{
			if ( i > 0) 
			{
				ret = ret + sep;
			}
			ret = ret + word;
		}
		
		return ret;
	}
}
