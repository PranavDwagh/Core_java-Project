package study;

public class TestWrapperClass3 {
	public static void main(String[] args) {
		
		//BOXING
		Integer i1 = new Integer(23);
		Double d2 = new Double(23.45);
		
		int x = i1.intValue();  //UNBOXING 
		int square =  x*x;
		System.out.println(square);
		double d1 = d2.doubleValue();  //UNBOXING
		System.out.println(d1);
		
		//AUTOBOXING  AUTOUNBOXING 
		Integer i2 = 23; //AUTOBOXING - internally new Integer(23)
		
		square = i2 * i2; //AUTOUNBOXING - internally i2.intValue() 
		
		
		 Long l = 15000L; //this is an object
		 

		 Integer i1 = new Integer(20);           // result will be different
			Integer i2 = new Integer(20);
			
			if(i1 == i2)
			{
				System.out.println("Same address");
			}
			else
			{
				System.out.println("Different Address");
			}
			
		 // if  Integer i1 = 20;
		//	Integer i2 = 20;     // both made up of using literals then both address will be same
		 
		//	Integer i1 = new Integer(20);    // both address will be always different as new keyword creating new object each time
		//	Integer i2 = new Integer(20);
		 
		/*
		 * if(i1==i2) System.out.println("same address"); else
		 * System.out.println("differet objects");
		 */
	}

}




