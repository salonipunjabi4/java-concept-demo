package methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDB {
	public static List<Customer> getAllCustomer(){
		return Stream
				.of(new Customer(101, "Allen", "allen@gmail.com", Arrays.asList("671896540", "98807654")),
						new Customer(102, "Black", "balck@gmail.com", Arrays.asList("6789654045", "459807654")),
						new Customer(103, "James", "james@gmail.com", Arrays.asList("5667896540", "9678807654")),
						new Customer(104, "Max", "max@gmail.com", Arrays.asList("67896540", "67899807654"))
						).collect(Collectors.toList());
				
	}

}

//how to convert list into stream -- list.strean(), Stream.of()
//how to convert stream into list -- Collectors.toList()