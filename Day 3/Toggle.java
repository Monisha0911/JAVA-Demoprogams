package day3;

public class Toggle {
	public static void main(String[] args)
	{
		String string="MOniSHa";
		String result="";
		for(int i=0;i<string.length();i++)
		{
			char ch=string.charAt(i);
			if(Character.isUpperCase(ch))
			{
				result+=Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch))
			{
				result+=Character.toUpperCase(ch);
			}
			else
			{
				result+= ch;
			}
		}

System.out.print(result);
}
}