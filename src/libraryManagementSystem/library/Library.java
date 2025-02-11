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
	public Library() {
		this.books = new Book[5];
		this.count = 0;
	}
	
	
	/**
	 * method AddBook that adds the book that is included as an argument when method is called if their 
	 * are available slots in the books array
	 * @param book
	 * @return
	 */
	public boolean addBook(Book book) {
		System.out.println("Adding books...");
		for(int i = 0; i < books.length - 1; i++) {
			if(books[i] == null) {
				books[i] = book;
				count++;
				System.out.println("Book added successfully.");
				return true;
			}
			
		}
		System.out.println("Library is full");
		return false;
	}
	
	
	/**
	 * method that removes book if it exists
	 * @param book
	 * @return
	 */
	public boolean removeBook(Book book) {
		for(int i = 0; i < books.length - 1; i++) {
			if (book == null) {
				return false;
			}
			if(book.equals(books[i])) {
				System.out.println("\nRemoving book: " + books[i]);
				books[i] = null;
				count--;
				return true;
			}
		}
		System.out.println("Cannot remove book '" + book + "', book doesn't exist");
		return false;
	}
	
	
	
	/**
	 * method that searches for the book based on ISBN. Returns the book if found, returns null
	 * if not found
	 * @param book
	 * @return
	 */
	public Book searchByISBN(String ISBN) {
		System.out.println("Searching for book with ISBN: " + ISBN);
		for(int i = 0; i < books.length - 1; i++) {
			if(books[i].getISBN() == ISBN) {
				System.out.println("Book found: " + books[i]);
				return books[i];
			}
		}
		return null;
	}
	
	
	
	/**
	 * Method that prints the information of all the books in books[]
	 */
	public void displayBooks() {
		System.out.println("All books in the library: ");
		for(int i = 0; i < books.length - 1; i++) {
			if(books[i] != null) {
				System.out.println((i+1) + ". " + books[i].toString());
			}
		}
	}
	
	
	
	
	
	
	
}
