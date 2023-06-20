package Abstraction;

public class Walk extends Exercise{

	
@Override
void walk() {
System.out.println("Let's Start Walking..");	
}

public static void main(String[] args) {
	
	Walk w = new Walk();
	w.walk();
}

	
}
