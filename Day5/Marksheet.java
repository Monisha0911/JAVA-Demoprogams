package day5;

public class Marksheet {

    private int[] marks = new int[5];

    public Marksheet(int[] marks) throws InvalidMarksException {
        if (marks.length != 5) {
            throw new InvalidMarksException("Exactly 5 subject marks are required");
        }

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                throw new InvalidMarksException("Invalid marks at subject " + (i + 1));

            }
            this.marks[i] = marks[i];
        }
    }

    public double calculatePercentage() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return (total / 500.0) * 100;
    }

    public void printGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 75) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}

