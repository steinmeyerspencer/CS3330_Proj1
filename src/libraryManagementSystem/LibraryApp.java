package libraryManagementSystem;

import libraryManagementSystem.book.Book;
import libraryManagementSystem.library.Library;

public class LibraryApp {

	public static void main(String[] args) {
		
		// INITILIAZE AND ADD THREE BOOKS TO LIBRARY
		
		Library library = new Library();
		
		Book harrypotter = new Book("Harry Potter", "JK Rowling", "1.0", 30.0);
		
		library.addBook(harrypotter);
		
		Book lordoftherings = new Book("Lord of the Rings", "Tolkien", "2.0", 35.0);
		
		library.addBook(lordoftherings);
		
		Book catinthehat = new Book("Cat in the Hat", "Dr. Suess", "3.0", 36.0);
		
		library.addBook(catinthehat);
		
		// SEARCH FOR A BOOK BY ISBN
		
		System.out.println(library.searchByISBN("1.0"));
		
		// REMOVE BOOK THAT EXISTS
		System.out.println("\nRemoving Book");
		library.displayBooks();
		library.removeBook(catinthehat);
		
		library.displayBooks();
		
		// REMOVE BOOK THAT DOESN'T EXIST
		System.out.println("\nRemoving Book That Doesn't Exist");
		library.removeBook(catinthehat);
		
		library.displayBooks();
		
	}

}
