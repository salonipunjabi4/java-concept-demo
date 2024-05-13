package java8example;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface MyI{
	//void test(String str);
	String test(String s1, String s2);
}

public class MyClass {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x8 = 10;
		
		MyI a = (str, str1 ) -> {
			//System.out.println("Line 1" + str);
			//System.out.println("Line 2");
			return str + " , " + str1;
	
		};
		System.out.println(a.test("Hello", "How are you?"));
		
		MyI a1 = (str, str1) -> {
			System.out.println("Line 1" + str);
			System.out.println("Line 2");
			
			return str + " , " + str1;
	
		};
		String result = a1.test("Welcome", "Fine");
		System.out.println(result);
		
		
		Function<String, String> f1 = (str) -> str + "Fine";
		System.out.println(f1.apply("hello"));
		//Function<T,R> one input one return value
		
		BiFunction<String, Integer, String> biF = (a3, b3) -> a3 + b3;
		System.out.println(biF.apply("welcome", 10));
		
		Predicate<String> p = (s) -> {
			if(s.length() == 4)
				return true;
			else
				return false;
			
		}; //one input but boolean return value
		System.out.println(p.test("salo"));
		
		//consumer one input no return value
		Consumer<String> consumer = (str) -> {
			int x = 10;
			
			System.out.println("Its consumer" + str);
			
			};
		consumer.accept("hello");
		
		//supplier no input but return object type
		Supplier<Integer> su = () -> 10;
		Integer resultSupplier = su.get();
		System.out.println(resultSupplier);
		
		
		Function<String, String> f5 = (str) -> str + "," + str;
		f5.apply("saloni");
		
		BiFunction<Integer, Integer, Integer> f6 = (f, b) -> f + b;
		f6.apply(4, 5);
		
		
		
		


	}

}
