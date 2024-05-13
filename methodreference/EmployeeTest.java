package methodreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = Arrays.asList(new Employee("Allen", 20, "HR", 3456),
				new Employee("Black", 22, "HR", 345678),
				new Employee("Saumya", 221, "IT", 3412),
				new Employee("James", 25, "HR", 90876),
				new Employee("Saloni", 29, "IT", 61234),
				new Employee("Max", 26, "PS", 78654));
		
		//find the highest salary of each dept
		
		Map<String, Object> highestSal = employees.stream().
				collect(Collectors.groupingBy(Employee::getDept, 
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), e->e.map(Employee::getSalary))));
		
				highestSal.forEach((dept, highSal) -> System.out.println("Department: " + dept + " Highest Salary: " + highSal));
				
		System.out.println("---------");
		Map<String, Employee> topEmployee = employees.stream().collect(
				groupingBy(e->e.getDept(), collectingAndThen(maxBy(comparingInt(e->e.getSalary())), Optional::get)));
		System.out.println(topEmployee);
		
		
//		Q. Find the highest salary in each department (Stream0
//
//				1. Map<String, Employee> topEmployee: This line declares a variable named topEmployee which is a map. It maps strings (department names) to Employee objects. This map will contain the top employee (highest salary) for each department.
//				2. employees.stream(): This starts streaming the elements of the employees collection. It allows you to perform operations on each element of the collection in a functional style.
//				collect(...): This terminal operation collects the elements of the stream into a result container. In this case, it's collecting employees into a map.
//				3. groupingBy(e -> e.getDept(), ...): This is a static method in the Collectors class. It's a collector that groups elements of a stream based on a classifier function, in this case, e -> e.getDept(). It categorizes employees by their department.
//				4. collectingAndThen(maxBy(...), Optional::get): This is another collector used within the groupingBy collector. It first finds the maximum salary (maxBy(comparingInt(e -> e.getSalary()))) within each group (department) and then transforms the result, which is an Optional<Employee>, to the employee object itself (Optional::get). So, for each department, it gets the employee with the maximum salary.

	}

}
