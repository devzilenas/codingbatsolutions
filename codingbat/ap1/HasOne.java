package codingbat.ap1;

public class HasOne
{
	public static void main(String[] args) 
	{
	}

	/**
	 * Given a positive int n, return true if it contains a 1 digit.
	 * Note: use % to get the rightmost digit, 
	 * and / to discard the rightmost digit.
	 *
	 * hasOne(10) → true
	 * hasOne(22) → false
	 * hasOne(220) → false
	 */
	public boolean hasOne(int n)
	{
		int tmp = n;
		boolean has = false;
		if (1 == tmp || 10 == tmp)
		{
			has = true;        
		}
		else
		{
			while (0 != tmp / 10)
			{
				if (1 == tmp % 10)
				{
					has = true;
					break;
				}
				else
				{
					tmp = tmp / 10;
				}
			}
		}
		return has;
	}
}
