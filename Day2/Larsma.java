package day2;

public class Larsma {
	public static void main(String[] args) 
	{
		int[] arr = {3, 7, -2, 9, 5};
	    int min = arr[0];
	    int max = arr[0];
	    for (int num : arr) 
	    {
	    	if (num < min) min = num;
	        if (num > max) max = num;
	    }
	        System.out.println("Smallest: " + min);
	        System.out.println("Largest: " + max);
	    }

}
