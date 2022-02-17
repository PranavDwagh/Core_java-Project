package study.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUsageExample {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("mumbai");
		list.add("delhi");
		list.add("kolkata");
		list.add("chennai");
		
		System.out.println("before....");
		for(String s: list)
			System.out.println(s);
		
		//Collections.shuffle(list);
		Collections.sort(list);
		
		
		System.out.println("\nafter....\n");
		
		for(String s: list)
			System.out.println(s);
		
		
		System.out.println("\n max="+Collections.max(list));
		
		System.out.println("\n min="+Collections.min(list));
		
		
		List<Integer> numbers = Arrays.asList(23,45,12,1,200,99,88);
		
		Collections.sort(numbers);
		
		for(Integer i : numbers)
			System.out.println(i);
		
	//	number.foreach(System.out :: println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
