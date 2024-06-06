package reactiveprogramming;

import java.io.IOException;

public class Exercise4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//print all the values from intNumbersFlux that's greater than 5
		
//		ReactiveSources.intNumbersFlux().filter(e -> e > 5).log().subscribe(e -> System.out.println(e));
//		System.out.println("Press a key to end");
//		
		
		//print 10 multiplication of each value from intNumbersFlux thats greater than 5
		System.out.println("---------");
		
		//ReactiveSources.intNumbersFlux().log().filter(e -> e > 5).map(e _-> e * 5).subscribe(System.out::println);
		
		//ReactiveSources.intNumbersFlux().filter(e -> e > 5).log().map(e -> e * 10).subscribe(System.out::println);
		
		
		//print 10 multiplication of each value from isNumbersFlux for the first 3 numbers emitted thats greater than 5
		
		//ReactiveSources.intNumbersFlux().log().filter(e -> e > 5).map(e -> e * 10).take(3).subscribe(System.out::println);
		
		
		//print each value from intNumbersFlux thats greater than 20. Print -1 if no element found
		ReactiveSources.intNumbersFlux().filter(e -> e>20).log().defaultIfEmpty(-1).subscribe(System.out::println);
		
		//switch ints from intNumberFlux to the right user form userFlux
		
		ReactiveSources.intNumbersFlux().flatMap(id -> 
		ReactiveSources.userFlux().filter(user -> user.getId() == id)
		).distinct().log().subscribe(System.out::println);
		
		System.out.println("Press a key to end");
		System.in.read();

	}

}
