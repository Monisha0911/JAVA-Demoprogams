package day5;

public class PasswordStrengthCheckerMain {
    public static void main(String[] args) {
        try {
            PasswordStrengthChecker.checkPassword("Test1234");
            PasswordStrengthChecker.checkPassword("weakpass");
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}

