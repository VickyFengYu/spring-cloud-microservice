package com.demo.apigateway;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class FiveStarRestaurantController {

  private final RestaurantClient restaurantClient;

  public FiveStarRestaurantController(RestaurantClient restaurantClient) {
    this.restaurantClient = restaurantClient;
  }

  private Collection<Restaurant> fallback() {
    return new ArrayList<>();
  }

  @GetMapping("/five-star-restaurant")
  @CrossOrigin
  @HystrixCommand(fallbackMethod = "fallback")
  public Collection<Restaurant> goodCars() {
    return restaurantClient.readRestaurants().getContent().stream()
        .filter(this::isFiveStar)
        .collect(Collectors.toList());
  }

  private boolean isFiveStar(Restaurant restaurant) {
    return !restaurant.getName().equalsIgnoreCase("Armani Hotel Dubai")
        && !restaurant.getName().equalsIgnoreCase("Belmond Charleston Place")
        && !restaurant.getName().equalsIgnoreCase("Ciragan Palace Kempinski Istanbul");
  }
}
