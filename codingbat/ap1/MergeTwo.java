package codingbat.ap1;

public class MergeTwo
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Start with two arrays of strings, A and B, 
	 * each with its elements in alphabetical order and without 
	 * duplicates. Return a new array containing the first N
	 * elements from the two arrays. The result array should be
	 * in alphabetical order and without duplicates.
	 * A and B will both have a length which is N or more.
	 * The best "linear" solution makes a single pass over A and B,
	 * taking advantage of the fact that they 
	 * are in alphabetical order, copying elements directly
	 * to the new array.
	 *
	 * mergeTwo({"a", "c", "z"}, {"b", "f", "z"}, 3) → {"a", "b", "c"}
	 * mergeTwo({"a", "c", "z"}, {"c", "f", "z"}, 3) → {"a", "c", "f"}
	 * mergeTwo({"f", "g", "z"}, {"c", "f", "g"}, 3) → {"c", "f", "g"}
	 */
	public String[] mergeTwo(String[] a, String[] b, int n)
	{
		int ia    = 0;
		int ib    = 0;
		
		String[] ret = new String[n];
		
		for (int count = 0; count < n;)
		{
			if (a[ia].compareTo(b[ib]) < 0)
			{
				ret[count] = a[ia];
				ia++;
				count++;
			}
			else if (a[ia].compareTo(b[ib]) > 0)
			{
				ret[count] = b[ib];
				ib++;
				count++;
			}
			else
			{
				ret[count] = a[ia];
				ia++;
				ib++;
				count++;
			}
		}
		return ret;
	}
}
