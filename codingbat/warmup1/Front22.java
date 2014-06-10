package codingbat.warmup1;

public class Front22
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, take the first 2 chars
	 * and return the string with the 2 chars added at both
	 * the front and back, so "kitten" yields"kikittenki".
	 * If the string length is less than 2, use whatever chars are there.  
	 *
	 * front22("kitten") → "kikittenki"
	 * front22("Ha") → "HaHaHa"
	 * front22("abc") → "ababcab"
	 */
	public String front22(String str)
	{
		String _2chars = str;
		if (2 < str.length())
		{
			_2chars = str.substring(0,2);
		}
		return _2chars + str + _2chars;
	}
}
