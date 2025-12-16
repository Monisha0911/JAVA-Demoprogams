package day5;

@SuppressWarnings("serial")
class BookNotFoundException extends Exception 
{
    public BookNotFoundException(String message) 
    {
        super("Student not found");
    }
}
