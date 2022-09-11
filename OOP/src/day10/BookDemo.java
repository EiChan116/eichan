package day10;

import java.time.LocalDate;

public class BookDemo {

	public static void main(String[] args) {
		LocalDate publishDate = LocalDate.of(1986, 10, 16);
		Book book1 = new Book("Detetive U San Shar", publishDate, 6500);
		
		System.out.println("Book1: " + book1);
		
		//copying
		var book2 = new Book(book1);
		System.out.println();
		System.out.println("Book2: " + book2);

	}

}
