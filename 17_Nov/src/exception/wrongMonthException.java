package exception;

public class wrongMonthException extends RuntimeException {
	
	public wrongMonthException()
	{
		super("Wrong Month...Enter Month in between 1 to 12");
	}

}
