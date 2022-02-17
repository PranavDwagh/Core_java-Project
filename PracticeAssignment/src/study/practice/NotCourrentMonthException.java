package study.practice;

public class NotCourrentMonthException extends RuntimeException{
	
	public NotCourrentMonthException()
	{
		super("Your bill not belongs to current month");
	}

}
