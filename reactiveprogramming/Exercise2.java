package reactiveprogramming;

import java.io.IOException;

public class Exercise2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//print all numbers in the ReactiveSources.intNumbersFlux stream
		
		//ReactiveSources.intNumbersFlux().subscribe(e -> System.out.println(e));
		
		//print all users in the ReactiveSources.userFlux stream
		
		ReactiveSources.userFlux().subscribe(user -> System.out.println(user));
		
		System.out.println("Press a key to end");
		System.in.read();
	}

}
