package one.genchev.reactor.api;

import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping(path="/fruit", produces = "application/json")
public class WebController {

    @GetMapping
    private Publisher<String> getAllFruit() {
        return Flux.just("Apple ", "Orange ", "Grape ", "Banana ", "Strawberry ").delayElements(Duration.ofSeconds(2));
//        return Flux.just("Apple ", "Orange ", "Grape ", "Banana ", "Strawberry ").delayElements(Duration.ofSeconds(1)).log();
    }

//    @GetMapping
//    private String getSingleResult() {
//        Mono.just("Apple")
//                .map(n -> n.toUpperCase())
//                .subscribe(System.out::println);
//        return "Opa";
//    }

//    @GetMapping
//    private String getMultiResult() {
//        Flux.just("Apple ", "Orange ", "Grape ", "Banana ", "Strawberry ")
//                .map(n -> n.toUpperCase())
//                .subscribe(System.out::println);
//        return "Opa";
//    }

}
