package day5;

@SuppressWarnings("serial")
public class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

 @SuppressWarnings("serial")
class LimitExceededException extends Exception {
    public LimitExceededException(String message) {
        super(message);
    }
}

