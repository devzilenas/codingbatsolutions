package codingbat.recursion1;

public class NestParen
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return true if it is a nesting of zero 
	 * or more pairs of parenthesis, like "(())" or "((()))".
	 * Suggestion: check the first and last chars,
	 * and then recur on what's inside them.
	 *
	 * nestParen("(())") → true
	 * nestParen("((()))") → true
	 * nestParen("(((x))") → false
	 */
	public boolean nestParen(String str)
	{
		boolean ret = false;
		
		if (0 == str.length())
		{
			return true;
		}
		else
		{
			if (2 <= str.length() 
				&& '(' == str.charAt(0)
				&& ')' == str.charAt(str.length() - 1))
			{
				return true && nestParen(str.substring(1,str.length()-1));
			}
			else
			{
				return false;
			}
		}  
	}
}
