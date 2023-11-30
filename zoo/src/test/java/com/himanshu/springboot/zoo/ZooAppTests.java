package com.himanshu.springboot.zoo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZooAppTests {

  @Autowired private Zoo zoo;

  @Test
  void contextLoads() {
    assertNotNull(zoo);
    assertFalse(zoo.animals().isEmpty());
    assertFalse(zoo.birds().isEmpty());
  }
}
