package com.demo.appservice;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.stream.Stream;

@EnableDiscoveryClient
@SpringBootApplication
public class AppServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(AppServiceApplication.class, args);
  }

  @Configuration
  static class OktaOAuth2WebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http.authorizeRequests().anyRequest().authenticated().and().oauth2ResourceServer().jwt();
    }
  }

  @Bean
  ApplicationRunner init(RestaurantRepository repository) {
    return args -> {
      Stream.of(
              "Armani Hotel Dubai",
              "Baur au Lac",
              "Bellagio",
              "Belmond Charleston Place",
              "Belmond Copacabana Palace",
              "Carlisle Bay",
              "Ciragan Palace Kempinski Istanbul",
              "Claridges")
          .forEach(
              name -> {
                Restaurant restaurant = new Restaurant();
                restaurant.setName(name);
                repository.save(restaurant);
              });
      repository.findAll().forEach(System.out::println);
    };
  }
}
