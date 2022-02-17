package scopes2;

import scopes.SuperClass;

public class user2 extends SuperClass {
	
	public static void main(String[] args) {
		
		SuperClass obj = new SuperClass(); 
		
		obj.publicFunofSuperClass();   //public methods are available everywhere(within project)  
		obj.protectedFunofSuperClass(); // out of the package protected method only available if 
										// it extends the same class where it defines
	}
}
