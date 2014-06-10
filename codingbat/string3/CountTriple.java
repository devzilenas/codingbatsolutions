package codingbat.string3;

public class CountTriple
{
	public static void main(String[] args) 
	{
	}

	/**
	 * We'll say that a "triple" in a string is a char
	 * appearing three times in a row. Return the number 
	 * of triples in the given string. The triples may overlap.
	 *
	 * countTriple("abcXXXabc") → 1
	 * countTriple("xxxabyyyycd") → 3
	 * countTriple("a") → 0
	 */
	public int countTriple(String str)
	{
		char c     = '\u0000';
		int  count = 0;
		for (int i = 0; i < str.length() - 2; i++)
		{
			c = str.charAt(i);
			if (i+2 < str.length() && c == str.charAt(i+1) && c == str.charAt(i+2))
			{
				count++;
			}        
		}  
		
		return count;
	}
}
