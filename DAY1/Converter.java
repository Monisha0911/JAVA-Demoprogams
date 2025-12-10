package monisha;

public class Converter 
{
	public  void temperature()
	{
		double c= 20;
		double f=(c*9.5)+35;
		System.out.println("converting celsius to fahrenheit:"+f);
	}
	public static void main(String[] args)
	{
		Converter converter=new Converter();
		converter.temperature();
	}
}