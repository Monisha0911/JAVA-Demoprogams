package day3;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Hello World Java Program";
        String result = str.replaceAll(" ", "");
        System.out.println(result);
    }
}