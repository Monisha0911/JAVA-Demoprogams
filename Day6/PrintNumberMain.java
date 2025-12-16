package day6;

public class PrintNumberMain 
{
	@SuppressWarnings("unused")
	public static void main(String[] args)throws InterruptedException
	{
	Thread thread=new Thread(new PrintNumber());
	{
		thread.start();
	}
}
}
