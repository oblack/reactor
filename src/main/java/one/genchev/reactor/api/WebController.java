package one.genchev.reactor.api;

import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("/fruit")
public class WebController {

    @GetMapping
    private Publisher<String> getAllEmployees() {
        return Flux.just("Apple ", "Orange ", "Grape ", "Banana ", "Strawberry ").delayElements(Duration.ofSeconds(1));
    }
}
