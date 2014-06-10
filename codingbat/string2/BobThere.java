package codingbat.string2;

public class BobThere
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Return true if the given string contains a "bob" string,
	 * but where the middle 'o' char can be any char.
	 *
	 * bobThere("abcbob") → true
	 * bobThere("b9b") → true
	 * bobThere("bac") → false
	 */
	public boolean bobThere(String str)
	{
		boolean contains = false;
		for (int i = 1; !contains && i < str.length() - 1 ; i++)
		{
			if ('b' == str.charAt(i-1) && 'b' == str.charAt(i+1))
			{
				contains = true;
			}
		}  
		return contains;
	}
}
