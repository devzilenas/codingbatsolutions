package codingbat.string2;

public class PlusOut
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string and a non-empty word string,
	 * return a version of the original String
	 * where all chars have been replaced by pluses ("+"),
	 * except for appearances of the word string
	 * which are preserved unchanged.
	 *
	 * plusOut("12xy34", "xy") → "++xy++"
	 * plusOut("12xy34", "1") → "1+++++"
	 * plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
	 */
	public String plusOut(String str, String word)
	{
		String ret = "";
		for (int i = 0; i < str.length();)
		{
			if (str.substring(i).startsWith(word))
			{
				ret = ret + word;
				i = i + word.length();
			}
			else
			{
				ret = ret + "+";
				i++;
			}
		}
		return ret;
	}
}
