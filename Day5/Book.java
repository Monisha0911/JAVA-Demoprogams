package day5;

public class Book 
{
	int id;
    String title;
    Book(int id, String title) 
    {
        this.id = id;
        this.title = title;
}
	public void display() {
		System.out.println("Id:" +id);
		System.out.println("Name:" +title);
		
	}
}
