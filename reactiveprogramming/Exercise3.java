package reactiveprogramming;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Get all numbers in the ReactiveSources.intNumberFlux stream
		//into a List and print the list and its size
		
		List<Integer> result = ReactiveSources.intNumbersFlux().log().toStream().toList();
		
		System.out.println("List is: " + result);
		System.out.println("Size: " + result.size());
		
		System.out.println("Press a key to end");
		System.in.read();

	}

}
