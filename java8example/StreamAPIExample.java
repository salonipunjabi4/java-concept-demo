package java8example;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		
		int result = getCountEmptyStringUsingJava7(strings);
		System.out.println("Using method: Count of empty  strings: " + result);
		System.out.println("----------");
		
		Stream<String> s = strings.stream();
		s = s.filter(string -> string.isEmpty());
		
		long count = s.count();
		System.out.println("Using streams: Count of empty  strings: " + count);
		
		System.out.println("----------");
		long count1 = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Using streams: Count of empty  strings: " + count1);
		

		
		System.out.println("----------");
		
		//display all str
		List<String> msg = strings.stream().map(string -> "hello " + string).collect(Collectors.toList());
		System.out.println("Using streams: List with hello prefix " +msg);
		
		System.out.println("----------");
		
		
		List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
		//we have to find square of every elements from the list using stream
		
		List<Integer> square = integers.stream().map(i -> i * i).distinct()
.collect(Collectors.toList());
		System.out.println("Calculating square of elements using streams(Collectors): ");
		System.out.println(square);
		
		
		System.out.println("----------");
		System.out.println("Calculating square of elements using streams(forEach): ");
		
		integers.stream().map(i -> i * i).distinct().forEach((e) -> System.out.print(e + " ,"));
		
		IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();
		
		int max = stats.getMax();
		double average = stats.getAverage();
		int min = stats.getMin();
		long sum = stats.getSum();
		System.out.println("");
		System.out.println("----------");
		System.out.println("Max: " + max + "," + " Min: " +min + "," +" Average: " + average + "," +" Sum: " + sum);
		

	}

	private static int getCountEmptyStringUsingJava7(List<String> strings) {
		int count = 0;
		// TODO Auto-generated method stub
		for(String str: strings) {
			if(str.isEmpty())
				count++;
		}
		return count;
	}

}
