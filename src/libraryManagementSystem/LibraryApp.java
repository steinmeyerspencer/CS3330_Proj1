package libraryManagementSystem;

import libraryManagementSystem.book.Book;
import libraryManagementSystem.library.Library;

public class LibraryApp {

	public static void main(String[] args) {
		
		Library library = new Library(0);
		
		Book harrypotter = new Book("Harry Potter", "JK Rowling", "1.0", 30.0);
		
		library.addBook(harrypotter);
		
		Book lordoftherings = new Book("Lord of the Rings", "Tolkien", "2.0", 35.0);
		
		library.addBook(lordoftherings);
		
		Book catinthehat = new Book("Cat in the Hat", "Dr. Suess", "2.0", 36.0);
		
		library.addBook(catinthehat);
		
		
		
		
	}

}
