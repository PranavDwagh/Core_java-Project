package study.exception;

public class TestFinally2 {

	public static void main(String[] args) {
		try {
			System.out.println("1");
			throw new NullPointerException();
		}
		finally
		{
			System.out.println("2");
		}
		
		//System.out.println("3");

	}

}
