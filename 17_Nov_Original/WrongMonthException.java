package study.exception;

//CHECKED EXCEPTIOn
public class WrongMonthException extends Exception {
	
	public WrongMonthException() {
	   super("Maloom nahi kya month should be between 1 and 12 ");
	}

}
