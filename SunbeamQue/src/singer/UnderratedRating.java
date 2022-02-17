package singer;

public class UnderratedRating extends RuntimeException{
	
	public UnderratedRating()
	{
		super("No Negative rating are allowed");
	}
	

}
