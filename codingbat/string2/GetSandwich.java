package codingbat.string2;

public class GetSandwich
{
	public static void main(String[] args) 
	{
	}

	/**
	 * A sandwich is two pieces of bread with something in between.
	 * Return the string that is between the first and last
	 * appearance of "bread" in the given string,
	 * or return the empty string "" if there are not two pieces
	 * of bread.
	 *
	 * getSandwich("breadjambread") → "jam"
	 * getSandwich("xxbreadjambreadyy") → "jam"
	 * getSandwich("xxbreadyy") → ""
	 */
	public String getSandwich(String str)
	{
		int    blpos    = str.indexOf("bread"); 
		int    brpos    = 0                   ;      
		String sandwich = ""                  ;
		
		if (-1 < blpos && blpos + "bread".length() < str.length() )
		{

			brpos = str.substring(blpos + "bread".length()).lastIndexOf("bread");	

			if (-1 < brpos)
			{
				sandwich = str.substring(blpos + "bread".length(), blpos + "bread".length() + brpos);
			}
		}       
		return sandwich;
	}
}
