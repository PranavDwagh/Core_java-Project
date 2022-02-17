package study.practice;

public class UserQ1 {
	public static void main(String[] args) {

		Example.sample1();  // static method of Example
		
		Example example = new Example();
		
		example.sample2();   // non static method must call with object
		
	}
}
