package Abstraction;

public class MainBank extends HdfcBank{

	
	public static void main(String[] args) {
		
		HdfcBank h1 = new HdfcBank();
		AxisBank a1 = new AxisBank();
		a1.openAccount();
		h1.openAccount();
		
	}
	
	

}
