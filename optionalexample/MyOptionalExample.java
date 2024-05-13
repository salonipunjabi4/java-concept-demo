package optionalexample;

import java.util.Optional;

public class MyOptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Optional is a class which is used to avoid NullPointerException
		//many predefined methods which return type of Optional
		
		Optional<String> op = Optional.of("Allen");
		
		Optional empty = Optional.empty();
		
		Optional<String> value = Optional.ofNullable("Allen");
		Optional<String> value1 = Optional.ofNullable("Allen");
		System.out.println(op + " , " + empty + " , " + value);
		
		String name = value.filter(x -> x.equals("Black")).orElse("Name is not matching or name is null");
		System.out.println(name);
		
		String uppercaseValue = value1.map(String::toUpperCase).orElse("value is null");
		
	//	String lowercaseValue = value1.map(String::toLowerCase);
		
		value1.filter( x -> x.equals("Black"))
			.orElseThrow(() -> new IllegalArgumentException("Name is not matching"));
		
				
		if(value1.isPresent()) {
			System.out.println(value1);
		}else {
			System.out.println("Name is not found");
		}
		
		Optional<String> gender = Optional.ofNullable("MALE");
		System.out.println(gender.orElseGet(() -> "<N/A>")); //MALE
		
		
		System.out.println(value1.get());
		
		

	}

}
