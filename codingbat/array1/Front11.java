package codingbat.array1;

public class Front11
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given 2 int arrays, a and b, of any length,
	 * return a new array with the first element of each array.
	 * If either array is length 0, ignore that array.
	 *
	 * front11({1, 2, 3}, {7, 9, 8}) → {1, 7}
	 * front11({1}, {2}) → {1, 2}
	 * front11({1, 7}, {}) → {1}
	 */
	public int[] front11(int[] a, int[] b)
	{
		int[] y = {};
		if (0 == a.length) 
		{
			if (2 <= b.length) 
			{  
				int[] n = {b[0]};
				return n;
			}
			else
			{
				return b;
			}
		}
		else if (0 == b.length)
		{
			if (2 <= a.length)
			{
				int[] n = {a[0]};
				return n;
			}
			else
			{
				return a;
			}
		}
		else if (0 != a.length && 0 != b.length) 
		{
			int[] n = {a[0], b[0]};
			return n;
		}
		return y;
	}
}
