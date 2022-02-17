package lambda;

public class ExampleInnerOuterClass {

	public static void main(String[] args) {
		
		TheOuter obj = new TheOuter();     // OuterClass Object created
		
		TheOuter.TheInner obj2 = new TheOuter().new TheInner();   // Inner Class Object Created 
											  // without outer class object inner class object cannot be created 
			
	}//end of main
	
	
}// end of class


class TheOuter {
	
	int x=20;
	
	public void display()
	{
		//System.out.println(x +""+y); // here inner class variable not accessible outside directly
		TheInner in = new TheInner();
		System.out.println(x +""+in.y); // but with object we can access inner class variable outside
	}
	
	class TheInner{
		int y=50;
		
		public void show()
		{
			System.out.println(x); // outer class all methods and variable are accessible in inner class
			System.out.println(y);
		}
		
	}
	
	
}