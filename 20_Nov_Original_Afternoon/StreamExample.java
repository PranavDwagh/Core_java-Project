package study.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,10,13,23,34,45);
		
		Stream<Integer> stream = list.stream();
		
		Arrays.asList(12,10,13,23,34,45)
		      .stream()
			  .forEach((element)->{System.out.println(element*element);} );
		
		// Show only those elements in the list that are greater than 20
		
		  //Stream<Integer> greaterthan20 = stream.filter(new MyPredicate());
		
		
		//Stream<Integer> greaterthan20 = stream.filter((t)-> {  if( t > 20)  return true; else return false;} );
			
		//greaterthan20.forEach((element)->{System.out.println(element);} );
		
		stream.filter((t)-> {  if( t > 20)  return true; else return false;})
			  .forEach((element)->{System.out.println(element);});
		
		
		List<String> colors = Arrays.asList("blue","green","red","white","yellow");
		
		//show the new list of all elements that have length greater than of equal to 5
		
		
		 colors.stream().filter((t)->{if (t.length() >=5) return true; else return false;})
		 				.forEach((element)->{ System.out.println(element);    });
		
		
		
		 //create a new Stream that has capital of each string in the list
		 
		 
		 Stream<String>  capsstream = colors.stream().map((t)->{return t.toUpperCase();});
		 
		 capsstream.forEach((ele)->{System.out.println(ele);} );
		 
		 
		 //create a new stream that has each number incremented by 1 
		 //show the stream
		 Stream<Integer> plusone = Arrays.asList(12,10,13,23,34,45).stream().map(t->t+1);
			 plusone.forEach((ele)->{System.out.println(ele);});
		
		
			//list of marks
			//list of percentage
			 
			 
	}//end of main method

}//end of main class




/*
class MyPredicate implements Predicate<Integer>
{

	@Override
	public boolean test(Integer t) {
		if( t > 20)  return true;
		else return false;
	}
	
}
*/

