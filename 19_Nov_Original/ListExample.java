package study.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		List<String> mylist = new Vector<>();//new Stack<String>(); //LinkedList<String>(); //new ArrayList<String>();
		
		mylist.add("red");
		mylist.add("green");
		mylist.add("blue");
		
		for(int i=0;i<mylist.size();i++)
			System.out.println(mylist.get(i));
		
		/*
		for(String s : mylist)
		{
			System.out.println(s);
		}*/

		System.out.println("yellow is in the list :"+mylist.contains("yellow"));
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("pink");
		al2.add("puprle");
		
		mylist.addAll(1,al2);
		for(String s : mylist)
		{
			System.out.println(s);
		}
		
		mylist.remove("red");
		System.out.println("after removing...");
		for(String s : mylist)
		{
			System.out.println(s);
		}
		
		
		
	}

}
