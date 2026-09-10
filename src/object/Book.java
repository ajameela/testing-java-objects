package object;

public class Book {

	private String name;
	private String author;
	private int year;
	
	public Book() {
		this.name = "City of Bones";
		this.author = "Cassandra Clare";
		this.year = 2007;
	}

	public Book(String name, String author, int year) {
		this.name = name;
		this.author = author;
		this.year = year;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setYear(int year) {
		if (year >= 0)
			this.year = year;
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return "Book{name = " + name + " author = " + author + " year = " + year + "}";
	}
}