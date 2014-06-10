package codingbat.logic2;

public class BlackJack
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given 2 int values greater than 0,
	 * return whichever value is nearest to 21 without going over.
	 * Return 0 if they both go over.
	 *
	 * blackjack(19, 21) → 21
	 * blackjack(21, 19) → 21
	 * blackjack(19, 22) → 19
	 */
	public int blackjack(int a, int b)
	{
		int ret = 0;    
		if (a > 21 && b > 21)
		{
			ret = 0;
		}
		else if (b > 21 || 21 - a < 21 - b && a <= 21)
		{
			ret = a;
		}
		else if (a > 21 || 21 - b < 21 - a && b <= 21)
		{
			ret = b;
		}
		return ret;
	}
}
