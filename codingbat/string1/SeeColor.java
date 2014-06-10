package codingbat.string1;

public class SeeColor
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, if the string begins with "red" or "blue"
	 * return that color string, otherwise return the empty string.
	 *
	 * seeColor("redxx") → "red"
	 * seeColor("xxred") → ""
	 * seeColor("blueTimes") → "blue"
	 */
	public String seeColor(String str)
	{
		String beg = "";
		if (str.startsWith("red"))
		{
		   beg = "red";
		}
		else if (str.startsWith("blue"))
		{
		   beg = "blue";
		}
		return beg;
	}
}
