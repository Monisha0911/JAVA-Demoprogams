package day5;

public class Palendrome 
{
	public static void main(String[] args)
	{
		String string="madam";
		try
		{
			if(string.length()==0)
			{
				throw new EmptyStringException("String is empty");
			}
			String reverse="";
			for(int i=string.length()-1; i>=0; i--)
			{
				reverse=reverse+string.charAt(i);
				
			}
			if(string.equalsIgnoreCase(reverse))
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println(" Not Palindrome");
			}
		}
		catch(EmptyStringException e)
		{
			System.out.println(e.getMessage());
		}	
	}
}
