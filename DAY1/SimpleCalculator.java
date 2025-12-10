package monisha;

public class SimpleCalculator 
{
	int value1=10;
	int value2=25;
		public void add()
		{
			int result=value1+value2;
			System.out.println("Addition="+result);
		}
		void sub()
		{
			int result=value1-value2;
			System.out.println("Subtraction="+result);
		}
		void mult()
		{
			int result=value1*value2;
			System.out.println("Multiplication="+result);
		}
		void div()
		{
			int result=value1/value2;
			System.out.println("Divisio="+result);
		}
		public static void main(String[] args)
		{
		SimpleCalculator simplecalculator=new SimpleCalculator();
	
		simplecalculator.add();
		simplecalculator.sub();
		simplecalculator.mult();
		simplecalculator.div();
		}
	
}
