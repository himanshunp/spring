package com.himanshu.springboot.animal;

import com.himanshu.springboot.animal.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class AnimalConfig {
  @Bean
  public Animal lion() {
    return new Animal("lion", 4);
  }

  @Bean
  public Animal tiger() {
    return new Animal("tiger", 4);
  }
}
