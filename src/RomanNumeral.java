
public class RomanNumeral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public int romanToDecimal(String roman)
	{
		int total=0;
		int count=0;
		char lookAhead=' ';

		while (count < roman.length())
		{
			if (count< roman.length()-1)
			{
				lookAhead=roman.charAt(count+1);
			}
			if (roman.charAt(count)=='i')
			{
				if((lookAhead=='v')||(lookAhead=='x'))
				{
					total-=2;
				}
				total++;
			}
			if (roman.charAt(count)=='v')
			{
				total+=5;
			}
			if (roman.charAt(count)=='x')
			{
				if((lookAhead=='c'))
				{
					total-=20;
				}
				total+=10;		
			}
			if (roman.charAt(count)=='l')
			{
				total+=50;
			}
			if (roman.charAt(count)=='c')
			{
				if((lookAhead=='m'))
				{
					total-=200;
				}
				total+=100;		
			}
			if (roman.charAt(count)=='d')
			{
				total+=500;
			}
			if (roman.charAt(count)=='m')
			{
				total+=1000;
			}
			count++;
		}

		return total;
	}
}