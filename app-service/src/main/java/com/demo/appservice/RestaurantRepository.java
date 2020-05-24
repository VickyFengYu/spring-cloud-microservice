package com.demo.appservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface RestaurantRepository extends JpaRepository<Restaurant, Long> {}
