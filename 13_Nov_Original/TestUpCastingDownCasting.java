

public class TestUpCastingDownCasting {

	public static void main(String[] args) {
		//A  obj  = new A() ;

		//showOutput(new B());
		//showOutput(new C()); //RUN TIME data type is C
		//showOutput(new E());
		//showOutput(new F());
		//showOutput(new A());
		
	}
	
	//compile time data type = B 
	public static void showOutput(B obj)
	{
		 obj.fa();
		 obj.fb();
		 if ( obj instanceof C)
			 ((C)obj).fc(); //DOWNCASTING
			 
		 
		 if(obj instanceof E)
		 {
		 ((E)obj).fe(); 
		 }
		 
		 if ( obj instanceof F)
		 {
		  F temp =(F)obj;
		  temp.ff();
		 }
		 /*
			 * // if( obj instanceof D ) // ((D)obj).fd(); //
			 */	
	}
	

}//end of Test class

class A
{
	void fa()
	{
		System.out.println("in fa");
	}
}

class B extends A
{
	void fb()
	{
		System.out.println("in fb");
	}
	
}

class C  extends B
{
	void fc()
	{
		System.out.println("in fc");
	}
}

class D  extends A
{
	void fd()
	{
		System.out.println("in fd");
	}
}

class E   extends B
{
	void fe()
	{
		System.out.println("in fe");
	}
}

class F  extends C
{
	void ff()
	{
		System.out.println("in ff");
	}
}