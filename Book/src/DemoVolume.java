
public class DemoVolume {

	public static void main(String[] args)
	{
		int numberOfBooks = 5;
		Book[] books = new Book[numberOfBooks];
		for(int i = 0 ; i < numberOfBooks; i++)
		{
			books[i] = new Book("Title" + i,"Author" + i, i*i+100);
		}
		Volume volume1 = new Volume("Volume1",numberOfBooks,books);
		System.out.println(volume1);
	}
}
