package day3;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            result += new StringBuilder(word).reverse().toString() + " ";
        }

        System.out.println("Reversed words: " + result.trim());
        scanner.close();
    }
}
