package day3;

public class Duplicate 
{
	public static void main(String[] args)
	{
		String string="I and I you will";
		String[] words=string.split(""); 
		String result="";
		for(int i=0;i<words.length;i++)
		{
			boolean found=false;
			for(int j=0;j<i;j++)
			{
				if(words[i].equals(words[j]))
				{
					found=true;
					break;
				}
					
			}
			if(!found)
			{
				if(!result.isEmpty())
				{
					result+="";
				}
				
				result+= words[i];
			}
			}
		System.out.print(result.trim());
		}

	}

