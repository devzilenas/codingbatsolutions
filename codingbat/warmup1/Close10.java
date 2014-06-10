package codingbat.warmup1;

public class Close10
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given 2 int values, return whichever value is nearest
	 * to the value 10, or return 0 in the event of a tie.
	 * Note that Math.abs(n) returns the absolute value of a number.
	 *
	 * close10(8, 13) → 8
	 * close10(13, 8) → 8
	 * close10(13, 7) → 0
	 */
	public int close10(int a, int b)
	{
		int ra = Math.abs(10-a);
		int rb = Math.abs(10-b);
		return ra == rb ? 0 : (ra < rb ? a : b);
	}
}
