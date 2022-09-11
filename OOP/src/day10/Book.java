package day10;

import java.time.LocalDate;

public class Book {
	String title;
	LocalDate publishDate;
	int price;
	public Book(String title, LocalDate publishDate, int price) {
		super();
		this.title = title;
		this.publishDate = publishDate;
		this.price = price;
	}
	
	//copy constructor
	public Book(Book other) {//it creates using existing constructor
		this.title = other.title;
		this.publishDate = other.publishDate;
		this.price = other.price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", publishDate=" + publishDate + ", price=" + price + "]";
	}
	
}
