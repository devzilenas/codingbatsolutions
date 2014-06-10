package codingbat.warmup1;

public class StringE
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Return true if the given string contains between 1 and 3 'e' chars.  
	 * stringE("Hello") → true
	 * stringE("Heelle") → true
	 * stringE("Heelele") → false
	 */
	public boolean stringE(String str)
	{
		int count = 0;
		for (char c : str.toCharArray()) 
		{
			if ('e' == c)
			{
				count++;
			}
			if (count > 3)
			{
				break;
			}
		}
		return 1 <= count && count <= 3;
	}
}
