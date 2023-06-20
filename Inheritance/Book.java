package Inheritance;

public class Book extends Employee {

	public String bookId;
	public String bookName;
	public String author;
	public String edition;
	public String price;
	public Employee emp;
	public Book() {
		super();
	}
	public Book(String bookId, String bookName, String author, String edition, String price, Employee emp) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.edition = edition;
		this.price = price;
		this.emp = emp;
	}
	void show() {
		System.out.println(bookId+" "+bookName+" "+author+" "+edition+" "+price);
	}
	
	
}
