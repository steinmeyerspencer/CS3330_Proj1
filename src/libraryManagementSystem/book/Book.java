package libraryManagementSystem.book;

public class Book {
	
	/**
	 * Initializing the four attributes title, author, ISBN
	 * and price.
	 */
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	/**
	 * This is a constructor setting title, author, ISBN to "Unknown" and price to 0.0
	 */
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	/**
	 * This is a parameterized constructor to set all attributes
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	public Book(Book book) {
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.ISBN = book.getISBN();
		this.price = book.getPrice();
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
}
