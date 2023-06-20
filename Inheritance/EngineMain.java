package Inheritance;

public class EngineMain {

	
	public static void main(String[] args) {
		
		Engine e1 = new Engine("2023JET","300RPM","3000CC");
		
		Vehicle v1 = new Vehicle("Activa","Honda","12345",e1);
		EngineMain em = new EngineMain();
	    v1.display();
	}
	
}
