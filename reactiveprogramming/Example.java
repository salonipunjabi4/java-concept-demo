package reactiveprogramming;

import java.io.IOException;
//import java.util.concurrent.Flow.Subscription;

import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

public class Example {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//Flux<Integer> nums = ReactiveSources.intNumbersFlux();
		//nums.subscribe(new MySubscriber())
		ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());
		System.in.read();

	}

}

class MySubscriber<T> extends BaseSubscriber<T> {
	
//	@Override
//	public void h(Subscription subscribe) {
//		System.out.println("Subscribe happen");
//		request(5);
//	}
	
	@Override
	public void hookOnSubscribe(Subscription subscription) {
		System.out.println("Subscribe happen");
		request(5);

	}
	
	@Override
	public void hookOnNext(T value) {
		System.out.println(value.toString() + ", " + "received");
	}
	
	
}
