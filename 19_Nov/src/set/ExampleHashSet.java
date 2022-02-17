package set;

import java.util.HashSet;

public class ExampleHashSet {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(20);
		hs.add(25);
		hs.add(5);
		hs.add(2);
		hs.add(25);       //duplicate not allowed
		
		for(Integer i : hs)
		{
			System.out.println(i);   //bucket order
		}
		
		HashSet<Mydate4> hd = new HashSet<Mydate4>();
		
		hd.add(new Mydate4(19, 11, 2021));
		Mydate4 d1 = (new Mydate4(11, 11, 2020));
		hd.add(d1);
		hd.add(new Mydate4(9, 1, 2021));
		hd.add(new Mydate4(25, 12, 2022));
		Mydate4 d2 = (new Mydate4(11, 11, 2020));
		hd.add(d2);
		
		for (Mydate4 d : hd)
		{
			System.out.println(d);
		}
		
		System.out.println("Equals :"+d1.equals(d2));      //In hashset whenever we override equals method 
		
		System.out.println("HashCode d1 "+d1.hashCode());   // always override hashcode method as well 
		System.out.println("HashCode d2 "+d2.hashCode());	// otherwise it will breach contract of hash code( read javadoc)
															// if two object are identical then their hashcode must be same
	}															// that is the contract

}
