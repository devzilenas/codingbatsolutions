package codingbat.string2;

public class DoubleChar
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return a string where 
	 * for every char in the original, there are two chars.
	 *
	 * doubleChar("The") → "TThhee"
	 * doubleChar("AAbb") → "AAAAbbbb"
	 * doubleChar("Hi-There") → "HHii--TThheerree"
	 */
	public String doubleChar(String str)
	{    
		String ret = "";
		 
		for (char c : str.toCharArray())
		{
			ret += "" + c+c;
		}  
		
		return ret;
	}
}
