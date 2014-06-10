package codingbat.warmup1;

public class In3050
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given 2 int values, return true if
	 * they are both in the range 30..40 inclusive,
	 * or they are both in the range 40..50 inclusive.
	 *
	 * in3050(30, 31) → true
	 * in3050(30, 41) → false
	 * in3050(40, 50) → true
	 */
	public boolean in(int a, int l, int r)
	{
		return a >= l && a <= r;
	}
	public boolean in3050(int a, int b)
	{
		return in(a, 30, 40) && in(b, 30, 40) || in(a, 40, 50) && in(b, 40, 50);
	}
}
