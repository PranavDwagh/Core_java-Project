/*
			 A
		   /   \
	      B		D
	    / \
       C   E
       |
       F
*/

    public class UPDownCast {
	public static void main(String[] args) {
		
		
		
		//A obj = new B();		// this is possible only	RHS isa LHS
		//UPCASTING							// ie SubClass B isa SuperClass A     aka   UPCASTING
									// Reverse Impossible...!!!
		
		
		show1(new F());            // Whatever you are sending from here 
		//show2(new B());      	// is the limit upto what you can access subclass (either by directly or downcasting)
		//show3(new C());
		//show4(new D());
		//show5(new E());
		//show6(new F());

	}

	private static void show1(B obj) {    // B obj = new C();
		            
		
		// Parameters of show 1 showing upto what class methods we can access without typecast aka DOWNCAST
		obj.fa();
		//if(obj instanceof B)
	    obj.fb();
		//if(obj instanceof C)
		C temp =(C)obj;       // another way to typecast     aka DOWNCASTING
		temp.fc();
	//	obj.fc();
		if(obj instanceof F)
		((F)obj).ff();				//DOWNCASTING
		//if(obj instanceof D)
		//((D)obj).fd();
		//if(obj instanceof E)
		//((E)obj).fe();	
	}
	
	private static void show2(B obj) {
		
		obj.fa();
		obj.fb();
		
		if(obj instanceof C)
		((C)obj).fc();
		
		if(obj instanceof F)
		((F)obj).ff();
		/*
		if(obj instanceof D)		// As there is no any relation between B and D  
		((D)obj).fd();
		*/
		if(obj instanceof E)
		((E)obj).fe();	
	}
	
	private static void show3(C obj) {
		
		obj.fa();
		obj.fb();
		obj.fc();
		
		if(obj instanceof F)
		((F)obj).ff();
		/*
		if(obj instanceof D)
		((D)obj).fd();
												// no relation between 	
		if(obj instanceof E)
		((E)obj).fe();
		*/	
	}
	
	private static void show4(D obj) {
		
		obj.fa();
		obj.fd();
		/*
		if(obj instanceof A)
		((B)obj).fb();
		
		if(obj instanceof C)
		((C)obj).fc();
		                                  // these methods we can't access
		if(obj instanceof F)
		((F)obj).ff();
		
		if(obj instanceof E)
		((E)obj).fe();
		*/	
	}
	
	private static void show5(E obj) {
		
		obj.fa();
		obj.fb();
		obj.fe();	
	/*	
		if(obj instanceof C)
		((C)obj).fc();
		
		if(obj instanceof F)
		((F)obj).ff();
		
		if(obj instanceof D)
		((D)obj).fd();
		*/
		
	}
	private static void show6(F obj) {
		
		obj.fa();
		
		
		obj.fb();
		
		obj.fc();
		
		
		obj.ff();
		/*
		if(obj instanceof D)
		((D)obj).fd();         // No Relation between F and D
		
		if(obj instanceof E)
		((E)obj).fe();
		*/
	}
	
}

	class A{
		public void fa()
		{
			System.out.println("In fa");
		}
	}
	
	class B extends A
	{
		public void fb()
		{
			System.out.println("In fb");
		}
	}
	
	class C extends B{
		public void fc()
		{
			System.out.println("In fc");
		}
	}
	
	class D extends A {
		public void fd()
		{
			System.out.println("In fd");
		}
	}
	
	class E extends B {
		public void fe()
		{
			System.out.println("In fe");
		}
	}
	
	class F extends C{		
		public void ff()
		{
			System.out.println("In ff");
		}
	}

