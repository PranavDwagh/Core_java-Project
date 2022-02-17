package study.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		//List<Integer> list = Arrays.asList(12,10,13,23,34,45);
		
		//Stream<Integer> stream = list.stream();
		
		Arrays.asList(12,10,13,23,34,45)
		      .stream()
			  .forEach((element)->{System.out.println(element*element);} );
		
	}

}
