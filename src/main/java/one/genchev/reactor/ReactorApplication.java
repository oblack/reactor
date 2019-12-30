package one.genchev.reactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactorApplication.class, args);
	}

}

//@Component
//@RequiredArgsConstructor
//@Log4j2
//class ReactiveMongo {
//
//	private final ReservationRepository reservationRepository;
//
//	@EventListener(ApplicationReadyEvent.class)
//	public void init() {
//		var reservationFlux = Flux.just("Apple ", "Orange ", "Grape ", "Banana ", "Strawberry ")
//			.map(name -> new Reservation(null, name))
//			.flatMap(this.reservationRepository::save);
//
//		reservationRepository.deleteAll()
//				.thenMany(reservationFlux)
//				.thenMany(this.reservationRepository.findAll())
//				.subscribe(log::info);
//	}
//}
//
//interface ReservationRepository extends ReactiveCrudRepository<Reservation, String> {
//
//}
//
//
//@Data
//@Document
//@AllArgsConstructor
//@NoArgsConstructor
//class Reservation {
//	@Id
//	private String id;
//	private String name;
//}

