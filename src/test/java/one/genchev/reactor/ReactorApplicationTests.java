package one.genchev.reactor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.time.Duration;

//@SpringBootTest
class ReactorApplicationTests {

//	@Test
	void contextLoads() {
	}

//	@Test
	public void createAFlux_just() {
		Flux<String> stringFlux = Flux.just("Apple", "Orange", "Grape", "Banana", "Strawberry").delayElements(Duration.ofSeconds(2)).log();
//		stringFlux.subscribe(f -> System.out.println("Here is some " + f));

		StepVerifier.create(stringFlux)
				.expectNext("Apple")
				.expectNext("Orange")
				.expectNext("Grape")
				.expectNext("Banana")
				.expectNext("Strawberry")
				.verifyComplete();
	}

}
