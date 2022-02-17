package lambda;

@FunctionalInterface
public interface Greeting {
	
	public String WelcomeString();     // FunctionalInterface has only one method...No more no less
	
}// end of greeting

class IndianGreeting implements Greeting
{
	@Override
	public String WelcomeString() {
		return "Namsate";
	}
}


