package codingbat.string2;

public class PrefixAgain
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, consider the prefix string made
	 * of the first N chars of the string.
	 * Does that prefix string appear somewhere else in the string?
	 * Assume that the string is not empty and that N
	 * is in the range 1..str.length().
	 *
	 * prefixAgain("abXYabc", 1) → true
	 * prefixAgain("abXYabc", 2) → true
	 * prefixAgain("abXYabc", 3) → false*
	 */
	public boolean prefixAgain(String str, int n)
	{
		String prefix = str.substring(0, n);
		
		return -1 != str.substring(n).indexOf(prefix);
	}
}
