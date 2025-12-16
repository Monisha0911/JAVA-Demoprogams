package day5;

	public class CharacterCounter {

	    public static int countCharacter(String text, char target) {
	        if (text == null) {
	            throw new NullPointerException("Input string cannot be null");
	           
	        }

	        int count = 0;

	        for (char character : text.toCharArray()) {
	            if (character == target) {
	                count++;
	            }
	        }

	        if (count == 0) {
	            System.out.println("Character '" + target + "' not found in the string.");
	        }

	        return count;
	    }
	}
