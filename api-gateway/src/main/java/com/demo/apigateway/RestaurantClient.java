package com.demo.apigateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("restaurant-service")
interface RestaurantClient {

  @GetMapping("/restaurants")
  @CrossOrigin
  CollectionModel<Restaurant> readRestaurants();
}
