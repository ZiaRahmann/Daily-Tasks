package Inheritance;

public class Hotel {

	public String hotelName;
	public String hotelId;
	public FoodMaterials foodmaterails ;
	
	
 Hotel(String hotelName,String hotelId,FoodMaterials foodMaterials){
	
		this.hotelName = hotelName;
		this.hotelId = hotelId;
		this.foodmaterails = foodMaterials;
	}	
	
 void display() {
	 System.out.println(hotelId+" "+hotelName+" "+foodmaterails.vegetables+" "+foodmaterails.meat+" "+foodmaterails.curd);
 }
 public static void main(String[] args) {
	 FoodMaterials fm = new FoodMaterials("Tomato", "RedMeat", "MotherDairy");
	Hotel h1 = new Hotel("Capital","025",fm);
	h1.display();
	
}
}
