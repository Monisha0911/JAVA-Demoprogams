package day5;

public class CharacterMain {
    public static void main(String[] args) {
        try {
            int result = CharacterCounter.countCharacter("hello world", 'o');
            System.out.println("Count: " + result);

            CharacterCounter.countCharacter("hello", 'x');
            CharacterCounter.countCharacter(null, 'a');

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}

