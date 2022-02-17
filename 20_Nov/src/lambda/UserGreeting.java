package lambda;

public class UserGreeting {
	public static void main(String[] args) {
		
		Greeting g = new IndianGreeting();  // Greeting is interface so its subclass can't be created 
		
		System.out.println(g.WelcomeString());  // it will call IndianGreeting function
		
		Greeting g1 = new Greeting() {	// if need another type of of greeting we have two option 
										// 1. Either create another like IndianGeeting  which will return another string
										// 2. Create another anonymous class
			@Override
			public String WelcomeString() {    //new anonymous inner class
				
				return "Namaste Anonymous Class";

			}
		}; 
		
		System.out.println(g1.WelcomeString());
		
		
		Greeting g2 = new Greeting() {  //new anonymous class
			
			@Override
			public String WelcomeString() {   
				return "konnichiwa"; // Greetings in japanese
			}
		};
	
	System.out.println(g2.WelcomeString());
	
	Greeting g3 = new Greeting() {
		
		@Override
		public String WelcomeString() {
			return "Hello World";
		}
	};
	
	System.out.println(welcome(g3));  // calling it through function
	
	
	String str = welcome(new Greeting() {
		
		@Override
		public String WelcomeString() {
			return "Direct as welcome argument without greeting reference";
		}
	});
	
	System.out.println(str);
	
	
	// lambda method
	
	 Greeting g4 = ()->{return "Good Evening4";};   // need to write parameterized constructor to use this lambda method
	System.out.println(g4.WelcomeString());
	 // Greeting g4 = (f)->{return "Good Evening";}; //use this type if Greeting welcomeString function taking one argument as parameter
	
	}//end of main
	
	public static String welcome(Greeting g)
	{
		return (g.WelcomeString());
	}

}//end of class
