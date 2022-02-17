package set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MyMap {
	
	public static void main(String[] args) {
		
	HashMap<Integer, String> tm = new HashMap<Integer, String>();
	
	tm.put(10, "Pranav");
	tm.put(50, "pooja");
	tm.put(40, "xyz");
	tm.put(80, "wagh");
	tm.put(34, "Don");
	
	Set<Integer> key = tm.keySet();

	System.out.println("all keys are here :");
	for (Integer keys : key)
	{
		System.out.println(keys);
	}

	System.out.println("All values are here ");
	
	Collection<String> name = tm.values();
	
	for (String n : name)
		System.out.println(n);
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Roll No :");
	int roll = sc.nextInt();
	//String name1 = tm.get(roll);
	
	System.out.println(roll+" "+tm.get(roll));

	}//end of main
}//end of class
