package codingbat.ap1;

public class WordsFront
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given an array of strings, return a new array 
	 * containing the first N strings. 
	 * N will be in the range 1..length.
	 *
	 * wordsFront({"a", "b", "c", "d"}, 1) → {"a"}
	 * wordsFront({"a", "b", "c", "d"}, 2) → {"a", "b"}
	 * wordsFront({"a", "b", "c", "d"}, 3) → {"a", "b", "c"}
	 */
	public String[] wordsFront(String[] words, int n)
	{
		String[] arr = new String[n];
		for (int i = 0 ; i < n ; i++)
		{
			arr[i] = words[i];
		}  
		return arr;
	} 
}	
