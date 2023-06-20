package Polymorphism;

public class MethodOverloading {

	void contact(int a, int b) {
		System.out.println(a+" "+b);
	}
	void contact(int a, int b, int c) {
		System.out.println(a+" "+b+" "+c);
	}
	void contact(int a, String b) {
		System.out.println(a+" "+b);
	}
	void contact(int a, char e) {
		System.out.println(a+" "+e);
	}
	void contact(String a, String b) {
		System.out.println(a+" "+b);
	}
	void contact(boolean a, boolean b) {
		System.out.println(a+" "+b);
	}
	
	
public static void main(String[] args) {
	
	MethodOverloading m1 = new MethodOverloading();
	
	m1.contact(5, 10);
	m1.contact(2, 5, 7);
	m1.contact(9, "Nine");
	m1.contact(11,'A');
	m1.contact("Hello", "World");
	m1.contact(true, false);
	
	
}
	
}
