package singer;

public class OverratedRating extends RuntimeException {

	public OverratedRating()
	{
		super("More than 5 rating not allowed");
	}
}
