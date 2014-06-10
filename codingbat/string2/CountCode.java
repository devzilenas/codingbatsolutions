package codingbat.string2;

public class CountCode
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Return the number of times that the string "code"
	 * appears anywhere in the given string,
	 * except we'll accept any letter for the 'd',
	 * so "cope" and "cooe" count.
	 *
	 * countCode("aaacodebbb") → 1
	 * countCode("codexxcode") → 2
	 * countCode("cozexxcope") → 2
	 */
	public int countCode(String str)
	{
		int count = 0;
		for (int i = 0; i < str.length() - "code".length()+1; i++)
		{
			if ('c' == str.charAt(i) && 'o' == str.charAt(i+1) && 'e' == str.charAt(i+3))
			{
				 count++;
			}
		}  
		return count;
	}
}
