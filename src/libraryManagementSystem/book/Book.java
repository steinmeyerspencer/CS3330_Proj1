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
	 * This is a parameterized constructor for creating a book
	 * @param title
	 * @param author
	 * @param ISBN
	 * @param price
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}

	/**
	 * Copy constructor. Takes parameters of Book type parameter and creates a new book with same parameters
	 * @param book
	 */
	public Book(Book book) {
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.ISBN = book.getISBN();
		this.price = book.getPrice();
	}
	
	@Override
	public String toString() {
		return title + " by " + author +  " (ISBN: " + ISBN + ", $" + price + ")";
		//return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", price=" + price + "]";
	}
	
	/**
	 * takes a book as a parameter, and checks if it has the same ISBN as the book that we are 
	 * running the function on, if ISBN is equal, returns true. else, returns false
	 * @param other
	 * @return
	 */
	@Override
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
		Book book = (Book)other;
		if (this.ISBN == book.getISBN()) {
			return true;
		}
		else {
			return false;
		}
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

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
}
