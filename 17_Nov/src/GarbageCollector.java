
public class GarbageCollector {

	public static void main(String[] args) {

		Mydata [] mydata = new Mydata[100000];
		for(int i=0; i<100000;i++)
		{
			 mydata[i] = new Mydata();            // here mydata is populating  and as every object is linked with stack
 			System.out.println(i);					// so no object will collected by garbage collector
		}
		/*
		for (int i=0; i<10; i++)
		{
			Mydata mydata = new Mydata();
			System.out.println(i);
			System.gc();           // we can request to JVM to invoke Garbage Collector explicitly but no garranty it will run 
		}*/


		//	Mybigdata[] mybigdata =  new Mybigdata[100000];
		/*for (int i=0; i<100000; i++)
		{
			//Mybigdata[] mybigdata =  new Mybigdata[100000];
			Mydata mydata = new Mydata();  
			Mybigdata   mybigdata = new Mybigdata();		// here is noe Mydata is local to for loop
			System.out.println(i);					// his scope is till for loop 
		}	*/								/// so for loop will run completely and will free heap whenever it reaches till 70%
       
	}
}

class Mydata
{
	long [] arr = new long[100000];

	@Override
	public void finalize() throws Throwable {

		System.out.println("GC will sweep Mydata this "+this);	
	}
}

class Mybigdata
{
	long [] arr = new long[200000];
	@Override
	public void finalize() throws Throwable {

		System.out.println("GC will sweep MybigData this "+this);	
	}
}

