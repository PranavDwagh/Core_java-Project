package scopes;


public class UserSuperClass  {
	public static void main(String[] args) {

		SuperClass.protectedFunofSuperClass();  // protected method available within package and extended class
		SuperClass.publicFunofSuperClass();   // public method available everywhere within the class
		SuperClass.defaultFunofSuperClass();  // default method accessible within package 
//		SuperClass.privateFunofSuperClass();  // not accessible outside the class
		
//		child c = new child();
		
	}
}
