package codingbat.string1;

public class WithoutX2
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, if one or both of the first 2 chars is 'x',
	 * return the string without those 'x' chars,
	 * and otherwise return the string unchanged.
	 * This is a little harder than it looks.
	 *
	 * withoutX2("xHi") → "Hi"
	 * withoutX2("Hxi") → "Hi"
	 * withoutX2("Hi") → "Hi"
	 */
	public String withoutX2(String str)
	{
		String first  = "";
		String second = "";
		String last   = "";
		
		if (2 <= str.length())
		{
			 first  = str.substring(0,1);
			 second = str.substring(1,2);
			 last   = str.substring(2);
		}
		else if (1 == str.length())
		{
			first = str.substring(0,1);
			last  = str.substring(1);
		}
		
		return ("x".equals(first) ? "" : first) + ("x".equals(second) ? "" : second) + last;
	}
}
