package codingbat.string1;

public class DeFront
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return a version without the first 2 chars.
	 * Except keep the first char if it is 'a' 
	 * and keep the second char if it is 'b'.
	 * The string may be any length. Harder than it looks.
	 *
	 * deFront("Hello") → "llo"
	 * deFront("java") → "va"
	 * deFront("away") → "aay" 
	 */
	public String deFront(String str)
	{
		String first  = "";
		String second = "";
		
		String left   = "";
		
		if (2 <= str.length())
		{
			left   = str.substring(2)  ;
			first  = str.substring(0,1); 
			second = str.substring(1,2);
		}
		else if (1 == str.length())
		{
			left   = "";
			first  = str;
			second = "";
		}
		
		return (first.equals("a") ? "a" : "") + (second.equals("b") ? "b" : "") + left;         
	}
}
