package day5;

public class MarksheetMain {
    public static void main(String[] args) {
        try {
            int[] marks = {85, 78, 92, 66, 88};
            Marksheet ms = new Marksheet(marks);

            System.out.println("Percentage: " + ms.calculatePercentage());
            ms.printGrade();

        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}

