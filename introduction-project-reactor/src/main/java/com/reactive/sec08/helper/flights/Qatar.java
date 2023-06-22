package com.reactive.sec08.helper.flights;

import reactor.core.publisher.Flux;

import java.time.Duration;

import static com.reactive.utils.FakerUtility.faker;

public class Qatar {

  public static Flux<String> getFlights() {
    return Flux.range(1, faker().random().nextInt(1, 5))
        .delayElements(Duration.ofSeconds(1))
        .map(i -> "Qatar " + faker().random().nextInt(1, 999))
        .filter(i -> faker().random().nextBoolean());

  }

}
