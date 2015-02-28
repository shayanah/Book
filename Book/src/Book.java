
public class Book {

	private String title;
	private String author; 
	private int numberOfPages;
	
	/**
	 * 
	 * @param title the title of the book
	 * @param author one who has written the book
	 * @param numberOfPages book's total pages
	 */
	public Book(String title, String author, int numberOfPages)
	{
		this.title=title;
		this.author=author;
		this.numberOfPages=numberOfPages;
	}
	/**
	 * Display the properties of Book class
	 */
	public String toString()
	{
		return "Title: " + title + " " + "Author: " + author + " " + "Number of Pages: " + numberOfPages; 
	}
	
	
}
