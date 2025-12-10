package monisha;

public class Score 
{
	public void marks()
	{
		int sub1 = 10, sub2 = 20, sub3 = 30, sub4 = 40, sub5 = 50;
		int total=sub1+sub2+sub3+sub4+sub5;
		System.out.println(total);
		double percentage=total/500.0*100;
		System.out.println(percentage);
			
	}
	public static void main(String[] args)
	{
		Score score=new Score();
		score.marks();
	}
}