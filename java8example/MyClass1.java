package java8example;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface MyI1{
	//void test();
	String test(String str1, String str2);
}
public class MyClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyI1 a = (str1, str2) -> {
			return str1 + "," + str2;
		};
		
		System.out.println(a.test("hello", "hi"));
		
		Function<String, String> f1 = (str) -> "Hello, " + str;
		System.out.println(f1.apply("Saloni"));
		
		BiFunction<Integer, Integer, Integer> f2 = (i, j) -> i + j;
		System.out.println(f2.apply(5, 5));
		
		Predicate<String> p = (s) -> {
			if(s.length() == 4)
				return false;
			else
				return true;
		};
		System.out.println(p.test("Saloni"));
		
		Consumer<String> c = (str) -> {
			System.out.println("Its consumer" + str);
		};
		c.accept(" interface");
		
		Supplier<Integer> s = () -> 10;
		System.out.println(s.get());
	
	}

}
