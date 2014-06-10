package codingbat.string3;

public class NotReplace
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return a string where every appearance
	 * of the lowercase word "is" has been replaced
	 * with "is not". The word "is" should not
	 * be immediately preceeded or 
	 * followed by a letter -- so for example the "is" in "this"
	 * does not count. (Note: Character.isLetter(char) tests
	 * if a char is a letter.)
	 *
	 * notReplace("is test") → "is not test"
	 * notReplace("is-is") → "is not-is not"
	 * notReplace("This is right") → "This is not right"
	 */
	public String notReplace(String str)
	{
		String ret = "";
		char e = '\u0000';
		char l = e;
		char r = e;
		for (int i = 0; i < str.length();)
		{
			if (str.substring(i).startsWith("is"))
			{
				l = e;
				r = e;
				if (0 < i)
				{
					l = str.charAt(i-1);
				}
				if (str.length() > i + 2)
				{
					r = str.charAt(i+2);
				}            
				if (!Character.isLetter(l) && !Character.isLetter(r))
				{
					ret = ret + "is not";             
				}
				else
				{
					ret = ret + "is";
				}
				i = i + 2;
			}
			else 
			{
				ret = ret + str.charAt(i);
				i++;
			}
		}  
		return ret;
	}
}
