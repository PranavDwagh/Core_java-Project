package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ExampleStreamFunction {
	public static void main(String[] args) {

	/*	List<Integer> list = new ArrayList<Integer>();
		
		list.add(20);
		list.add(15);
		list.add(17);
		list.add(36);
		list.add(40);
		
		System.out.println(list);
		*/
		
		//another way
		
		List<Integer> list = Arrays.asList(20,15,17,36,40);
		
		//System.out.println(list);                          //one way of printing list
		
		Stream<Integer> stream = list.stream();
		
		stream.forEach((ele)->{System.out.print(" "+ele*ele);});
		System.out.println("");
		
		
		Stream<Integer>graterthan20 = list.stream().filter((f)->{if (f>20) return true; else return false;});
		
				graterthan20.forEach((ele)->{System.out.println(ele);});
		
		// or
				/*
				Iterator<Integer> itr = list.iterator();
				
				while(itr.hasNext())
				{
					Integer temp = itr.next();
					if(temp..getvalue > 20)
						System.out.println(temp);
					
				}
				*/
				
				
				
				list.stream().filter((f)->{if (f>20) return true; else return false;}).forEach((ele)->{System.out.println(ele);});
		
		// this is also a another method 
				Arrays.asList(20,15,17,36,40).stream().map((ele->ele+1)).forEach((elem)->{System.out.println(elem);});
				
			//===================================================================================================
		
		List<String> colors = Arrays.asList("Blue", "Green", "Yellow","Black");
		
		colors.stream().forEach((ele)->{System.out.println(ele);});
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stream<String> ans = colors.stream().filter((f)->{if (f.equals(str))         //filter returns String in stream
										return true; 
										else 
										return false;
									});
		ans.forEach((ele)->{System.out.println(ele);});    
		
		//====================================================
		
		//toUpperCase
		
		Stream<String> Upper = colors.stream().map((f)->{ return f.toUpperCase();});
		
		
		System.out.println(Upper);   // toString is not Overriden in Stream.....so cant use      
		
		Upper.forEach((ele)->{System.out.println(ele);});    // it will print every element of which is in Upper stream
		
	}


}
