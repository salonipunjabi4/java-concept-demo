package reactiveprogramming;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print all numbers in the intNumberStream stream
		StreamSources.intNumbersStream().forEach(number -> System.out.println(number));
		System.out.println("----------");
		
		//print numbers from intNumbersStream that are less than 5
		StreamSources.intNumbersStream().filter(number -> number<5).forEach(number -> System.out.println(number));
		System.out.println("----------");
		
		
		//print the second and third numbers in intNumberStream that's greater than 5
		StreamSources.intNumbersStream().filter(number -> number>5).skip(1).limit(2).forEach(number -> System.out.println(number));
		
		
		//print the first number in intNumbersStream thats greater than 5 if nothing is found print -1
		
		System.out.println("----------");
		Integer value = StreamSources.intNumbersStream().filter(number -> number > 5).findFirst().orElse(-1);
		System.out.println(value);
		
		//print first names of all users in userStream
		System.out.println("----------");
		StreamSources.userStream().map(user -> user.getFirstName()).forEach(userName -> System.out.println(userName));
		
		//print first names in userStream for users that have IDs from number stream
		//StreamSources.intNumbersStream().map(StreamSources.userStream().filter(user -> user.getId() == id));
		
		//print first names in userStream for users that have IDs from number stream
		System.out.println("----------");
		StreamSources.intNumbersStream().flatMap((id -> StreamSources.userStream().filter(user -> user.getId() == id)))
			.map(user -> user.getFirstName()).forEach(userName -> System.out.println(userName));
		
		//print id, first name and last name in userStream for users that have IDs from number stream
		System.out.println("----------");
		StreamSources.userStream().filter(u -> StreamSources.intNumbersStream().anyMatch(i -> i ==u.getId()))
			.forEach(userName -> System.out.println(userName));
		

	}

}
