package se.leiflindback.webfluxhw.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/**
 * A simple controller for the API root.
 */
@RestController
public class HwController {
    /**
     * @return A greeting.
     */
    @GetMapping("/webflux-hw")
    public Mono<String> greeting() {
        return Mono.just("Welcome to the WebFlux API@@@");
    }
}
