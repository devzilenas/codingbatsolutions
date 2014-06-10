package codingbat.string3;

public class CountYZ
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a string, count the number of words ending
	 * in 'y' or 'z' -- so the 'y' in "heavy" 
	 * and the 'z' in "fez" count,
	 * but not the 'y' in "yellow" (not case sensitive).
	 * We'll say that a y or z is at the end of a word
	 * if there is not an alphabetic letter immediately following
	 * it. (Note: Character.isLetter(char) tests if a char 
	 * is an alphabetic letter.)
	 *
	 * countYZ("fez day") → 2
	 * countYZ("day fez") → 2
	 * countYZ("day fyyyz") → 2
	 */
	public int countYZ(String str) 
	{
		int count = 0;
		char c    = '\u0000';
		for (int i=0; i < str.length(); i++)
		{
			c = str.charAt(i);
			if ( ('y' == c || 'z' == c || 'Z' == c || 'Y' == c)
			 && (i + 1 < str.length() && !Character.isLetter(str.charAt(i+1)) || i +1 == str.length()) )
			{
				count++;
			}
		}  
		return count;
	}
}
