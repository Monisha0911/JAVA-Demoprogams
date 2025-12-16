package day5;

@SuppressWarnings("serial")
class InvalidUsernameException extends Exception {
    InvalidUsernameException(String msg) {
        super(msg);
    }
}