package codingbat.logic2;

public class MakeChocolate
{
	public static void main(String[] args) 
	{
	}

	/**
	 * We want make a package of goal kilos of chocolate.
	 * We have small bars (1 kilo each) and
	 * big bars (5 kilos each). Return the number of small bars
	 * to use, assuming we always use big bars before small bars.
	 * Return -1 if it can't be done.
	 *
	 * makeChocolate(4, 1, 9) → 4
	 * makeChocolate(4, 1, 10) → -1
	 * makeChocolate(4, 1, 7) → 2
	 */
	public int makeChocolate(int small, int big, int goal) 
	{
		int ubb = goal / 5;  
		int usb = goal - ubb*5;
		
		int sbtr = goal - (big <= ubb ? big : ubb) * 5;
		
		return sbtr <= small ? sbtr : -1 ;    
	}
}
