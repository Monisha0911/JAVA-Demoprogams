package day2;

public class fibonacci {
	public static void main(String[] args)
	{
		int number=10;
		int value1=0, value2=1;
		System.out.println("value1="+value1+"value2"+value2);
		for(int i=3; i<number;i++)
		{
			int value3=value1+value2;
			System.out.println("value3="+value3);
			value1=value2;
			value2=value3;
		}
	}
}
