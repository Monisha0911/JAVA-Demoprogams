package day3;

import java.util.Scanner;

public class RemoveSpecific {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = scanner.next().charAt(0);

        String result = string.replace(Character.toString(ch), "");

        System.out.println("Result: " + result);
        scanner.close();
    }
}
