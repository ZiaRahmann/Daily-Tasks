package Inheritance;

public class BookMain extends Book {
public static void main(String[] args) {
	
	Employee employee = new Employee("Zia",1,"8341934186");
	
	Book b1 = new Book("DE1","Comic Story","Johnson","2022","250",employee);
	
	employee.view();
	b1.show();
}
}
