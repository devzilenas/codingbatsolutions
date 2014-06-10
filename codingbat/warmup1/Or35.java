package codingbat.warmup1;

public class Or35
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Return true if the given non-negative number
	 * is a multiple of 3 or a multiple of 5.
	 * Use the % "mod" operator -- see Introduction to Mod
	 *
	 * or35(3) → true
	 * or35(10) → true
	 * or35(8) → false
	 */
	public boolean or35(int n)
	{
		return 0 == n % 3 || 0 == n % 5;
	}
}