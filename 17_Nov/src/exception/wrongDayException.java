package exception;

public class wrongDayException extends RuntimeException {
	
	public wrongDayException()
	{
		super("Wrong Day....Enter Day in between 1 to 31");
	}
	
	

}
