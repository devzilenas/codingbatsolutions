package codingbat.warmup1;

public class StartOz
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return a string made of
	 * the first 2 chars (if present),
	 * however include first char only if it is 'o' and 
	 * include the second only if it is 'z', so "ozymandias" yields "oz".  
	 *
	 * startOz("ozymandias") → "oz"
	 * startOz("bzoo") → "z"
	 * startOz("oxx") → "o"
	 */
	public String startOz(String str)
	{
		String first  = "";
		String second = "";
		if (str.length()>=1)
		{
			first = 'o' == str.charAt(0) ? "o" : "";
		}
		if (str.length()>=2)
		{
			second = 'z' == str.charAt(1) ? "z" : "";
		}         
		return first + second;
	}
}
