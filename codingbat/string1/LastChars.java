package codingbat.string1;

public class LastChars
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given 2 strings, a and b, return a new string made
	 * of the first char of a and the last char of b, 
	 * so "yo" and "java" yields "ya".
	 * If either string is length 0, use '@' for its missing char.
	 *
	 * lastChars("last", "chars") → "ls"
	 * lastChars("yo", "java") → "ya"
	 * lastChars("hi", "") → "h@"
	 */
	public String lastChars(String a, String b)
	{
		String f = 0 == a.length() ? "@" : a.substring(0,1);
		String s = 0 == b.length() ? "@" : b.substring(b.length()-1);
		
		return f+s;
	}
}
