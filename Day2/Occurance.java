package day2;

public class Occurance 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,2,3,1,2};
		int number1=3;
		int leftNumber=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != number1) 
			{
				arr[leftNumber++]=arr[i];
				}
			}
		for(int i=0;i<leftNumber;i++)
		{
			System.out.print(arr[i]+" ");
		}
		}
}
