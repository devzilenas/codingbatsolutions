package codingbat.string3;

public class GHappy
{
	public static void main(String[] args) 
	{
	}

	/**
	 * We'll say that a lowercase 'g' in a string is "happy"
	 * if there is another 'g' immediately to its left or right.
	 * Return true if all the g's in the given string are happy.
	 *
	 * gHappy("xxggxx") → true
	 * gHappy("xxgxx") → false
	 * gHappy("xxggyygxx") → false
	 */
	public boolean gHappy(String str)
	{
		final char e = '\u0000';
		final char g = 'g';
		boolean isHappy = true;
		char toLeft     = e;
		char toRight    = e;
		for (int i = 0; i < str.length(); i++)
		{
			if (g == str.charAt(i))
			{
			   if (0 == i)
			   {
				   toLeft  = e;
				   toRight = i+1 < str.length() ? str.charAt(i+1) : e;
			   }
			   else if (0 < i && i+1 < str.length())
			   {
				   toLeft = str.charAt(i-1);
				   toRight = str.charAt(i+1);
			   }
			   else if (str.length() == i+1)
			   {
				   toLeft = str.charAt(i-1);
				   toRight = e;
			   }
			   
			   if ( !( g == toLeft || g == toRight))
			   {
				   isHappy = false;
				   break;
			   }        
			}
		}
		
		return isHappy;
		
	}
}
