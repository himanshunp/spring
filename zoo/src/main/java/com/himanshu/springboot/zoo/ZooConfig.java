package com.himanshu.springboot.zoo;

import com.himanshu.springboot.animal.Animal;
import com.himanshu.springboot.animal.AnimalConfig;
import com.himanshu.springboot.birds.Bird;
import com.himanshu.springboot.birds.BirdConfig;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration(proxyBeanMethods = false)
@Import({AnimalConfig.class, BirdConfig.class})
public class ZooConfig {

  @Bean
  public Zoo zoo(Animal lion, Animal tiger, Bird kingfisher, Bird flamingo) {
    return new Zoo(List.of(lion, tiger), List.of(kingfisher, flamingo));
  }
}
