package generics;

public class MyGeneric {
	public static void main(String[] args) {

		Generics<Integer> generics = new Generics(new Integer [5]);
		
		generics.push(20);
		generics.push(30);
		generics.push(20);
		generics.push(10);
		generics.push(40);
		
		
		System.out.println(generics);
	}
}
