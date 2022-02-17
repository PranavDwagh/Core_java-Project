package study.lambda;

@FunctionalInterface
public interface Greeting {

	public String welcomeString(String fname,String lname);	
}//end of Greeting

class IndianGreeting implements Greeting
{
	@Override
	public String welcomeString(String fname,String lname) {
		
		return "Namaste "+fname;
	}	
}