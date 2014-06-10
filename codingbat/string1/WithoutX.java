package codingbat.string1;

public class WithoutX
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, if the first or last chars are 'x',
	 * return the string without those 'x' chars,
	 * and otherwise return the string unchanged.
	 *
	 * withoutX("xHix") → "Hi"
	 * withoutX("xHi") → "Hi"
	 * withoutX("Hxix") → "Hxi"
	 */
	public String withoutX(String str)
	{
		String tmp = str;
		if (tmp.startsWith("x"))
		{
			tmp = tmp.substring(1);
		}
		
		if (tmp.endsWith("x"))
		{
			tmp = tmp.substring(0, tmp.length() - 1);
		}
		
		return tmp;    
	}
}
