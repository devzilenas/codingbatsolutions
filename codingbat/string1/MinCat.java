package codingbat.string1;

public class MinCat
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given two strings, append them together 
	 * (known as "concatenation") and return the result. 
	 * However, if the strings are different lengths,
	 * omit chars from the longer string so it is the same length
	 * as the shorter string. So "Hello" and "Hi" yield "loHi".
	 * The strings may be any length.
	 *
	 * minCat("Hello", "Hi") → "loHi"
	 * minCat("Hello", "java") → "ellojava"
	 * minCat("java", "Hello") → "javaello"
	 */
	public String minCat(String a, String b)
	{
		String f;
		String s;
		
		int length = (a.length() <= b.length())
		? a.length()
		: b.length();
	   
		f = a.length() <= length ? a : a.substring(a.length() - length);
		s = b.length() <= length ? b : b.substring(b.length() - length);
			
		return f+s;
	}
}
