package codingbat.warmup2;

public class StringTimes
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string and a non-negative int n,
	 * return a larger string that is n copies of the original string.
	 *
	 * stringTimes("Hi", 2) → "HiHi"
	 * stringTimes("Hi", 3) → "HiHiHi"
	 * stringTimes("Hi", 1) → "Hi"
	 */
	public String stringTimes(String str, int n)
	{
		String copy = "";
		for (int i = 0; i < n; i++, copy+=str);
		return copy;
	}
}
