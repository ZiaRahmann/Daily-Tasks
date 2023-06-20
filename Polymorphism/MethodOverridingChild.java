package Polymorphism;

public class MethodOverridingChild extends Father {
	
	void display() {
		System.out.println("No..!! I want to become a Software Engineer.");
	}
	
	public static void main(String[] args) {
	
		MethodOverridingChild moc = new MethodOverridingChild();
		moc.display();
		
	}
	
	
	
	
}
