package java11features;

import java.util.List;
import java.util.stream.Collectors;

public class StringEnhancement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lines(): method of String class and coverts string into stream
		//strip(), stripLeading(), stripTrailing()

		
		String str = "Wel\rcome";
		String str1 = "Hel\nlo";
		List<String> result1 = str1.lines().collect(Collectors.toList());
		
		List<String> result = str.lines().collect(Collectors.toList());
		System.out.println(result1);
		
		String name = "    Allen    ";
		System.out.println(name.stripLeading());
		System.out.println(name.stripTrailing());
		System.out.println(name.strip());
		
		String greeting = "Hello\s";
		System.out.println(greeting.repeat(10));
	}

}
