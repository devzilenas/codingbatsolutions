package codingbat.string1;

public class WithouEnd2
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return a version without both
	 * the first and last char of the string.
	 * The string may be any length, including 0.
	 *
	 * withouEnd2("Hello") → "ell"
	 * withouEnd2("abc") → "b"
	 * withouEnd2("ab") → ""
	 */
	public String withouEnd2(String str)
	{
		return 2 > str.length() ? "" : str.substring(1, str.length() - 1 );
	}
}
