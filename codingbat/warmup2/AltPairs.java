package codingbat.warmup2;

public class AltPairs
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return a string made of the chars
	 * at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
	 *
	 * altPairs("kitten") → "kien"
	 * altPairs("Chocolate") → "Chole"
	 * altPairs("CodingHorror") → "Congrr"
	 */
	public String altPairs(String str) 
	{
		String ret = "";
		for (int i = 0; i < str.length(); i+=4) 
		{
			if (i+1 < str.length()) {
			   ret = ret + str.substring(i, i+2);
			}
			else 
			{
			   ret = ret + str.charAt(str.length()-1);
			}
		}
		return ret;
	}
}
