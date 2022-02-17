package collection;

import java.util.ArrayList;
import java.util.List;

public class ExampleArrayList2 {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(0, 10);
		
		list.forEach(System.out :: println);
		
	//	list.forEach((e)-> {System.out.println(e);});
		
		System.out.println(list);
		System.out.println(list.get(1));       // to get specific element
	}
	
	

}
