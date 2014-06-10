package codingbat.array1;

public class Make2
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given 2 int arrays, a and b, return a new array length 2
	 * containing, as much as will fit, the elements 
	 * from a followed by the elements from b.
	 * The arrays may be any length, including 0,
	 * but there will be 2 or more elements available 
	 * between the 2 arrays.
	 *
	 * make2({4, 5}, {1, 2, 3}) → {4, 5}
	 * make2({4}, {1, 2, 3}) → {4, 1}
	 * make2({}, {1, 2}) → {1, 2}
	 */
	public int[] make2(int[] a, int[] b)
	{
		int[] n = new int[2];
		int ff  = a.length ;
		
		if (1 == a.length)
		{
			ff = 1;
			n[0] = a[0];
		} 
		else if (2 <= a.length)
		{
			ff = 2;
			n[0] = a[0];
			n[1] = a[1];
		}
			
		if (ff < 2 && 1 == b.length)
		{
			n[ff++] = b[0];
		}
		else if (ff < 2 && 2 <= b.length)
		{
			n[ff++] = b[0];
			if (ff < 2)
			{
				n[ff++] = b[1];
			}
		}    
		return n;
	}
}
