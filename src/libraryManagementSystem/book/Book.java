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
	 * This is a parametrized constructor to set all attributes
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
}
