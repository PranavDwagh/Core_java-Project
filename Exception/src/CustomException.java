import java.util.Scanner;

public class CustomException {
	
	public static void main(String[] args) {
		
		int x = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		x = sc.nextInt();
		
		try
		{
			if (x>5)
				throw new OutofRangeExecption();		
		}
		catch (OutofRangeExecption e) {
			System.out.println(e);
		}
	}

}

class OutofRangeExecption extends Exception
{
	public OutofRangeExecption()
	{
		super("Out of Range");
	}
}
