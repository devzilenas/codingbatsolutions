package codingbat.warmup1;

public class Front3
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, we'll say that the front is the first 3 chars 
	 * of the string. 
	 * If the string length is less than 3, 
	 * the front is whatever is there.
	 * Return a new string which is 3 copies of the front.
	 *
	 * front3("Java") → "JavJavJav"
	 * front3("Chocolate") → "ChoChoCho"
	 * front3("abc") → "abcabcabc"
	 */
	public String front3(String str) 
	{
		String front = str;
		if (3 < str.length())
		{
			front = str.substring(0, 3);
		}
		return front+front+front;
	}
}
