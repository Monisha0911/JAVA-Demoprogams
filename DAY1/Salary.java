package monisha;

public class Salary 
{
	double finalsalary;
	public void increment()
	{
		double salary= 50000.0;
		double bonusPercentage= 10.0;
		finalsalary= salary+(salary*bonusPercentage/100);
	}
	public static void main(String[] args)
	{
		Salary salary=new Salary();
		salary.increment();
		System.out.println("Salary increment amount: "+salary.finalsalary);
	}
}
