package codingbat.warmup2;

public class StringBits
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return a new string made of every other char
	 * starting with the first, so "Hello" yields "Hlo".
	 *
	 * stringBits("Hello") → "Hlo"
	 * stringBits("Hi") → "H"
	 * stringBits("Heeololeo") → "Hello"
	 */
	public String stringBits(String str)
	{
		String ret = "";
		for (int i = 0; i < str.length(); i+=2)
		{
			ret += str.charAt(i);
		}
		return ret;
	}	
}
