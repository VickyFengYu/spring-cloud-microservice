package com.demo.appservice;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
class Restaurant {
  @Id
  @GeneratedValue
  private Long id;

  @NonNull private String name;
}
