package study;

public class TestWrapperClass2 {

	public static void main(String[] args) {
		String s1 = "12.56";
		String s2 = "13.1";
		double sum = Double.parseDouble(s1) + Double.parseDouble(s2); 
		System.out.println(sum);
		
		
		boolean ans = Character.isDigit('L');
				ans = Character.isLetter('a');
				ans = Character.isUpperCase('a');
		System.out.println(ans);

	}

}
