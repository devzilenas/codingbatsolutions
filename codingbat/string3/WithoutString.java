package codingbat.string3;

public class WithoutString
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given two strings, base and remove, 
	 * return a version of the base string where all instances of the remove string have been removed (not case sensitive).
	 * You may assume that the remove string is length 1 or more.
	 * Remove only non-overlapping instances,
	 * so with "xxx" removing "xx" leaves "x".
	 *
	 * withoutString("Hello there", "llo") → "He there"
	 * withoutString("Hello there", "e") → "Hllo thr"
	 * withoutString("Hello there", "x") → "Hello there"
	 */ 
	public String withoutString(String base, String remove) 
	{
		String ret = "";
		for (int i = 0 ; i < base.length();)
		{
			if (base.substring(i).toUpperCase().startsWith(remove.toUpperCase()))
			{
				i = i + remove.length();
			}
			else
			{
				ret = ret + base.charAt(i); 
				i++;           
			}
		}  
		
		return ret;
	} 
}
