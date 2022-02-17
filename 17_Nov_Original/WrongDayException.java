package study.exception;

//UNCHECKED EXCEPTIOn
public class WrongDayException extends RuntimeException{

		public WrongDayException() {
				super("Areey please enter date between 1 and 31 only");
		}
}
