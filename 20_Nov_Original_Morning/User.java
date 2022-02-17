package study.lambda;

public class User {

	public static void main(String[] args) {
		Greeting g = new IndianGreeting();
		//System.out.println(g.welcomeString());
		
		Greeting g1 = new Greeting() {
			
			@Override
			public String welcomeString(String a,String b) {
				return "Konnichiwa "+b+" san";
			}
		
		/*end of anonymous inner class impl */};
			
		Greeting g3 = new Greeting() {
			
			@Override
			public String welcomeString(String a,String b) {
					return "Hey Howd "+a;
			}
		};
		
		Greeting g4 = (f,l)->{	return "Good Evening "+f+" "+l;	};
		
		welcome(g1);
		
		/*
		welcome(new Greeting() {
			
			@Override
			public String welcomeString() {
				// TODO Auto-generated method stub
				return "good morning";
			}
		}); */
		
		
		//System.out.println(g1.welcomeString());
		//System.out.println(g3.welcomeString());

	} //end of main

	public static void welcome(Greeting g)
	{
		System.out.println(g.welcomeString("prachi","godbole"));
	}
	
	
	
	
}//end of User
