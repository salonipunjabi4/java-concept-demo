package java11features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

public class Java11Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//toArray - converts list into array
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101, "Allen", 89760f));
		emp.add(new Employee(102, "Black", 89760f));
		
		System.out.println(emp);
		System.out.println("=========");
		Employee[] array = emp.toArray(size -> new Employee[size]);
		Employee[] arr1 = emp.toArray(Employee[]::new);
		System.out.println(array[0]);
		
		//Adding var keyword for local variables
		//we can use var in lamda as an argument
		var msg = 100.5;
		System.out.println(msg);
		BiFunction<String, Integer, String> result = (var x, var y) -> {
			System.out.println(x + "," + y);
			return "Hello " + "How are you?";
			};
		System.out.println(result.apply("10", 20));
		
		Optional<String> value = Optional.ofNullable(null);
		System.out.println(value.isEmpty());

	}

}
