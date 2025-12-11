package day2;

public class Seclar {
	public static void findSecondSmallestLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        Integer smallest = Integer.MAX_VALUE;
        Integer secondSmallest = Integer.MAX_VALUE;

        Integer largest = Integer.MIN_VALUE;
        Integer secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE)
            System.out.println("No second smallest element (duplicates only).");
        else
            System.out.println("Second Smallest = " + secondSmallest);

        if (secondLargest == Integer.MIN_VALUE)
            System.out.println("No second largest element (duplicates only).");
        else
            System.out.println("Second Largest = " + secondLargest);
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 2, 7, 5};
        findSecondSmallestLargest(arr);
    }

}
