package com.himanshu.springboot.birds;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class BirdConfig {
  @Bean
  public Bird kingfisher() {
    return new Bird("kingfisher", 2);
  }

  @Bean
  public Bird flamingo() {
    return new Bird("flamingo", 2);
  }
}
