
public class TestOverriding1 {

	public static void main(String[] args) {
		
		//System.out.println(new Pen("blue",30));
		
		Pen p2 = new Pen("black",10);
		//System.out.println(p2);	
		show(p2);
		show(new String("lalala"));
		show(new StringBuffer("tararumppum"));
		/*
		 * TestOverriding1 obj = new TestOverriding1(); 
		 * String s = obj.toString();
		 * System.out.println(s);
		 * 
		 * System.out.println(new TestOverriding1());
		 */
		
	}
	public static void show(Object obj)
	{
		System.out.println(obj.toString());
	}

}
