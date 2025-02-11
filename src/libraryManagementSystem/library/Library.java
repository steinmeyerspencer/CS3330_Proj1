package libraryManagementSystem.library;
import libraryManagementSystem.book.Book;

public class Library {
	
	/**
	 * Initializing the class attributes
	 */
	private Book[] books;
	private int count;
	
	
	
	/**
	 * creating the class constructor with books fixed at 5
	 * @param count
	 */
	public Library(int count) {
		this.books = new Book[5];
		this.count = count;
	}
	
	
	/**
	 * method AddBook that adds the book that is included as an argument when method is called if their 
	 * are available slots in the books array
	 * @param book
	 * @return
	 */
	public boolean addBook(Book book) {
		for(int i = 0; i < books.length - 1; i++) {
			if(books[i] == null) {
				books[i] = book;
				return true;
			}
			
		}
		return false;
	}
	
	
	/**
	 * method that removes book if it exists
	 * @param book
	 * @return
	 */
	public boolean removeBook(Book book) {
		for(int i = 0; i < books.length - 1; i++) {
			if(books[i].getISBN() == books[i].getISBN()) {
				books[i] = null;
				System.out.println("Book has been removed.");
				return true;
			}
		}
		System.out.println("Book could not be found.");
		return false;
	}
	
	
	
	/**
	 * method that searches for the book based on ISBN. Returns the book if found, returns null
	 * if not found
	 * @param book
	 * @return
	 */
	public Book searchByISBN(Book book) {
		for(int i = 0; i < books.length - 1; i++) {
			if(books[i].getISBN() == book.getISBN()) {
				return book;
			}
		}
		return null;
	}
	
	
	
	/**
	 * Method that prints the information of all the books in books[]
	 */
	public void displayBooks() {
		for(int i = 0; i < books.length - 1; i++) {
			if(books[i] != null) {
				System.out.println(books[i].toString());
			}
		}
	}
	
	
	
	
	
	
	
}
