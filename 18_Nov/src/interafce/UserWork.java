package interafce;

public class UserWork {
	
	public static void main(String[] args) {
		
		//Iwork obj = new Iwork();  // interface object cannot be created
		Iplay obj = new ME();         // we can only create interface subclass object
		
		obj.play();
		obj.takeoff();
		
	}
	
}
