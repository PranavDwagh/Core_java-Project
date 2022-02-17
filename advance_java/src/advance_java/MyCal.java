package advance_java;
import cal.*;

public class MyCal {
	public static void main(String[] args) {
		
		Calculator cal = new MyCalculator();
		
		int a = cal.add(10, 20);
		float b = cal.div(20, 10);
		
		System.out.println("addition :"+a);
		System.out.println("division :"+ b);
		
	}

}
