package codingbat.recursion1;

public class ChangePi
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, compute recursively (no loops) a new string 
	 * where all appearances of "pi" have been replaced by "3.14".
	 *
	 * changePi("xpix") → "x3.14x"
	 * changePi("pipi") → "3.143.14"
	 * changePi("pip") → "3.14p"
	 */
	public String changePi(String str)
	{
		String pi  = "";
		String tmp = "";
		if (0 == str.length())
		{
			return "";
		}
		else
		{
			if (str.startsWith("pi"))
			{
				pi = "3.14";
				tmp = str.substring(2);
			}
			else
			{
				pi  = "" + str.charAt(0);
				tmp = str.substring(1);
			}
		}
		return pi + changePi(tmp);  
	} 
}
