package day5;

public class UsernameTest {
    public static void main(String[] args) {

        String username = "abc";   // input

        try {
            if (username.contains(" ") || username.length() < 1) {
                throw new InvalidUsernameException("Invalid Username");
            }
            System.out.println("Registration successful");

        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        }
    }
}



