package one.genchev.reactor.api;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

public class StringWebClient {

//   WebClient client = WebClient.create("http://localhost:8080");
//
//   public void init() {
//       Flux<String> employeeFlux = client.get()
//               .uri("/employees")
//               .retrieve()
//               .bodyToFlux(String.class);
//
//       employeeFlux.subscribe(System.out::println);
//   }
}