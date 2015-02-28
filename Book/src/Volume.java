
public class Volume 
{
	
	private String volumeName;
	private int numberOfBooks;
	private Book[] books;
	
	/**
	 * 
	 * @param volumeName the name of the current volume
	 * @param numberOfBooks number of books with same title published untill now
	 * @param books all previews volumes
	 */
	public Volume(String volumeName, int numberOfBooks, Book[] books)
	{
		this.volumeName = volumeName;
		this.numberOfBooks = numberOfBooks;
		this.books = books;
	}
	/**
	 * Display properties of Volume class 
	 */
	public String toString()
	{
		String s = "Volume Name: " + volumeName + " " + "Number of Books: " + numberOfBooks + "\n";

		s = s + getBookArray();
		return s;
	}
	/**
	 * 
	 * @return a string of book properties for each book
	 */
	public String getBookArray()
	{
		String s = "";
		for(int i = 0 ; i < books.length; i++)
			s = s + books[i] + "\n";
		return s;
		}
}
