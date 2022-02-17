package study.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTraversal {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("red","green","blue","white","orange","purple");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());				
		}
		
		Enumeration<String> enumer = Collections.enumeration(list);
		
		Vector<String> v= new Vector();
		v.add("earth");
		v.add("moon");
		v.add("jupiter");
			
		Enumeration<String> enumeration = v.elements();
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
