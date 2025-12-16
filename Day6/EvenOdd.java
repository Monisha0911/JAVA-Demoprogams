package day6;

public class EvenOdd extends Thread
{
	int  start;
	EvenOdd(int start)
	{
		this.start=start;
	}
	public void run()
	{
		for(int i=start; i<=10; i+=2)
		{
			if(start==1)
			{
				System.out.println("ODD:"+i);
			}
			else
			{
				System.out.println("Even:"+i);
			}
		}
	}
}
