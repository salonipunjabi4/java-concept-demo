package java8example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NestedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Customer> customers = CustomerDB.getAllCustomer();
		List<List<String>> mobileNumber = customers.stream().map(c -> c.getMobileNo()).collect(Collectors.toList());
		
		System.out.println(mobileNumber);
		
		List<String> mNumbers = customers.stream().flatMap(c -> c.getMobileNo().stream())
			.collect(Collectors.toList());
		System.out.println(mNumbers);
		
		//Finding the second largest number using Stream API
		List<Integer> numbers = Arrays.asList(1,3,4,5,6,6,7,2);
		
		int secondLargest = numbers.stream().distinct().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst().orElse(null);
		System.out.println(secondLargest);
		
		int secondLargest1 = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		System.out.println(secondLargest1);
		
		
		List<String> lists = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		
		Map<String, Long> count = lists.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(count);
		
		List<String> duplicates = count.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toList());
		
		System.out.println(duplicates);
		
		
//		Map<Character, Long> result = input.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(result);

	}
	

}
