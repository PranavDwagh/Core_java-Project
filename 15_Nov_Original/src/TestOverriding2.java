package study.polymorphism;

public class TestOverriding2 {
	public static void main(String[] args) {
		Pen p1 = new Pen("blue",30);
		Pen p2 = new Pen("blue",30);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		boolean result = p1.equals(p2);
		if(result)
			System.out.println(p1 +" is same as "+p2);
		else
			System.out.println(p1+ " is different from "+p2);
		
	}

}
