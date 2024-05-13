package java8example;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public class MyStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> elist = Arrays.asList(new Employee(101, "Allen", "HR", 1234l, "NY"), new Employee(102, "James", "IT", 67546l, "NJ"),
				new Employee(103, "Black", "HR", 87686l, "Pitts"), new Employee(104, "Max", "IT", 4567l, "NY"));
		
		//sorting data according to salary
		
		List<Employee> sortedByNameEmp = elist.stream()
				.sorted((obj1, obj2) -> obj1.getSalary().compareTo(obj2.getSalary())).collect(Collectors.toList());
		
		System.out.println(sortedByNameEmp);
		
		// Comparator, Runnable interface comes under function interface
		// because they have one abstract method
		
		//Comparator interface method
		//int compare(Object obj1, Object obj2)
		
//		Runnable r = () -> {
//			for(int i = 0; i< 10; i++) {
//				System.out.println(i);
//			}
//			
//		};
//		Thread t = new Thread(r);
//		t.start();
		
		//find employees of name is Allen using stream API
		
		Employee emp = elist.stream().filter(e -> e.getName().equals("Allen")).findFirst().orElse(null);
		System.out.println(emp.getId() + "," + emp.getName() + "," + emp.getSalary() + "," + emp.getDept() + "," + emp.getAddress());
		
		//find name of employees whose salary is greater than 20000
		
		List<String> names = elist.stream().filter(e -> e.getSalary() > 20000).map(e-> e.getName()).collect(Collectors.toList());
		System.out.println(names);
		
		List<String> address = elist.stream().map(e -> e.getAddress()).collect(Collectors.toList());
		System.out.println(address);
		
		String input = "JavaJavaEE"; //J:2 a:4 
		
		System.out.println(input.chars().mapToObj(c -> (char) c).count());
		
		//1. convert string to char array
		//2. map each character from the array
		//3. we have to convert char array to map
		
		Map<Character, Long> result = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);


	}

}
