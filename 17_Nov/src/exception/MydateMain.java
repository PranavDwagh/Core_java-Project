package exception;

public class MydateMain {
	public static void main(String[] args) {
		
		Mydate mydate = new Mydate(40, 13, 2021);
		System.out.println(mydate);
		
		Mydate mydate2 = new Mydate();
		mydate2.setDate(220);
		mydate2.setMonth(112);
		mydate2.setYear(2021);
		System.out.println(mydate2);
	}
}
