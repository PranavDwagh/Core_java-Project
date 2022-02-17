package polymorphism.interference;

public class UserSellable {
	public static void main(String[] args) {

		//Sellable sellable = new Sellable();    // Interface object cannot be created
	 	
		Sellable sellable = new CD("Pranav", "Music", 100, 20, "Arjit");
		Sellable sellable2 = new Laptop("HP", 8, 512, "I5", 200);
		
	   sellable.setDiscount(20);
	   double p =sellable.getSellingPrice();
	   
	  System.out.println(sellable);
	  System.out.println(sellable2);
	   
	  System.out.println("Final Cost CD  :"+p);
	  
	   sellable2.setDiscount(10);
	   double d = sellable2.getSellingPrice();
	  
	   System.out.println("Final Cost Laptop : "+d);
		
		
	}
}
