package object;

public class BookTester {
	public static void main(String[] args) {
		Book book1 = new Book();
		System.out.println(book1);
		
		Book book2 = new Book("Marked", "Kristin Cast", 2007 );
		System.out.println(book2);
		
	}

}
