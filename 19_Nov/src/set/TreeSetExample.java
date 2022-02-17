package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(20);
		ts.add(50);
		ts.add(45);
		ts.add(71);
		ts.add(45);      //TreeSet do not allow duplicate values
		
		Iterator<Integer> itr = ts.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());      // either use this loop or use below for loop
		}
		System.out.println();
		
		for(Integer i : ts) 
		{
			System.out.println(i);      
		}
		
	    /*	
		for (int i=0; i<ts.size();i++)
		{
			System.out.println(ts.get(i));   ////Conventional for loop do not work here as here no index available for traversing
		}
		*/
		
		//Userdefine Class treeset
		TreeSet<Mydate4> dt = new TreeSet<Mydate4>();
		
		dt.add(new Mydate4(12, 12, 2012));
		dt.add(new Mydate4(2, 12, 2021));
		dt.add(new Mydate4(12, 10, 2010));
		dt.add(new Mydate4(12, 11, 2020));
		dt.add(new Mydate4(22, 2, 2022));
		Mydate4 x = (new Mydate4(19, 11, 2021));
		dt.add(x);
		
		for(Mydate4 i : dt) 
		{
			System.out.println(i);      
		}
		
		dt.remove(x);    //remove object from treeset
		
		for(Mydate4 i : dt) 
		{
			System.out.println(i);      
		}
		
		
	}
}
