package one.genchev.reactor;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.util.function.Consumer;

@Component
public class ReactorInit {

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        Flux<String> fruitFlux = Flux.just("Apple ", "Orange ", "Grape ", "Banana ", "Strawberry ")
                .map(n -> n.toUpperCase());
//        fruitFlux.subscribe(f -> System.out.println(f));

        StepVerifier.create(fruitFlux)
                .expectNext("APPLE ")
                .expectNext("ORANGE ")
                .expectNext("GRAPE ")
                .expectNext("BANANA ")
                .expectNext("STRAWBERRY ")
                .verifyComplete();
    }
}
