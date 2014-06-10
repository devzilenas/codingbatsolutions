package codingbat.warmup1;

public class MixStart
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Return true if the given string begins with "mix",
	 * except the 'm' can be anything, so "pix", "9ix" .. all count.
	 *
	 * mixStart("mix snacks") → true
	 * mixStart("pix snacks") → true
	 * mixStart("piz snacks") → false
	 */
	public boolean mixStart(String str)
	{
		return 1 == str.indexOf("ix");  
	}
}
