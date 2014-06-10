package codingbat.ap1;

public class CommonTwo
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Start with two arrays of strings, a and b, 
	 * each in alphabetical order, possibly with duplicates.
	 * Return the count of the number of strings which appear
	 * in both arrays. The best "linear" solution makes a single
	 * pass over both arrays, taking advantage of the fact
	 * that they are in alphabetical order.
	 *
	 * commonTwo({"a", "c", "x"}, {"b", "c", "d", "x"}) → 2
	 * commonTwo({"a", "c", "x"}, {"a", "b", "c", "x", "z"}) → 3
	 * commonTwo({"a", "b", "c"}, {"a", "b", "c"}) → 3
	 */
	public int commonTwo(String[] a, String[] b)
	{
		int count = 0;
		int ia    = 0;
		int ib    = 0;
		String dup = "";
		
		while (ia < a.length && ib < b.length)
		{        
			if (a[ia].compareTo(b[ib]) < 0)
			{
				ia++;
			}
			else if (a[ia].compareTo(b[ib]) > 0)
			{
				ib++;
			}
			else
			{
				dup = a[ia];
				count++;
				while (ia < a.length && a[ia].equals(dup))
				{
					ia++;
				}
				while (ib < b.length && b[ib].equals(dup))
				{
					ib++;
				}
			}        
		}
		return count;
	}
}
