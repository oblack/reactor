package one.genchev.reactor.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("/employees")
public class WebController {

    @GetMapping
    private Flux<String> getAllEmployees() {
        return Flux.just("Apple", "Orange", "Grape", "Banana", "Strawberry").delayElements(Duration.ofSeconds(2)).log();
    }
}
