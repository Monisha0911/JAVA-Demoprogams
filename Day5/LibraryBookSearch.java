package day5;

public class LibraryBookSearch 
{
	static void searchBook(Book[] books, String searchTitle) throws BookNotFoundException
	{
			for(Book book:books)
			{
				if(book.title.equalsIgnoreCase(searchTitle))
				{
					System.out.println("Book Found");
					book.display();
					return;
				}
			}
				throw new BookNotFoundException("Book with title:" +searchTitle+"not found:");
			}
			public static void main(String[] args)
			{
				Book[] book= 
					{
							new Book(123,"asd"),
							new Book(124,"acd"),
							new Book(125,"dte")
					};
				try
				{
					searchBook(book,"dte");
			}
				catch(BookNotFoundException e)
				{
					System.out.println(e.getMessage());
				}
		}
}
