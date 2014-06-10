package codingbat.recursion1;

public class AllStar
{
	public static void main(String[] args) 
	{
	}

	/** 
	 * Given a string, compute recursively a new string 
	 * where all the adjacent chars are now separated by a "*".
	 *
	 * allStar("hello") → "h*e*l*l*o"
	 * allStar("abc") → "a*b*c"
	 * allStar("ab") → "a*b"
	 */
	public String allStar(String str) 
	{
		if (0 == str.length())
		{
			return "";
		}
		else if (1 == str.length())
		{
			return str.substring(0,1);
		}    
		else
		{
			return str.substring(0,1) + "*" + allStar(str.substring(1));
		}  
	}
}
