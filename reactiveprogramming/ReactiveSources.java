package reactiveprogramming;

import java.time.Duration;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveSources {
	
	//how to convert array to mono/flux
	
	public static Flux<String> stringNumbersFlux(){
		return Flux.just("one", "two", "three", "four", "five", "six", "seven", "eight","nine", "ten")
				.delayElements(Duration.ofSeconds(1));
		
	}
	
	public static Flux<Integer> intNumbersFlux(){
		return Flux
				.range(1,10)
				.delayElements(Duration.ofSeconds(1));
	}
	
	public static Flux<Integer> intNumbersFluxWithException(){
		return Flux
				.range(1, 10)
				.delayElements(Duration.ofSeconds(1))
				.map(e -> {
					if(e == 5) throw new RuntimeException("An error happend in the flux");
					return 0;
				});
	}
	
	public static Mono<Integer> intNumberMono(){
		return Mono.just(42).delayElement(Duration.ofSeconds(1));
	}
	
	public static Flux<User> userFlux(){
		return Flux.just(
				new User(1, "Lionel", "Messi"),
				new User(2, "Cristiano", "Ronaldo"),
				new User(3, "Diego", "Mardona"),
				new User(4, "Zinedine", "Zidane"),
				new User(5, "Jorgen", "Klinsmann"),
				new User(6, "Gareth", "Bale")
				).delayElements(Duration.ofSeconds(1));
	}
	
	public static Mono<User> userMono(){
		return Mono.just(
				new User(1, "Lionel", "Messi")
				).delayElement(Duration.ofSeconds(1));
				
	}
	
	public static Flux<String> unresponsiveFlux(){
		return Flux.never();
	}
	
	public static Mono<String> unresponsiveMono(){
		return Mono.never();
	}
	
	public static Flux<Integer> intNumbersFluxWithRepeat(){
		return Flux
				.just(1,2,1,1,3,2,4,5,1)
				.delayElements(Duration.ofSeconds(1));
	}

}
