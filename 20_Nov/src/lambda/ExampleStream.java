package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleStream {
	public static void main(String[] args) {

		List< Integer> list = Arrays.asList(10,25,12,18,16,15,11);
		
		Stream<Integer> stream = list.stream();     // Collection has default stream method which is inherited to List
													//which return Stream Object
		
	//	stream.forEach((element)-> {System.out.println(element*element);});   //lambda
		 
		
		// another way 
		list.forEach(System.out :: println);
		
		
		// another way
		list.forEach((e)-> {System.out.println(e);});		
		
		//another way
	//	Arrays.asList(10,25,12,18,16,15,11).stream().forEach((elements)->{System.out.println(elements * elements);} );

	}
}
