package Inheritance;

public class Vehicle extends Engine {
	
	public String name;
	public String brand;
	public String number;
	public Engine engine;
	public Vehicle() {
		super();
	}
	public Vehicle(String name, String brand, String number, Engine engine) {
		super();
		this.name = name;
		this.brand = brand;
		this.number = number;
		this.engine = engine;
	}
	
	
	public void display() {
		
		System.out.println(name+brand+number);
		System.out.println(engine.engineCC+engine.engineModel+engine.engineRPM);
	}
	
	
	

}
