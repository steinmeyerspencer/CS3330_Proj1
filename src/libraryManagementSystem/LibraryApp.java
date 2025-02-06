package libraryManagementSystem;

import libraryManagementSystem.book.Book;

public class LibraryApp {

	public static void main(String[] args) {
		
		Book harryPotter = new Book("Harry Potter", "JK Rowling", "1", 20.0);
		
		System.out.println("Book title: " + harryPotter.getTitle());
		
//		Book lordOfTheRings = new Book("Lord of the Rings", "Tolkien", "1", 30.0);
		
		Book harryPotter2 = new Book(harryPotter);
		
		System.out.println(harryPotter.toString());
		
		
		if(harryPotter.equals(harryPotter2)) {
			System.out.println("You have two same books.");
		}
		else {
			System.out.println("You messed up");
		}
		
	}

}
