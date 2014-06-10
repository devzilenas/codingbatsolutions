package codingbat.string1;

public class FrontAgain
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return true if the first 2 chars
	 * in the string also appear at the end of the string,
	 * such as with "edited".
	 *
	 * frontAgain("edited") → true
	 * frontAgain("edit") → false
	 * frontAgain("ed") → true
	 */
	public boolean frontAgain(String str)
	{
		boolean starts = false;
		String start = "";
		String end   = "";
		if (2 <= str.length())
		{
			start  = str.substring(0, 2);
			end    = str.substring(str.length() - 2);
			starts = start.equals(end);
		}
		return starts;
	}
}	
