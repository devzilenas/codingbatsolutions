package codingbat.warmup2;

public class DoubleX
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, return true if the first instance
	 * of "x" in the string is immediately followed by another "x".
	 *
	 * doubleX("axxbb") → true
	 * doubleX("axaxax") → false
	 * doubleX("xxxxx") → true
	 */
	boolean doubleX(String str) 
	{
		int i = str.indexOf('x');
		return -1 != i && i+1 < str.length() && 'x' == str.charAt(i+1);
	}
}
